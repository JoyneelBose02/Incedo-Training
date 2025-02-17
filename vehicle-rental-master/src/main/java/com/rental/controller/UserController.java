package com.rental.controller;

import com.rental.entity.User;
import com.rental.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpSession;
import java.util.Optional;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // Show login page
    @GetMapping("/login")
    public String showLoginForm() {
        return "userLogin";
    }

    // Process login and store session
    @PostMapping("/login")
    public String loginUser(@RequestParam String email, @RequestParam String password, Model model, HttpSession session) {
        Optional<User> userOptional = userService.getUserByEmail(email);
        if (userOptional.isEmpty()) {
            model.addAttribute("error", "Email not registered!");
            return "userLogin";
        }

        Optional<User> user = userService.loginUser(email, password);
        if (user.isPresent()) {
            session.setAttribute("user", user.get());
            return "redirect:/home";
        } else {
            model.addAttribute("error", "Invalid credentials");
            return "userLogin";
        }
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user, Model model) {
        if (userService.getUserByEmail(user.getEmail()).isPresent()) {
            model.addAttribute("error", "Email already exists!");
            model.addAttribute("user", user);
            return "userRegister";
        }

        try {
            userService.registerUser(user);
            return "redirect:/user/login";
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
            model.addAttribute("user", user);
            return "userRegister";
        }
    }

    // Show registration page
    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "userRegister";
    }

    
    
    // Logout and remove session
    @GetMapping("/logout")
    public String logoutUser(HttpSession session) {
        session.invalidate(); // Invalidate session on logout
        return "redirect:/";
    }
    
    @GetMapping("/forgot-password")
    public String showForgotPasswordPage() {
        return "forgotPassword"; // Renders forgot-password.jsp
    }

    // Process forgot password request
    @PostMapping("/forgot-password")
    public String processForgotPassword(@RequestParam String email, Model model) {
        Optional<User> userOptional = userService.getUserByEmail(email);
        if (userOptional.isPresent()) {
            model.addAttribute("email", email);
            return "resetPassword"; // Redirect to reset password page
        } else {
            model.addAttribute("error", "Email not found!");
            return "forgotPassword";
        }
    }

    // Show reset password page
    @GetMapping("/reset-password")
    public String showResetPasswordPage(@RequestParam String email, Model model) {
        model.addAttribute("email", email);
        return "resetPassword"; // Renders reset-password.jsp
    }

    // Process password reset
    @PostMapping("/reset-password")
    public String resetPassword(@RequestParam String email,
                                @RequestParam String newPassword,
                                Model model) {
        Optional<User> userOptional = userService.getUserByEmail(email);
        if (userOptional.isPresent()) {
            userService.updatePassword(email, newPassword);
            model.addAttribute("success", "Password reset successfully! You can now login.");
            return "userLogin";
        } else {
            model.addAttribute("error", "Error resetting password!");
            return "resetPassword";
        }
    }
}


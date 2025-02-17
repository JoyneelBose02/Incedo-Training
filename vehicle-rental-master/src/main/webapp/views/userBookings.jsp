<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>My Bookings</title>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600&display=swap');

        body {
            font-family: 'Poppins', sans-serif;
            background: linear-gradient(135deg, #e0f7fa, #f3e5f5); /* Sky blue to pastel violet */
            color: #1a1a2e;
            display: flex;
            flex-direction: column;
            align-items: center;
            padding: 2rem;
            margin: 0;
        }

        .container {
            background: #ffffff; /* White container */
            padding: 2.5rem;
            border-radius: 12px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.1); /* Softer shadow */
            text-align: center;
            width: 90%;
            max-width: 800px;
            margin-bottom: 2rem;
            animation: fadeIn 0.8s ease-in-out; /* Add fade-in animation */
        }

        h2 {
            font-size: 22px;
            font-weight: 600;
            color: #1a1a2e;
            margin-bottom: 15px;
            border-bottom: 2px solid #9c27b0; /* Violet underline */
            padding-bottom: 5px;
        }

        .booking-card {
            background: #f3e5f5; /* Light violet background for cards */
            padding: 1.5rem; /* Increased padding */
            border-radius: 8px;
            margin-bottom: 1rem;
            text-align: left;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.05); /* Subtle card shadow */
            transition: transform 0.2s ease; /* Add transition for hover effect */
        }

        .booking-card:hover {
            transform: translateY(-5px); /* Move card up slightly on hover */
        }


        .booking-card p {
            margin-bottom: 0.5rem; /* Spacing between details */
        }

        .booking-card strong {
            font-weight: 600; /* Make labels slightly bolder */
        }

        .cancel-button {
            padding: 10px 16px; /* Adjusted padding */
            font-size: 14px;
            font-weight: 500;
            color: #ffffff;
            background: linear-gradient(135deg, #9c27b0, #6a1b9a); /* Violet gradient */
            border: none;
            border-radius: 8px;
            cursor: pointer;
            transition: transform 0.2s ease, background 0.3s ease; /* Add transitions */
            margin-top: 10px; /* Add some top margin */
        }

        .cancel-button:hover {
            background: linear-gradient(135deg, #6a1b9a, #4a148c); /* Darker violet on hover */
            transform: scale(1.05); /* Scale on hover */
        }

        @keyframes fadeIn {
            from {
                opacity: 0;
                transform: translateY(-20px);
            }
            to {
                opacity: 1;
                transform: translateY(0);
            }
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>My Bookings</h2>
        <c:forEach var="booking" items="${bookings}">
            <div class="booking-card">
                <p><strong>Booking ID:</strong> ${booking.id}</p>
                <p><strong>Vehicle:</strong> ${booking.vehicle.vehicleName}</p>
                <p><strong>Duration:</strong> ${booking.duration} hours</p>
                <p><strong>Total Cost:</strong> $${booking.bookingPrice}</p>
                <p><strong>Status:</strong> ${booking.bookingStatus}</p>
                <c:if test="${booking.bookingStatus == 'Confirmed'}">
                    <form action="${pageContext.request.contextPath}/payment/cancel" method="post">
                        <input type="hidden" name="bookingId" value="${booking.id}">
                        <button type="submit" class="cancel-button">Cancel Booking</button>
                    </form>
                </c:if>
            </div>
        </c:forEach>
    </div>
</body>
</html>
package dbConnect;
import java.util.*;
public class CrudOps {
	Scanner sc = new Scanner(System.in);
	public void create() {
		CreateEmployee createEmp = new CreateEmployee();
		System.out.println("Enter Table Name: ");
		String tableName = sc.nextLine();
		createEmp.createTable(tableName);
	}
	public void insertVal() {
		InsertEmployee insertEmp = new InsertEmployee();
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		System.out.println("Enter Name: ");
		String name = sc.next();
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		System.out.println("Enter Email: ");
		String email = sc.next();
		
		insertEmp.insert(id, name, age, email);
	}
	public void deleteEmp() {
		DeleteEmployee deleteEmp = new DeleteEmployee();
		System.out.println("Enter id to delete: ");
		int id = sc.nextInt();
		deleteEmp.deleteEmp(id);
	}
	public void updateEmp() {
		UpdateEmployee updateEmp = new UpdateEmployee();
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		System.out.println("Enter Name: ");
		String newName = sc.next();
		System.out.println("Enter Age: ");
		int newAge= sc.nextInt();
		System.out.println("Enter Email: ");
		String newMail = sc.nextLine();
		updateEmp.update(id, newName, newAge, newMail);
	}
	public void readEmp() {
		ReadEmployee readEmp = new ReadEmployee();
		System.out.println("Enter The table name you want to read: ");
		String tableName = sc.next();
		readEmp.selectALL(tableName);
	}
}

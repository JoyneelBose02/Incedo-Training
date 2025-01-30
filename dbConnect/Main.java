package dbConnect;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Connecting to database
		ConnectionDB newConn = new ConnectionDB();
		newConn.connect();
		
		//CRUD Operations
		System.out.println("Options: ");
		System.out.println("Create Table: 1 ");
		System.out.println("Insert Into Table: 2 ");
		System.out.println("Read Table: 3 ");
		System.out.println("Delete From Table: 4 ");
		System.out.println("Update From Table: 5 ");
		while(true) {
			System.out.println("Enter your choice: ");
			String choice = sc.next();
			if(choice.equalsIgnoreCase("End")) {
				System.out.println("Operations Completed");
				break;
			}
			CrudOps crud = new CrudOps();
			switch(choice) {
			case "1":
				crud.create();
				System.out.println();
				break;
			case "2":
				crud.insertVal();
				System.out.println();
				break;
			case "3":
				crud.readEmp();
				System.out.println();
				break;
			case "4":
				crud.deleteEmp();
				System.out.println();
				break;
			case "5":
				crud.updateEmp();
				System.out.println();
				break;
			default:
				System.out.println("Enter Valid Operation");
			}
				
		}
		sc.close();
		
	}
}

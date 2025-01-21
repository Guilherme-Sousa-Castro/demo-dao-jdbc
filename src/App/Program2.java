package App;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		DepartmentDao department = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Insert Department =====");
		System.out.println("Inser a id and a name");
		int id = sc.nextInt();
		String name = sc.next();
		Department newDep = new Department(id, name);
		department.insert(newDep);
		System.out.println("Inserted! New id: " + newDep.getId() + " and name: " + newDep.getName());
		
		
		System.out.println("=== TEST 2: Find by Id Department =====");
		Department dep = department.findById(2);
		System.out.println(dep);
		
		
		System.out.println("=== TEST 3: Update Department =====");
		dep = department.findById(6);
		dep.setName("Gaming");
		department.update(dep);
		System.out.println("Update complete");
		
		System.out.println("=== TEST 4: Delete by id Department =====");
		System.out.println("Select a department do delete");
		System.out.print("Enter id: ");
		id = sc.nextInt();
		department.deleteById(id);
		System.out.println("Deleted complete");
		
		System.out.println("\n === TEST 3: seller findAll =====");
		List <Department> list = department.findAll();
		
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		
		
		
		sc.close();
		
	}
	
	
	
	
}

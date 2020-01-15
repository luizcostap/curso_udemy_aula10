package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;


public class ProgramExercicioFixacao2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		
		System.out.println("How many employees will be registred?");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n ; i++) {
			System.out.println();
			System.out.println("Employee #"+i);
			
			System.out.println("Id:");
			int id = sc.nextInt();
			
			System.out.println("Name:");
			String name= sc.nextLine();
			
			sc.nextLine();
			System.out.println("Salary");
			double salary = sc.nextDouble();
			
			list.add(new Employee(id,name,salary));
		}
		
		System.out.println();
		System.out.println("Enter the emploeed id that will have salary increase");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
		
			System.out.println("Enter the porcentage");
			double percetage = sc.nextDouble();
			emp.increaseSalary(percetage);
			
		}
		
		System.out.println();
		System.out.println("List of empoyees:");
		for(Employee obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}

}

package entities;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;
	
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public void setId(Integer id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}
	
	public void  increaseSalary(double percentage) {
		 salary += salary * percentage /100 ;
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
	
}

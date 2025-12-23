package EmployeeManager;


	class Manager extends Employee {
	    double bonus = 5000;

	    public static void main(String[] args) {
	        Manager m = new Manager();
	        double totalSalary = m.salary + m.bonus;

	        System.out.println("Salary: " + m.salary);
	        System.out.println("Bonus: " + m.bonus);
	        System.out.println("Total Salary: " + totalSalary);
	    }
	}



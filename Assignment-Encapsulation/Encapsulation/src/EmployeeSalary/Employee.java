package EmployeeSalary;

class Employee {
    private int empId;
    private double salary;

    public void setSalary(double salary) {
        if (salary > 0)
            this.salary = salary;
    }

    public void displaySalary() {
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setSalary(30000);
        e.displaySalary();
    }
}


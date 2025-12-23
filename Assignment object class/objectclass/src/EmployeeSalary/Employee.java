package EmployeeSalary;

class Employee {
    int empId;
    String empName;
    double salary;

    Employee() {
        empId = 101;
        empName = "Ravi";
        salary = 30000;
    }

    void display() {
        System.out.println(empId + " " + empName + " " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
    }
}

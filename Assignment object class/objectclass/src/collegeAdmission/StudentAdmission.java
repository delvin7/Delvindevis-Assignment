package collegeAdmission;

class StudentAdmission {
    String admissionType;

    StudentAdmission() {
        admissionType = "General Admission";
    }

    StudentAdmission(int marks) {
        admissionType = "Merit Admission";
    }

    void display() {
        System.out.println(admissionType);
    }

    public static void main(String[] args) {
        new StudentAdmission().display();
        new StudentAdmission(90).display();
    }
}

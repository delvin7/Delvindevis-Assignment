package Admission;

class Admission {
    private int marks;
    private String grade;

    public void setMarks(int marks) {
        this.marks = marks;
        if (marks >= 80)
            grade = "A";
        else if (marks >= 60)
            grade = "B";
        else
            grade = "C";
    }

    public static void main(String[] args) {
        Admission a = new Admission();
        a.setMarks(85);
        System.out.println("Grade: " + a.grade);
    }
}


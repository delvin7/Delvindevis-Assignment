package BookDetails;
class Book {
    int id;
    String title;

    Book() {
        id = 1;
        title = "Java Basics";
    }

    Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    void display() {
        System.out.println(id + " " + title);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book(2, "Advanced Java");
        b1.display();
        b2.display();
    }
}


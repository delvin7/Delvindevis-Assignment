package LibraryBookSystem;

class LibraryBook {
    int bookId;
    String title, author;
    boolean available;

    LibraryBook(int id, String t, String a, boolean avail) {
        bookId = id;
        title = t;
        author = a;
        available = avail;
    }

    boolean isAvailable() {
        return available;
    }

    public static void main(String[] args) {
        LibraryBook b = new LibraryBook(1, "Java", "James", true);
        System.out.println(b.isAvailable());
    }
}


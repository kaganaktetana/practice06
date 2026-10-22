package semester1.practice06;

public class Task_03 {
    public static void main(String[] args) {
        Book emptyBook = new Book();

        System.out.println(emptyBook.title);
        System.out.println(emptyBook.author);
        System.out.println(emptyBook.pages);
        System.out.println(emptyBook.isRead);
    }
}

class Book {
    public String title;
    public String author;
    public int pages;
    public boolean isRead;
}
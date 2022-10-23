package E05;

public class Book {
    String title;
    String author;

    public Book() {
        this("NULL", "NULL");
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title) {
        this(title, "Je ne sais pas. reellement");
    }

    public static void main(String[] args) {
        Book livre = new Book();
        System.out.println(livre.title);
        System.out.println(livre.author);

        Book aimer = new Book("Papillon", "Bernard Werber");
        System.out.println(aimer.title);
        System.out.println(aimer.author);

        Book jeNeSaisPas = new Book("ABC est bout");
        System.out.println(jeNeSaisPas.title);
        System.out.println(jeNeSaisPas.author);
    }
}

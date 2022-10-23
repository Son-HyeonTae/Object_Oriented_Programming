package E04;

public class Book {
    String title;
    String author;

    public Book () {
        title = "Le Petit Prince";
        author = "Saint-Exupery";
    }

    public Book (String t, String a) {
        title = t;
        author = a;
    }

    public static void main(String[] args) {
        Book livre = new Book();
        System.out.println(livre.title);
        System.out.println(livre.author);

        Book aimer = new Book("Papillon", "Bernard Werber");
        System.out.println(aimer.title);
        System.out.println(aimer.author);
    }
}

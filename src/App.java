public class App {
    public static void main(String[] args) {
        System.out.println("Home Work-12 (Library reference");
        Author pushkin = new Author("Pushkin", "Alexandr");
        System.out.print("Автор -" + pushkin.getLastName());
        System.out.println(" " + pushkin.getFirstName());
        Author tolstoi = new Author("Tolstoi", "Lion");
        System.out.print("Автор -" + tolstoi.getLastName());
        System.out.println(" " + tolstoi.getFirstName());


        Book fairyTales = new Book("Fairy tales", pushkin, 1830);
        System.out.println(fairyTales.getTitle() + " " + fairyTales.getAuthor() + " " + pushkin.getFirstName() + " " + fairyTales.getPublicationYear());
        Book warAndPeace = new Book("War and Peace", tolstoi, 1863);
        warAndPeace.setPublicationYear(1869);
        System.out.println(warAndPeace.getTitle() + " " + warAndPeace.getAuthor() + " " + tolstoi.getFirstName() + " " + warAndPeace.getPublicationYear());
    }
}
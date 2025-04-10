//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author charlotteBronte = new Author("Charlotte", "Bronte");

        Author fyodorDostoevsky = new Author("Fyodor", "Dostoevsky");

        Book janeEyre = new Book("Jane Eyre", charlotteBronte, 1847);
        System.out.println(janeEyre.getBookTitle());
        System.out.println(janeEyre.getAuthor().getFirstName() + " " + janeEyre.getAuthor().getLastName());
        System.out.println(janeEyre.getPublicationYear());

        Book crimeAndPunishment = new Book("Crime and Punishment", fyodorDostoevsky, 1865);
        System.out.println(crimeAndPunishment.getBookTitle());
        System.out.println(crimeAndPunishment.getAuthor().getFirstName() + " " + crimeAndPunishment.getAuthor().getLastName());
        System.out.println(crimeAndPunishment.getPublicationYear());
        crimeAndPunishment.setPublicationYear(1866);
        System.out.println(crimeAndPunishment.getPublicationYear());

        System.out.println(janeEyre);
        System.out.println(crimeAndPunishment);
        System.out.println(janeEyre.equals(crimeAndPunishment));

    }
}
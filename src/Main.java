//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author charlotteBronte = new Author("Charlotte", "Bronte");

        Author fyodorDostoevsky = new Author("Fyodor", "Dostoevsky");

        Book janeEyre = new Book("Jane Eyre", charlotteBronte, 1847);
        System.out.println(janeEyre.getBookTitle());
        System.out.println(janeEyre.getNameOfAuthor().getFirstName() + " " + janeEyre.getNameOfAuthor().getLastName());
        System.out.println(janeEyre.getPublicationYear());

        Book crimeAndPunishment = new Book("Crime and Punishment", fyodorDostoevsky, 1865);
        System.out.println(crimeAndPunishment.getBookTitle());
        System.out.println(crimeAndPunishment.getNameOfAuthor().getFirstName() + " " + crimeAndPunishment.getNameOfAuthor().getLastName());
        System.out.println(crimeAndPunishment.getPublicationYear());
        crimeAndPunishment.setPublicationYear(1866);
        System.out.println(crimeAndPunishment.getPublicationYear());

    }
}
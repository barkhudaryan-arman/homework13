public class Main {
    public static void main(String[] args) {
        Author author = new Author("Alexander", "Pushkin");
        System.out.println("Имя автора " + author.getName());
        System.out.println("Фамилия автора " + author.getLastName());
        Author author1 = new Author("Lev", "Tolstoy");
        System.out.println("Имя автора " + author1.getName());
        System.out.println("Фамилия автора " + author1.getLastName());
        Book book = new Book("Captain's daughter",author, 1836);
        System.out.println("Название книги " + book.getName() + " автор " + book.getAuthor() + " год выпуска: " + book.getYear());
        Book book1 = new Book("War and Peace",author1, 1867);
        System.out.println("Название книги " + book1.getName() + " автор " + book1.getAuthor() + " год выпуска: " + book1.getYear());
        book.setYear(2024);
        System.out.println("Название книги " + book.getName() + " автор " + book.getAuthor() + " год выпуска: " + book.getYear());
    }
}
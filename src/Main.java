//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static class Book {
        String title;
        String author;
        int date;

        public Book(String title, String author, int date) {
            this.title = title;
            this.author = author;
            this.date = date;
        }

        public String getTitle() {
            return this.title;
        }

        public String getAuthor() {
            return this.author;
        }

        public int getDate() {
            return this.date;
        }

        public void setDate(int date) {
            this.date = date;
        }
    }

    public static class Author {
        String name;
        String surname;

        public Author(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }
        public String getName() {
            return this.name;
        }

    public String getSurname() {
        return this.surname;
    }
    }

    public static void main(String[] args) {
        Author author = new Author("Joan", "Rouling");
        Author author1 = new Author("Lev", "Tolstoy");
        System.out.println("Имя  " + author.getName());
        System.out.println("Фамилия " + author.getSurname());
        System.out.println("Имя  " + author1.getName());
        System.out.println("Фамилия " + author1.getSurname());
        Book book = new Book("Harry Potter", "Joan Rouling", 1997);
        System.out.println("Название книги = " + book.getTitle());
        System.out.println("Автор = " + book.getAuthor());
        System.out.println("Дата написания произведения =" + book.getDate());
        book.setDate(1999);
        System.out.println("Измененная дата = " + book.getDate());
        Book book1 = new Book("War and Peace", "Lev Tolstoy", 1873);
        System.out.println("Название книги = " + book1.getTitle());
        System.out.println("Автор = " + book1.getAuthor());
        System.out.println("Дата написания произведения =" + book1.getDate());
        book1.setDate(1875);
        System.out.println("Измененная дата = " + book1.getDate());
    }


}



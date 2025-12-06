//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static class Book {
        Author author;
        String title;
        int date;

        public Book(String title, Author author, int date) {
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
}


public class Book {
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

        public Author getAuthor() {
            return this.author;
        }

        public int getDate() {
            return this.date;
        }

        public void setDate(int date) {
            this.date = date;
        }
    }


public class App {
        public static void main(String[] args) {
            Author author = new Author("Joan", "Rouling");
            Author author1 = new Author("Lev", "Tolstoy");
            Book book = new Book("Harry Potter", author, 1997);
            System.out.println("Название книги = " + book.getTitle());
            System.out.println("Автор = " + book.getAuthor());
            System.out.println("Дата написания произведения =" + book.getDate());
            book.setDate(1999);
            System.out.println("Измененная дата = " + book.getDate());
            Book book1 = new Book("War and Peace", author1, 1873);
            System.out.println("Название книги = " + book1.getTitle());
            System.out.println("Автор = " + book1.getAuthor());
            System.out.println("Дата написания произведения =" + book1.getDate());
            book1.setDate(1875);
            System.out.println("Измененная дата = " + book1.getDate());
        }

    }



import java.io.*;
import java.util.*;

public class BookDA {
    private ArrayList<Book> bookList;

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    BookDA() throws IOException{
        bookList = new ArrayList<Book>();
        File file = new File("Book.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int i;
        String[] value;
        Book book;

        while ((i = fileReader.read()) != -1) {
            value = bufferedReader.readLine().split(",");
            book = new Book(value[0], value[1]);
            bookList.add(book);
        }
    }
}
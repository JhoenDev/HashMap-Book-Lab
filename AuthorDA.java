import java.io.*;
import java.util.*;

public class AuthorDA {
    private ArrayList<Author> authorList;

    public ArrayList<Author> getAuthorList() {
        return authorList;
    }

    AuthorDA() throws IOException{
        authorList = new ArrayList<Author>();
        File file = new File("Author.csv");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        int i;
        String[] value;
        Author author;

        while ((i = fileReader.read()) != -1) {
            value = bufferedReader.readLine().split(",");
            author = new Author(value[0], value[1]);
            authorList.add(author);
        }
    }
}
import java.io.FileNotFoundException;
import java.io.FileReader;  
public class Main26 {
    static void openFile() throws FileNotFoundException {
        FileReader reader = new FileReader("data.txt");
    }
    public static void main(String[] args) {
        try {
            openFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
    
}

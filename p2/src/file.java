import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class file {
    public static void main(String[] args) {
        try {
            File f=new File("f.txt");

            if(f.exists()){
                f.createNewFile();
            }
            PrintWriter pw=new PrintWriter(f);
            pw.println("Hello World");

            pw.close();
            System.out.println("done");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
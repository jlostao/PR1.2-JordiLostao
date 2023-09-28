import java.io.*;


public class PR121Files {
    public static void main(String args[]) {
        File folder = new File("./myFiles");
        if (folder.mkdir()) {
            System.out.println("The folder has been created succesfully.");
        } else {
            System.out.println("The folder has not been created.");
        }

        
    }
}

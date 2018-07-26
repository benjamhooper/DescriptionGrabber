import java.io.File;

public class multiFiles {

    public static void main(String args[]) {
        File folder = new File("files/");
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }
}

// import java.util.*;
import java.io.*;
// import java.io.File;
public class FilesFolderExample {
    
    public static int[] getNumberOfFilesandFolder(File path){
        int[] count = new int[2];
        File[] files = path.listFiles();

        if(files != null){
            for(File f : files){
                if(f.isFile()){
                    count[0]++;
                }
                else if(f.isDirectory()){
                    count[1]++;
                    int[] temp = getNumberOfFilesandFolder(f);
                    count[0] += temp[0];
                    count[1] += temp[1];
                }
            }
        }
        return count;
    }
    
    public static void main(String[] args) throws Exception {
        // String path = "C:\Users\gaura\OneDrive\Desktop\coding\Java\xyz.txt";
        File file = new File("C:\\Users\\gaura\\OneDrive\\Desktop\\coding\\Java");
        // file.createNewFile();
        System.out.println(file.getPath());
        if(file.exists()){
            int[] count = getNumberOfFilesandFolder(file);
            System.out.println("Total number of files in given path are = " + count[0]);
            System.out.println("Total number of folders in given path are = " + count[1]);
        } else {
            System.out.println("Path does not exists");
        }
    }
}

import java.io.*;
public class FilesExample {
    public static void main(String[] args) throws Exception {
        File f = new File("abc.txt");
        // System.out.println(f.createNewFile());
        // System.out.println(.getPath());
        // System.out.println(f.exists());
        // System.out.println(f.getCanonicalPath());
        // System.out.println(f.getAbsolutePath());
        // System.out.println(f.canRead());
        // System.out.println(f.canWrite());
        // System.out.println(f.isDirectory());
        // System.out.println(f.isFile());
        // System.out.println(f.isHidden());
        // System.out.println(f.lastModified());
        // System.out.println(f.length());
        File[] arr = f.listFiles();
        for(File file : arr){
            if(file.isFile()){
                System.out.println(file.getName());
            }
        }
    }
}

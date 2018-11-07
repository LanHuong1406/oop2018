package week9;

import java.io.*;

public class Utils {
    public static void readContentFromFile(String path){
        String s = "";
        File file = new File(path);
        if (!file.exists()){
            System.out.println("Khong tim thay file!!!");
        }
        try {
            FileReader reader = new FileReader(path);
            BufferedReader in = new BufferedReader(reader);
            while ((s = in.readLine()) != null){
                System.out.println(s);
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeContentToFile(String path){
        try {
            FileWriter file = new FileWriter(path);
            PrintWriter out = new PrintWriter(file);
            String s = "Hello xin chao ban...";
            out.println(s);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(String path){
        try {
            FileWriter file = new FileWriter(path ,true);
            PrintWriter out = new PrintWriter(file);
            String s = "\nKhong xoa cuoi file";
            String s1 = "\nKhong xoa";
            out.write(s);
            out.write(s1);

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static File findFileByName(String folderPath, String fileName){
        File file = new File(folderPath);
        for (File f: file.listFiles()) {
            if (f.getName().equals(fileName)) {
                return new File(f.getName());
            }
        }
        return null;
    }

    public static void main(String[] args) {
        readContentFromFile("C:\\baitap\\Week9.txt");
       // writeContentToFile("C:\\baitap\\Week9.txt");
        writeFile("C:\\baitap\\Week9.txt");
        System.out.println(findFileByName("C:\\baitap","Week9.txt"));
    }
}

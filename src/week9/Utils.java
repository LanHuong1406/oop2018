package week9;

import java.io.*;

public class Utils {
    public static String readContentFromFile(String path){
        String s = "";
        String s1 ="";
        File file = new File(path);
        if (!file.exists()){
            return "Khong tim thay file!!!";
        }
        try {
            FileReader reader = new FileReader(path);
            BufferedReader in = new BufferedReader(reader);
            while ((s = in.readLine()) != null){
                s1 += s + "\n";
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s1;
    }

    public static void writeContentToFile(String path){
        File file1 = new File(path);
        if (!file1.exists()){
            System.out.println("khong tim thay file!!!");
        }
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
            out.println();
            out.write(s1);
            out.println();

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
        System.out.println(readContentFromFile("C:\\baitap\\Week9.txt"));
        writeContentToFile("C:\\baitap\\Week9.txt");
        writeFile("C:\\baitap\\Week9.txt");
       System.out.println(findFileByName("C:\\baitap","Week.txt"));
    }
}

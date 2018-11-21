package week10;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
     static List<String> list = new LinkedList<>();

    public static List<String> getAllFunction(File path){
        int dem1 = 0;
        int dem2 = 0;
        int t1 = 0;
        int t2 = 0;
        String s ="";
        String dong = "";
        String d = "";
        String f = "";
        if (path.exists()){
            try {
                FileInputStream stream = new FileInputStream(path);
                BufferedReader in = new BufferedReader(new InputStreamReader(stream));
                while ((s = in.readLine()) != null){
                    dong += s + "\n";
                }
                System.out.println(dong.substring(0,100));
                String[] d1 = dong.split(" ");

                for (int j = 0 ; j < d1.length; j++ ){
                    if (d1[j].equals("static")){

                        for (int x = 0 ; x <= j ; x++){
                            f += d1[x];
                        }
                        for (int i = f.length() + 1; i < dong.length(); i++ ){
                            if (dong.charAt(i) == '{'){
                                dem1++;
                                if (dem1 == 1){
                                    t1 = i;
                                }
                            }

                            if (dong.charAt(i) == '}'){
                                dem2++;
                                if (dem1 == dem2){
                                    t2 = i;
                                }
                            }

                        }

                        while (dem1 == dem2){
                            list.add(dong.substring(t1 + 1, t2));
                            dem1 = 0;
                            dem2 = 0;
                        }

                    }
                }
                System.out.println(dem1);
                in.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public static String findFunctionByName(String name){
        File file = new File("src/week9/Utils.java");
        if (!file.exists()){
            return "Khong tim thay file...";
        }else {
            try {
                FileInputStream stream = new FileInputStream(file);
                BufferedReader in = new BufferedReader(new InputStreamReader(stream));
                String dong;
                while ((dong = in.readLine()) != null){
                    String[] s = dong.split("\\{");
                    String l = s[0].trim();
                    if (l.contains(name)){
                        return l;
                    }
                }
                in.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "Khong tim thay " + name;
    }

    public static void main(String[] args) {
        List<String> list1  = getAllFunction(new File("src/week9/Utils.java"));
        for (String l : list1){
            System.out.println(l);
        }
        String name = "String readContentFromFile";
        System.out.println("\nTim kiem phuong thuc " + name);
        System.out.println(findFunctionByName(name));
    }

}

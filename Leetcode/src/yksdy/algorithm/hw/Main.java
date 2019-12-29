package yksdy.algorithm.hw;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int[] intarr = new int[100];
        try {
            for (int i = 0; i < str.length(); i++) {
                int x = str.charAt(i) - 'A';
                intarr[x] = intarr[x] + 1;
                
            }
            ArrayList<Demo> list = new ArrayList<Demo>();
            for (int i = 0; i < intarr.length; i++) {
                if (intarr[i] != 0) {
                    char c = (char) (i + 65);
                    list.add(new Demo(c + "", intarr[i]));
                }
            }
            for (int i = 0; i < list.size() - 1; i++) {
                for (int j = i + 1; j < list.size(); j++) {
                    Demo di = list.get(i);
                    Demo dj = list.get(j);
                    
//                    if (di.x < dj.x && di.s.compareTo(dj.s) > 0) {
                    if (di.x < dj.x) {
                        Demo d = new Demo(di.s, di.x);
                        list.remove(i);
                        list.add(i, dj);
                        list.remove(j);
                        list.add(j, d);
                        
                    } else if (di.x == dj.x) {
                        if (di.s.compareTo(dj.s) > 0) {
                            
                            Demo d = new Demo(di.s, di.x);
                            list.remove(i);
                            list.add(i, dj);
                            list.remove(j);
                            list.add(j, d);
                        }
                        
                    }
                }
            }
            for (Demo tempd : list) {
                
                System.out.print(tempd.s + ":" + tempd.x + ";");
            }
            
        } catch (Exception e) {
            System.out.println(str);
            e.printStackTrace();
            
        }
    }
    
    static class Demo {
        int x = 0;
        String s = "";
        
        public Demo(String s, int x) {
            this.x = x;
            this.s = s;
        }
        
        public int getX() {
            return x;
        }
        
        public void setX(int x) {
            this.x = x;
        }
        
        public String getS() {
            return s;
        }
        
        public void setS(String s) {
            this.s = s;
        }
        
    }
//    public static void demo() {
//        TreeSet<String> ts = new TreeSet<String>();
//        for (int i = 0; i < intarr.length; i++) {
//            if (intarr[i] != 0) {
//                char c = (char) (i + 65);
//                ts.add(intarr[i] + "" + c);
//            }
//        }
//        List<String> list = new ArrayList<String>();
//        for (String s : ts) {
//            list.add(s);
//        }
//        for (int i = list.size() - 1; i >= 0; i--) {
//            String temp = list.get(i);
//            int len = temp.length() - 1;
//            System.out.print(temp.charAt(len) + ":" + temp.substring(0, len) + ";");
//        }
//    }
}

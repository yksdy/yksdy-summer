package yksdy.algorithm.demo;

public class Demo2 {
    public static void main(String[] args) {
        test1(1);
        test1(2);
        test1(3);
        test1(4);
        test1(5);
        test1(6);
    }
    
    public static void test1(int x) {
        int num = 0;
        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= x / 2; j++) {
                if ((i + 2 * j) == x) {
                    num++;
                }
            }
        }
        System.out.println(num);
    }
}

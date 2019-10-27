package yksdy.algorithm;

import java.util.HashSet;
import java.util.Set;

public class Demo1 {
    static int num = 0;
    static Set<Abc> set = new HashSet<Abc>();
    
    public static void main(String[] args) {
//        test(1, new Abc(), 0);
//        System.out.println(set.size());
        
        set.clear();
        test(2, new Abc(), 1);
        System.out.println(set.size());
        
//        set.clear();
//        test(3, new Abc(), 0);
//        System.out.println(set.size());
//        
//        set.clear();
//        test(4, new Abc(), 0);
//        System.out.println(set.size());
    }
    
    static void test(int x, Abc abc, int flag) {
        if (x < 0) {
            return;
        }
        if (flag == 1) {
            abc.one++;
        } else if (flag == 2) {
            abc.two++;
        } else if (flag == 3) {
            abc.three++;
        }
        if (x == 0) {
            set.add(abc);
            set.forEach(s -> System.out.print(s + " one = " + s.one + " two = " + s.two + " three = " + s.three));
            System.out.println(" size =" + set.size() + " ");
            abc = new Abc();
            System.out.println(" new abc.one= " + abc.one);
        }
        test(x - 1, abc, 1);
        if (flag == 1) {
            
            abc.one--;
        }
        test(x - 2, abc, 2);
        if (flag == 2) {
            
            abc.two--;
        }
        test(x - 3, abc, 3);
        if (flag == 3) {
            
            abc.three--;
        }
    }
    
    static class Abc {
        int one = 0;
        int two = 0;
        int three = 0;
        
        @Override
        public boolean equals(Object obj) {
            // TODO Auto-generated method stub
            return super.equals(obj);
        }
        
        public boolean equals(Abc obj) {
            return (this.one == obj.one) && (this.two == obj.two) && (this.three == obj.three);
        }
    }
}

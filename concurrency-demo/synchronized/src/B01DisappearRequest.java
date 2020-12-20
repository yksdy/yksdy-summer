
public class B01DisappearRequest  {
    private static MyThread instanc = new MyThread();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(instanc);
        Thread t2 = new Thread(instanc);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(Data.i);

    }
}

class Data{
    static int i = 0;
}

class MyThread implements Runnable{
    @Override
    public void run() {
        for(int x = 0; x<3000; x++ ){
            Data.i++;
        }
    }
}

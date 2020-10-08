
public class A01DisappearRequest implements Runnable{
    private static A01DisappearRequest instanc = new A01DisappearRequest();
    private static int i = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(instanc);
        Thread t2 = new Thread(instanc);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(i);

    }

    @Override
    public void run() {
        for(int x = 0; x<10000; x++ ){
            i++;
        }
    }
}

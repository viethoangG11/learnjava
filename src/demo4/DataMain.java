package demo4;

public class DataMain {
    public static void main(String[] args) {
        Data d = new Data();
        Runnable r = () -> {
            for (int i = 0; i < 20; i++) {
                //    synchronized (d) {
                d.change();
                d.print();
                //  }
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        //  t1.start();
        //t2.start();

        Thread tr1 = new Thread(()->{
            for (int i=0;i<4;i++){
                System.out.println("Tao tk: "+i);
                try {
                    Thread.sleep(1000);
                }catch (Exception e){
                }
            }
        });
        Thread tr2 = new Thread(()->{
            for (int i=0;i<5;i++){
                System.out.println("ATM: "+i);
                try {
                    Thread.sleep(1000);
                }catch (Exception e){
                }
            }
        });
        Thread tr3 = new Thread(()->{
            for (int i=0;i<5;i++){
                System.out.println("Deposit: "+i);
                try {
                    Thread.sleep(1000);
                }catch (Exception e){
                }
            }
        });
        tr1.start();
        try {
            tr1.join();
        }catch (Exception e){
        }
        tr2.start();
        tr3.start();

    }
}

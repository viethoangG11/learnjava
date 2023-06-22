package jv2.demo3;

public class Main {
    public static void main(String[] args){
        // sub thread
        SubThread st1 = new SubThread();
        st1.start();

        // sub runnable
        SubRun sr1 = new SubRun();
        Thread st2 = new Thread(sr1);
        st2.start();

        // 1 line
//        new SubThread().start();
//        new Thread(new SubRun()).start();

        // functional interface -> lambda expression
        Runnable r1 = ()->{
            for(int i=0;i<20;i++){
                System.out.println("Lambda i ="+i);
                try{
                    Thread.sleep(1000);// 1000 miliseconds
                }catch (Exception e){}
            }
        };

        new Thread(()->{
            for(int i=0;i<20;i++){
                System.out.println("Runnable i ="+i);
                try{
                    Thread.sleep(1000);// 1000 miliseconds
                }catch (Exception e){}
            }
        }).start();


        for(int i=0;i<20;i++){
            System.out.println("Main i ="+i);
            try{
                Thread.sleep(1000);// 1000 miliseconds
            }catch (Exception e){}
        }

    }
}
package jv2.demo3;

public class SubThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println("Sub i ="+i);
            try{
                Thread.sleep(1000);// 1000 miliseconds
            }catch (Exception e){}
        }
    }
}
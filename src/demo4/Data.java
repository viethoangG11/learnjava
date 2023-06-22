package demo4;


public class Data {
    int x = 0;
    int y = 0;
    public void change(){
        x++;
        y++;
    }
    public void print(){
        System.out.println("x="+x);
        System.out.println("y="+y);
    }
}
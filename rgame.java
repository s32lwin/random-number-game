import java.util.Random;

public class rgame{
    public static void main(String[] args) {

        Random r=new Random();

        System.out.println("guess the number ranging from 0 too 100");   

        int x = r.nextInt(100); 

        System.out.println("the number is "+x);
    }
}
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if(sc.nextInt() <= sc.nextInt()){
            System.out.println("unsafe");
        }else{
            System.out.println("safe");
        }
    }

}
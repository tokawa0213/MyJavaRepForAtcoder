import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int count = 0;
        for(int i = 0; i < N-1;i++){
            count += Integer.parseInt(sc.next());
        }
        if(N*M-count > K){
            System.out.println(-1);
        }else{
            if(N*M-count > 0){
                System.out.println(N*M-count);
            }else{
                System.out.println(0);
            }
        }
    }
}
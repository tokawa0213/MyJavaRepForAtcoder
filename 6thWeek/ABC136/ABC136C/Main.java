import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 0; i < N;i++){
            l.add(Integer.parseInt(sc.next()));
        }
        int masu = -1;
        for(Integer e : l){
            if(masu >= e-1){
                masu = e;
            }else{
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        ArrayList<Boolean> dp = new ArrayList<>();
        ArrayList<Integer> inp = new ArrayList<>();
        for(int i =0; i < 1100000 ;i++){
            dp.add(true);
        }
        for(int i =0; i < n ;i++){
            inp.add(Integer.parseInt(sc.next()));
        }
        Collections.sort(inp);
        for(int num : inp){
            if(){
            }else{
                for(int i = 1; i < 1100000/num ;i++){
                    dp.set(num*i, false);
                }
            }
        }
    }
}
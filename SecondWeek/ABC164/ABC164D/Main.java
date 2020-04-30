import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> remainder_mapping = new HashMap<>();
        for(int i = 0;i < 2019;i++){
            remainder_mapping.put(i,0);
        }
        Scanner sc = new Scanner(System.in);
        String target_string = sc.next();
        int remainder = 0;
        int pow_of_ten = 1;
        for(int i = target_string.length()-1 ;i >= 0; i--){
            
        }
        int answer = 0;
        for(int i = 0;i < 2019;i++){
            int candidates = remainder_mapping.get(i);
            if(candidates != 0){
                answer += ((candidates-1)*(candidates))/2;
                if(i == 0){
                    answer += candidates;
                }
            }
        }
        System.out.println(remainder_mapping);
        System.out.println(answer);
    }
}
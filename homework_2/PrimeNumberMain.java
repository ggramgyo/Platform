import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumberMain {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        for(int i = 2; i<= num; i++){
            System.out.println("Prime Numbers less than or equal to " + i + " = " + Arrays.toString(getPrimeNumber(i)));
        }
    }
    private static Integer[] getPrimeNumber(final int n){
        ArrayList<Integer> prime = new ArrayList<Integer>();
        int cnt = 0;
        for(int i = 2; i<= n; i++){
            for(int j = 2; j<i; j++){
                if(i%j == 0){
                    cnt ++;
                }
            }
            if (cnt == 0){
                prime.add(i);
            }
            cnt = 0;
        }
        Integer[] result = new Integer[prime.size()];
        for (int i = 0; i < prime.toArray().length; i++){
            result[i] = prime.get(i).intValue();
        }
        return result;
    }
}

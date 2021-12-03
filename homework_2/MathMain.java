import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MathMain {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = scan.nextInt();
        ArrayList<Integer> inputs = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            int ix = scan.nextInt();
            inputs.add(ix);
        }


        int max = getMax(inputs);
        int min = getMin(inputs);
        Integer[] result = inputs.toArray(new Integer[inputs.size()]);
        System.out.printf("Max element : %d in %s%n",max, Arrays.toString(result));
        System.out.printf("Min element : %d in %s%n",min, Arrays.toString(result));

    }
    private static int getMax(ArrayList<Integer> inputs){
        int max = 0;
        for(int k : inputs){
            if(k > max){
                max = k;
            }
        }
        return max;
    }
    private static int getMin(ArrayList<Integer> inputs){
        int min = 99999;
        for(int k : inputs){
            if(k < min){
                min = k;
            }
        }
        return min;
    }
}

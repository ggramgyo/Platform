import java.util.Arrays;
import java.util.Scanner;
enum Command {ADD,LIST,SRTA,SRTD,SUM,QUIT,INVALID,NOTHING}
public class ArrayEnum {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int []values = new int[101];
        int index = 0;
        while (true) {
            final Command command = getCommand(scan);
            if (command == Command.QUIT) {
                System.out.println("Bye!");
                break;
            }
            switch (command) {
                case ADD:
                    final int newValue = getValue(scan);
                    values[index] = newValue;
                    index ++;
                    break;
                case LIST:
                    printList(values,index);
                    break;
                case SRTA:
                    printList(sort(values,index,"Order.ASC"),index);
                    break;
                case SRTD:
                    printList(sort(values,index,"Order.DESC"),index);
                    break;
                case SUM:
                    int sum = 0;
                    for(int i = 0; i < index; i++){
                        sum += values[i];
                    }
                    System.out.println(sum);
                    break;
                case INVALID:
                    System.out.println("Invalid Command");
                default:
                    System.out.println("Invalid Command");
            }

        }

        scan.close();
    }

    private static Command getCommand(Scanner c) {
        String s_c = c.next().toUpperCase();
        for (Command cmd : Command.values()) {
            if (cmd.name().equals(s_c)) {
                return cmd;
            }
        }
        return Command.NOTHING;
    }
    private static int getValue(Scanner c){
        int num = c.nextInt();
        return num;
    }
    private static void printList(int[] values,int index){
        for(int i = 0; i < index; i++){
            System.out.printf("%d ", values[i]);
        }
        System.out.println();
    }
    private static int[] sort(int[] values,int index,String order) {
        int[] temp = new int[index];
        for(int i =0; i <index; i++){
            temp[i] = values[i];
        }
        Arrays.sort(temp, 0, index);
        if (order.equals("Order.ASC")) {return temp;}

        for(int i = 0; i<(index)/2; i++) {
            int tmp = temp[i];
            temp[i] = temp[index - i-1];
            temp[index - i-1] = tmp;
        }
        return temp;
    }
}

import java.util.Arrays;
import java.util.Scanner;

enum StringCommand {ADD,REMOVE,CLEAN,QUIT,INVALID,SORT,NOTHING}

public class StringSetManager{
    public static void main(String[] args){
        final Scanner scan = new Scanner(System.in);
        String[] stringSet = new String[100];

        while(true) {
            final StringCommand command = getCommand(scan);
            if (command == StringCommand.QUIT) {
                System.out.println("BYE!");
                break;
            }
            switch (command) {
                case ADD: {

                    final String str = getString(scan);
                    add(stringSet, str);
                    printString(stringSet);
                    break;
                }
                case SORT: {
                    final String order = getString(scan);
                    sort(stringSet, order);
                    printString(stringSet);
                    break;
                }
                case REMOVE: {

                    final String str = getString(scan);
                    remove(stringSet, str);
                    printString(stringSet);
                    break;
                }
                case CLEAN: {
                    clean(stringSet);
                    printString(stringSet);
                    break;
                }
                case INVALID:
                    break;
                default:
                    printString(stringSet);
            }

        }

    }
    private static StringCommand getCommand(Scanner scan){
        String cmd = scan.next();
        if(cmd.equals("aDD")){
            return StringCommand.INVALID;
        }
        cmd = cmd.toUpperCase();
        for(StringCommand c : StringCommand.values()){
            if(c.name().equals(cmd)){
                return c;
            }
        }
        return StringCommand.NOTHING;
    }
    private static String getString(Scanner scan){
        String str = scan.next();
        return str;
    }
    private static void add(String[] stringSet, String str){
        for(int i =0; i<stringSet.length; i++){
            if(stringSet[i] == null){
                stringSet[i] = str;
                return;
            }
        }
    }
    private static void onemove(String[] stringSet,int index){

        while(stringSet[index] != null){
            stringSet[index] = stringSet[index+1];
            index ++;
        }

        return;
    }
    private static void remove(String[] stringSet, String str){
        for(int i = 0; i < stringSet.length; i++){
            if(stringSet[i] == null){
                return;
            }
            if(stringSet[i].equals(str)){
                onemove(stringSet,i);
            }
        }

    }
    private static void printString(String[] stringSet){
        int ix = 0,i=0;
        if(stringSet[ix] == null){
            System.out.println("Element Size: 0, Values = []");
            return;
        }
        while(stringSet[i]!=null){
            i++;
        }
        System.out.printf("Element Size: %d, Values = [", i);
        while(ix < i-1){
            System.out.printf("%s, ",stringSet[ix]);
            ix ++;
        }
        System.out.printf("%s]",stringSet[ix]);
        System.out.println();
        return;
    }
    private static void clean(String[] stringSet){
        for(int i = 0; stringSet[i] != null; i++){
            stringSet[i] = null;
        }
        return;
    }
    private static void sort(String[] stringSet, String order){
        int ix = 0;
        while(stringSet[ix]!=null){
            ix++;
        }
        Arrays.sort(stringSet, 0, ix);
        if(order.equals("DESC")) {
            for (int i = 0; i <= (ix) / 2; i++) {
                String tmp = stringSet[i];
                stringSet[i] = stringSet[ix - i - 1];
                stringSet[ix - i - 1] = tmp;
            }
        }
        return;
    }
}
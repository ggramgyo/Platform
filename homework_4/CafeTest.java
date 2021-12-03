import java.util.Scanner;

enum Command {ADD, FIND, CLEAR, LIST, QUIT, INVALID,NOTHING}

public class CafeTest {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        Cafe starbucks = new Cafe("Starbucks");
        while(true){
            final Command cmd = getCommand(scanner);
            if(cmd == Command.QUIT){
                System.out.println("Bye");
                break;
            }
            if(cmd == Command.INVALID){
                System.out.println("Invalid Operation!");
                continue;
            }
            switch (cmd){
                case ADD:{
                    Beverage newBeverage = createBeverage();
                    starbucks.addBeverage(newBeverage);
                    break;
                }
                case FIND:{
                    findBeverage(starbucks);
                    break;
                }
                case CLEAR:{
                    starbucks.removeAllBeverage();
                    break;
                }
                case LIST: {
                    System.out.println(starbucks);
                    break;
                }
                default:
                    System.out.println("Invalid Operation!");
                    break;
            }
        }
    }
    private static void findBeverage(final Cafe cs){
        final String name = scanner.next();
        final String type = scanner.next().toUpperCase();
        final Beverage foundBeverage = cs.findBeverage(name, type);
        if(foundBeverage != null) System.out.println(foundBeverage);
        else System.out.println("Beverage Not Found with name " + name + " and type " + type);
    }
    private static Beverage createBeverage(){
        final String name = scanner.next();
        final String type = scanner.next().toUpperCase();
        return new Beverage(name, type);
    }
    private static Command getCommand(Scanner scanner){
        System.out.printf("Enter Command String! ");
        String cmd = scanner.next().toUpperCase();
        for(Command c : Command.values()){
            if(c.name().equals(cmd)){
                return c;
            }
        }
        return Command.NOTHING;
    }
}

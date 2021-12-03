import java.util.HashMap;
import java.util.Iterator;

public class Cafe {
    private String name;
    private HashMap<String, Beverage>menus = new HashMap<String,Beverage>();
    Cafe(String name){
        this.name = name;

    }
    public void addBeverage(Beverage beverage){
        menus.put(beverage.getBeverageName(), beverage);
    }
    public String toString(){
        String msg = "Cafe Name: " + name + " Beverage Count: " + menus.size() + "\n";
        Iterator<Beverage> values = menus.values().iterator();
        while(values.hasNext()){
            msg += "\t" + values.next() + "\n";
        }
        return msg;
    }

    public Beverage findBeverage(String name, String type) {
        if (!(menus.containsKey(name)))  return null;
        for(Beverage k : menus.values()){

            //System.out.printf("%d,%d",k.hashCode(),menus.get(name).hashCode());
            if(k.hashCode() == menus.get(name).hashCode()){
                return menus.get(name);
            }
        }
        return null;
    }

    public void removeAllBeverage() {
        menus.clear();
    }
}

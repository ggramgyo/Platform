import java.util.Objects;

public class Beverage {
    private String type;
    private String name;

    Beverage(String name, String type){
        this.name = name;
        this.type = type;
    }
    public String getBeverageName(){
        return name;
    }
    public String getBeverageType(){
        return type;
    }
    public int hashCode(){
        int result = 1;
        result = 31*result + Objects.hashCode(name);
        result = 31*result + Objects.hashCode(type);
        return result;
    }
    public String toString(){
        return String.format("[%s, %s]",name,type);
    }
}

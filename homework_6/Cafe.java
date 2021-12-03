package edu.pnu.admin;

import edu.pnu.collection.*;

public class Cafe {
    private String name;
    private GenericList<Beverage> students = new GenericList<Beverage>();

    Cafe(String name){
        this.name = name;
    }
    public void addBeverage(Beverage value){
        students.addBeverage(value);
    }
    public Beverage findBeverage(String name, String type){
        Beverage findthing = new Beverage(name,type);
        for(Object k : students.getData()){
            Beverage kk = (Beverage) k;
            if(kk == null){ continue;}
            if(kk.hashCode() == findthing.hashCode()){
                return kk;
            }
        }
        return null;
    }
    public void removeAllBeverage(){
        students.clear();
    }
    public String toString(){
        String msg = "Cafe Name: " + name + " Beverage Count: " + students.getSize() + "\n";
        for(Object k : students.getData()) {
            if (k != null) {
                Beverage kk = (Beverage) k;
                msg += "\t" + kk + "\n";
            }
        }
        return msg;
    }
}

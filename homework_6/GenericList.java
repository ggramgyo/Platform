package edu.pnu.collection;

import edu.pnu.admin.Beverage;
public class GenericList<T> {
    private static final int DEFAULT_SIZE = 10;
    private Object[] data;
    private int size = 0;

    public GenericList(String a){}
    public GenericList(){
        data = new Object[DEFAULT_SIZE];
    }
    public int getSize(){
        return size;
    }

    public Object[] getData(){
        return data;
    }
    public void addBeverage(Beverage value){
        for(int i = 0; i < size; i++){
            Beverage k = (Beverage) data[i];
            if(k.getBeverageName().equals(value.getBeverageName())){
                data[i] = value;
                return;
            }
        }
        data[size] = value;
        size++;
    }
    public void clear(){
        data = new Object[DEFAULT_SIZE];
        size = 0;
    }


}

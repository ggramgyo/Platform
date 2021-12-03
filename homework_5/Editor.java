package edu.pnu.edit;

import edu.pnu.shape.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Editor {
    private List<Shape> shapes = new ArrayList<>();

    public Editor(){}

    public void add(Shape shape){
        shapes.add(shape);
    }
    public void clear(){
        shapes.clear();
    }
    public void list(){
        Shape[] result = shapes.toArray(new Shape[0]);
        System.out.println(Arrays.toString(result));
    }

}

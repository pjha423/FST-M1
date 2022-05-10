package activities;

import java.util.Arrays;
import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer,String> colors = new HashMap<>();
        colors.put(1,"Red");
        colors.put(2,"Green");
        colors.put(3,"Blue");
        colors.put(4,"Black");
        colors.put(5,"White");

        System.out.println("Remove Green from the list :"+colors.remove(2));
        System.out.println("Green exist? :"+colors.containsValue("Green"));
        System.out.println("Size of the map :"+colors.size());



    }
}

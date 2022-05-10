package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String [] args){
        HashSet<String> hs = new HashSet<>();
        hs.add("object1");
        hs.add("object2");
        hs.add("object3");
        hs.add("object4");
        hs.add("object5");
        hs.add("object6");

        System.out.println("Size of Hashset: " +hs.size());
        System.out.println("Remove element object6 " +hs.remove("object6"));
        System.out.println("Remove element object7 " +hs.remove("object7"));
        System.out.println("Is the object8 present in the set " +hs.contains("object8"));
        for(String s:hs){
            System.out.println(s);
        }


    }

}

package activities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Activity9 {
    public static void main(String [] args){
        ArrayList<String> myList = new ArrayList<>();
        myList.add("name1");
        myList.add("name2");
        myList.add("name3");
        myList.add("name4");
        myList.add("name5");

        for(String s: myList){
            System.out.println(s);
        }
        System.out.println("Name at index 3 :"+myList.get(3));
        System.out.println("Is the list contains name1 :"+myList.contains("name1"));
        System.out.println("total names in the list :"+myList.size());
        System.out.println("Remove name5 from the list :");
        myList.remove("name5");
        System.out.println("total names in the list after removing:"+myList.size());



    }


}

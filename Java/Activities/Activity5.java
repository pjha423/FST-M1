package activities;

abstract class Book{
    String title;
    abstract void setTitle(String str);
    public String getTitle(){
        return title;
    }

}

 class MyBook extends Book {
    public void setTitle(String str) {
        title = str;
    }

}
public class Activity5 {
    public static void main(String [] args){
        MyBook newNovel = new MyBook();
        newNovel.setTitle("Test_Name1");
        System.out.println("Title of the Novel: "+newNovel.getTitle());

    }
}
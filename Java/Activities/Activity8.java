package activities;

class CustomException extends Exception{
    private String message;
    CustomException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}


public class Activity8 {
    public static void main(String [] agrs){
        try {
            Activity8 A8 = new Activity8();
            A8.exceptionTest("Will print to console");
            A8.exceptionTest(null);
        }catch (CustomException ce){
            System.out.println("Inside catch block: " + ce.getMessage());
        }


    }
    public void exceptionTest(String str) throws CustomException{
        if(str == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(str);
        }
    }

}

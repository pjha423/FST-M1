package activities;

public class Activity2 {
    int tempSum;

    public static void main(String[] args) {

        int numToSearch = 10;
        int expectedSum = 30;

        int[] arrOfNum = {10, 77, 10, 54, -11, 10};

        Activity2 obj = new Activity2();
        System.out.println("Result : " +obj.returnResult(arrOfNum,numToSearch,expectedSum));

    }

    public boolean returnResult(int[] nums, int numToSearch,int expectedSum) {
        tempSum = 0;
        for (int i = 0; i <= nums.length-1; i++) {
            if (nums[i] == numToSearch) {
                tempSum = tempSum + numToSearch;
            }
            if (tempSum > expectedSum) {
                break;
            }
        }

        return tempSum == expectedSum;
    }
}





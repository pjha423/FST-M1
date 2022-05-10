package activities;

import java.util.Arrays;

public class Activity4 {
    int i,j;
    int temp;
    public void insertionSort(int[] arrOfNum){
        for(i=1;i<arrOfNum.length;i++){
            temp = arrOfNum[i];
            int j = i-1;
            while(j>=0 && temp<arrOfNum[j]){
                if(temp<arrOfNum[j]){
                    arrOfNum[j+1] = arrOfNum[j];
                    --j;

                }
            }
            arrOfNum[j+1] = temp;
        }

    }

    public static void main(String [] args){
        int [] arrOfNum = {4,2,1,6,5,9,8};
        System.out.println("Array before sort: "+ Arrays.toString(arrOfNum));
        Activity4 obj = new Activity4();
        obj.insertionSort(arrOfNum);
        System.out.println("Array after sort: "+ Arrays.toString(arrOfNum));

    }

}

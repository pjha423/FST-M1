package activities;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.text.FieldPosition;

public class Activity14 {


    public static void main(String [] args) throws IOException {
        File file = new File("C:/Users/0031N4744/Documents/FST-33/newfile.txt");
        boolean fileStatus = file.createNewFile();

        if(fileStatus){
            System.out.println("file created");
        }else {
            System.out.println("File already exists");
        }


        File fileUtil = FileUtils.getFile("C:/Users/0031N4744/Documents/FST-33/newfile.txt");
        String fileData = FileUtils.readFileToString(fileUtil,"UTF8");

        System.out.println("data in file : "+fileData);

        File dir = new File("C:/Users/0031N4744/Documents/FST-33/resources");
        FileUtils.copyFileToDirectory(file,dir);

        //Get file from new directory
        File newFile = FileUtils.getFile(dir,"newfile.txt");

        String newFileData = FileUtils.readFileToString(newFile,"UTF8");
        System.out.println("Data in new file :" +newFileData);


    }
}

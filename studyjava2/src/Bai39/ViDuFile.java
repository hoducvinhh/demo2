package Bai39;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ViDuFile {

    public static void copyAll(File f1 , File f2)
    {
        try{
            // copy ban than no
            Files.copy(f1.toPath(),f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }catch(IOException e)
        {
            e.printStackTrace();
        }

        if(f1.isDirectory())
        {
            // copy cac tap tin va thu muc con
            File[] mangcon = f1.listFiles();
            for (File file : mangcon) {
                File file_new = new File(f2.getAbsolutePath()+"\\" + file.getName());
                copyAll(file, file_new);
            }
        }
    }
    public static void main(String[] args) {
        // File f0 = new File("E:\\java\\studyjava2\\src\\Bai39\\File_1.txt");
        // File f1 = new File("E:\\java\\studyjava2\\src\\Bai39\\File_2.txt");
        //File f2 = new File("E:\\java\\studyjava2\\src\\Bai39\\File_2xyz.txt");

        // 1. thay doi ten tap tin thu muc
        // su dung File de thay doi tem
        // f0.renameTo(f1);

        // su dung Files de thay doi ten

        // try{
        // Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        // }
        // catch(IOException e)
        // {
        // e.printStackTrace();
        // }

        // 2. di chuyen file
        // File f_2new = new
        // File("E:\\java\\studyjava2\\src\\Bai39\\F0\\File_2xyz.txt");
        // try {
        // Files.move(f2.toPath(), f_2new.toPath(),
        // StandardCopyOption.REPLACE_EXISTING);
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        // 3. copy file
         File f_0 = new File("E:\\java\\studyjava2\\src\\Bai39\\F0");
         File f_0_copy = new File("E:\\java\\studyjava2\\src\\Bai39\\F0_copy");

        // try {
        //     Files.copy(f_0.toPath(), f_0_copy.toPath(),StandardCopyOption.REPLACE_EXISTING);
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        ViDuFile.copyAll(f_0, f_0_copy);

    }
}

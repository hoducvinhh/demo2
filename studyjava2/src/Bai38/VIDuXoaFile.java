package Bai38;

import java.io.File;
import java.io.IOException;
//import java.nio.file.FileSystem;
//import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class VIDuXoaFile {

    public static void xoaFile(File fx)
    {
        if(fx.isFile())
        {
            // xoa neu la tap tin
            System.out.println("Da xoa : "+fx.getAbsolutePath());
            fx.delete();
        }
        else if(fx.isDirectory())
        {
            //lay cac file con
            File[] mangcon = fx.listFiles();
            for(File f: mangcon)
            {
                //xoa cac file con
                xoaFile(f);
            }
            // xoa ban than thu muc sau khi da xoa cac file con 
            System.out.println("Da xoa : "+fx.getAbsolutePath());
            fx.delete();
        }
    }
    public static void main(String[] args) {
        File f0 = new File("E:\\java\\studyjava2\\F0");
        File f0_1 = new File("E:\\java\\studyjava2\\F0_1");
        File f_vidu = new File("E:\\java\\studyjava2\\vidu.txt");
        
        //f0.deleteOnExit();
        f0_1.deleteOnExit(); // xoa duoc thu muc rong
        f_vidu.deleteOnExit();// xoa duoc vi la tap tin

        VIDuXoaFile.xoaFile(f0); 


        // su dung class Files xoa tap tin va thu muc
        Path p = f0.toPath();
        Path p0_1 = f0_1.toPath();
        Path p_vidu = f_vidu.toPath();
        try {
            Files.deleteIfExists(p);
            Files.deleteIfExists(p0_1);
            Files.deleteIfExists(p_vidu);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

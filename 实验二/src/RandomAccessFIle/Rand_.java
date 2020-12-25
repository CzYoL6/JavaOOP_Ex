package RandomAccessFIle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Rand_ {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\Readme.txt");

        RandomAccessFile randomAccessFile = new RandomAccessFile(f, "rw");

        randomAccessFile.write("hhhhhhhh\n".getBytes());
        randomAccessFile.write("gggggggggggg\n".getBytes());

        randomAccessFile.seek(0);
        randomAccessFile.readLine();
        String s =randomAccessFile.readLine();

        System.out.println(s);

        randomAccessFile.write("lllllllllll\n".getBytes());
    }
}

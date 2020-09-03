package FileIO;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.*;

/**
 * @ClassName:FilestreamTest
 * @Description:
 * @Author: liuanhai
 * @Date 2020/8/11 0011
 * @Version 1.0
 */
public class FileStreamTest {
    public static void main(String[] args){
        try {
            byte bWrite[] = {11, 21, 3, 40, 5};
            OutputStream os = new FileOutputStream("test.txt");
            for (int x=0; x<bWrite.length; x++){
                os.write(bWrite[x]);
            }
            os.close();

            InputStream is = new FileInputStream("test.txt");

            int size = is.available();

            for (int i=0; i<size; i++){
                System.out.print((char)is.read() + " ");
            }
            is.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
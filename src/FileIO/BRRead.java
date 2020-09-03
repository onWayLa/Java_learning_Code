package FileIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName:BRRead
 * @Description:
 * @Author: liuanhai
 * @Date 2020/8/11 0011
 * @Version 1.0
 */
public class BRRead {
    public static void main(String[] args) throws IOException{
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，请按下'q'键退出");
        // 读取字符
        do{
            c = (char)br.read();
            System.out.println(c);
        }while (c!='q');
    }
}

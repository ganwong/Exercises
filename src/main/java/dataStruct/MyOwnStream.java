package dataStruct;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wong on 16/4/25.
 */
public class MyOwnStream extends FilterInputStream{
    public MyOwnStream(InputStream in){
        super(in);
    }
    public int read() throws IOException{
        int c=0;
        if ((c=super.read())!=-1){
            if (Character.isLowerCase((char) c)) return Character.toUpperCase((char) c);
            else if (Character.isUpperCase((char) c)) return Character.toLowerCase((char) c);
            else return c;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args){
        String s = "";
        String s2 = "|";
        String s3 = "||";
        String s4 = " ";
        System.out.println(s.isEmpty());
        System.out.println(s.split("\\|").length + " " + s2.split("\\|").length + " " + s3.split("\\|").length + " " + s4.split("\\|").length);
        int[] a = {1, 3, 2};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }



}

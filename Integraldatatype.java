import java.lang.*;
import javax.swing.*;
import java.awt.*;

public class Integraldatatype {
    public static void main(String[] args) {
        //to check binary form
        int x=-5;
        System.out.println(Integer.toBinaryString(x));
        char y=0x0370;
        System.out.println(y);
        char z=0x03c8;
        System.out.println(z);{
            for(char c=0x0370; c<=0x03FF;c++)
            System.out.println(c+" ");
        }
        {
            for(char d=0x0900;d<=0x0970;d++)
            System.out.println(d+" ");
        }


    }
    
}

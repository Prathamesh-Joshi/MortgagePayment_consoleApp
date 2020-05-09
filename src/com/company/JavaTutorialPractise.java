package com.company;


import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Logger;


public class JavaTutorialPractise {
        
    public static void javaPractise() {
        //Java tutorial..Java Tutorial for Beginners [2019] https://www.youtube.com/watch?v=eIrMbAQSU34
        byte age = 27;
        byte retirement = 60;
        long viewsVideo = 3_123_456_468_783L;
        float price = 99.99F;
        double priceVariance = 2342.34;
        char initailname = 'P';

        Logger.getLogger("Hello World");
        Logger.getLogger("Long number video views are: " + viewsVideo);
        Logger.getLogger("Price in Float is :"+price);
        //casting + arithmetic operation

        byte ageToRetirement = (byte) (retirement - age);
        Logger.getLogger("Age to retirement is : " + ageToRetirement);
        //% is remainder of division
        double div = (double) (retirement - age) / age;
        Logger.getLogger("Division is : " + div);
        double mod = (double) retirement % age;
        Logger.getLogger("mod is:" + mod);
        //constant

        final float pi = 3.14156F;

        //Derived datatype
        String name = "Prathamesh" + "!!";
        Date now = new Date();
        now.getTime();
        Logger.getLogger("current date:" + now);
        String utc = new Date().toGMTString();
        printBoolResult(name.startsWith("P"));
        printBoolResult(name.startsWith("a", 2));
        Logger.getLogger("current UTC date:" + utc);

        //POinter
        Point point1 = new Point(1, 3);
        Point point2 = point1;
        System.out.println(point1);
        point1.x = 392;
        System.out.println(point2);
        String path = "C:\\Windows\\..";
        String esacapeSequences = "Name\tnew line \n";


        Integer[] array1 = new Integer[5];
        for (int n = 0; n < 5; n++) {
            array1[n] = n * (n - 1) / 2;
        }
        printResult(array1);
        //Arrays class can be used for better methods

        Logger.getLogger(Arrays.toString(array1));

        int[] array2 = {2, 58, 6, 46, 86, 56};
        printResult(array2.length);
        Arrays.sort(array2);
        Logger.getLogger(Arrays.toString(array2));

//Matrix row,columns
        int[][] matrix = new int[2][3];
        matrix[0][0] = 2;
        matrix[0][2] = 5;
        matrix[1][1] = 8;
        Logger.getLogger(Arrays.deepToString(matrix));

        int[][] matrix2 = {{1, 2, 8}, {2, 5, 3}};
        Logger.getLogger(Arrays.deepToString(matrix2));
//incremental operator by 1
        int y ;
        int f = 3;
        printF(f);
        f++;
        printF(f);
        ++f;
        printF(f);
        y = f++;
        printF(f);
        printF(y);
//Augmented/compound assignment operator
        y = y + 2;
        printY( y);
        y += 2;
//same as y=y+2;
        printY( y);
        y -= 2;
        printY( y);
        y *= 2;
        printY( y);
        y /= 2;
        printY( y);

//Implicit casting
        //byte > short > int > long > float > double
        short asda = 3;
        int sfs = asda + 4; //short implicit casted to int
        printResult(sfs);
        double u = 2.1;
        //int ssf=u+4; //failed to complile so explicit caring has to be  done
        int ssf = (int) u + 4;
        printResult(ssf);
//casting happend between same wrapper class datatypes
        //else Parsing has to be done
        String num1 = "1233.21";
        Double numw1 = Double.parseDouble(num1) + 3;//parsing example
        printResult(numw1);


        int numw1w = (int) Double.parseDouble(num1) + 3;
        printResult(numw1w);
        //math class
        int result = Math.round(6.7687F);
        printResult(result);
        result=(int) Math.ceil(6.7687F);//next int
        printResult(result);

        result = (int) Math.floor(6.7687F);//prev int
        printResult(result);

        result = (int) Math.max(6565156222.7687F, 5657767.8);
        printResult(result);
        result = (int) Math.min(684.7687F, 5657767.8);
        printResult(result);
        double result1 = Math.random();//double between 0 an 1
        printResult(result1);
        result = (int) Math.round(Math.random() * 100);//long casted to int
        printResult(result);

//NumberFormat can't be instantiated ..Its abstract class
        //can be used to format number ,string,date,currency
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String c1 = currency.format(213123123.123);
        Logger.getLogger(c1);

        //NumberFormat percent=NumberFormat.getPercentInstance();
        //method chaining
        String perceresult = NumberFormat.getPercentInstance().format(0.25424);
        Logger.getLogger(perceresult);

//User input via Scanner
        Scanner scanner = new Scanner(System.in);
        Logger.getLogger("Your age is : ");
        byte age1 = Byte.parseByte(scanner.nextLine().trim());
        Logger.getLogger("You are :" + age1);
        Logger.getLogger("Your Message is : ");

        String message12 = scanner.nextLine().trim();
        Logger.getLogger("message :" + message12);
        scanner.close();

//1:30:37

    }
    static String resultIs="Result is :";
        public static void printF(int F) {
              String   f1= Integer.toString(F);
        Logger.getLogger("f is " + f1); }
        public static void printY(int Y) {
                String   y1= Integer.toString(Y);
          Logger.getLogger("y is " + y1); }
          public static void printResult(Integer result){
                String  result1=Integer.toString(result);
                printResults(resultIs+result1);
        }
        public static void printResult(Integer[] result){

                String  result1[] = Arrays.stream(result).map(String::valueOf)
                .toArray(String[]::new);
                printResults(Arrays.toString(result1));
        }
        public static void printResult(Double result){
                String  result1=Double.toString(result);
                printResults(resultIs+result1);
        }
        public static void printResults(String result){
               
                Logger.getLogger(resultIs+result);
        }
        public static void printBoolResult(boolean tf){
                if (tf){ System.out.println("True");}
                else { System.out.println("Flase");}
                
        }
}

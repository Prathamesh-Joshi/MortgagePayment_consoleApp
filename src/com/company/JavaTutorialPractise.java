package com.company;


import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class JavaTutorialPractise {
	
	public static void JavaPractise() {
		//Java tutorial..Java Tutorial for Beginners [2019] https://www.youtube.com/watch?v=eIrMbAQSU34
	   byte age=25;
       byte retirement=60;
       long viewsVideo=3_123_456_468_783L;
       float price=99.99F;
       double PriceVariance=2342.34;
       char initailname='P';

       System.out.println("Hello World");


       //casting + arithmetic operation

       byte ageToRetirement = (byte) (retirement-age);
       System.out.println("Age to retirement is : "+ageToRetirement);
       //% is remainder of division
       double div=(double) (retirement-age)/age;
       System.out.println(div);
       double mod=(double) retirement%age;
       System.out.println(mod);
       //constant

       final float pi=3.14156F;

       //Derived datatype
       String name="Prathamesh"+"!!";
       Date now =new Date();
       now.getTime();
       System.out.println(now);
       String utc=new Date().toGMTString();
       System.out.println(name.startsWith("P"));
       System.out.println(utc);
       
      //POinter
       Point point1 =new Point(1,3);
       Point point2 =point1;
       System.out.println(point1);
       point1.x=392;
       System.out.println(point2);
       String path="C:\\Windows\\..";
       String esacapeSequences ="Name\tnew line \n";


       int[] array1=new int[5];
       for (int n=0;n<5;n++){
           array1[n]=n*(n-1)/2;
       }
       System.out.println(array1);
       //Arrays class can be used for better methods

       System.out.println(Arrays.toString(array1));

       int[] array2={2,58,6,46,86,56};
       System.out.println(array2.length);
       Arrays.sort(array2);
       System.out.println(Arrays.toString(array2));

//Matrix row,columns
       int[][] matrix=new int[2][3];
       matrix[0][0]=2;
       matrix[0][2]=5;
       matrix[1][1]=8;
       System.out.println(Arrays.deepToString(matrix));

       int[][] matrix2={{1,2,8},{2,5,3}};
       System.out.println(Arrays.deepToString(matrix2));
//incremental operator by 1
       int y=2;
       int f=3;
       System.out.println("f is "+f);
       f++;
       System.out.println("f is "+f);
       ++f;
       System.out.println("f is "+f);
       y=f++;
       System.out.println("y is :"+y);
//Augmented/compound assignment operator
       y=y+2;
       System.out.println("y is :"+y);
       y+=2;//same as y=y+2;
       System.out.println("y is :"+y);
       y-=2;
       System.out.println("y is :"+y);
       y*=2;
       System.out.println("y is :"+y);
       y/=2;
       System.out.println("y is :"+y);

//Implicit casting
       //byte > short > int > long > float > double
       short asda=3;
       int sfs=asda+4; //short implicit casted to int
       System.out.println(sfs);
       double u=2.1;
       //int ssf=u+4; //failed to complile so explicit caring has to be  done
       int ssf=(int)u+4;
       System.out.println(ssf);
//casting happend between same wrapper class datatypes
       //else Parsing has to be done
       String num1="1233.21";
       Double numw1= Double.parseDouble(num1)+3;//parsing example
       System.out.println(numw1);


       int numw1w= (int) Double.parseDouble(num1)+3;
       System.out.println(numw1w);
    //math class
       int result=Math.round(6.7687F);
       System.out.println(result);
        result=(int) Math.ceil(6.7687F);//next int
       System.out.println(result);

       result=(int) Math.floor(6.7687F);//prev int
       System.out.println(result);

       result=(int) Math.max(6565156222.7687F,5657767.8);
       System.out.println(result);
       result=(int) Math.min(684.7687F,5657767.8);
       System.out.println(result);
      double result1=Math.random();//double between 0 an 1
       System.out.println(result1);
       result=(int) Math.round(Math.random()*100);//long casted to int
       System.out.println(result);

//NumberFormat can't be instantiated ..Its abstract class
       //can be used to format number ,string,date,currency
       NumberFormat currency=NumberFormat.getCurrencyInstance();
      String c1= currency.format(213123123.123);
       System.out.println(c1);

       //NumberFormat percent=NumberFormat.getPercentInstance();
        //method chaining
       String perceresult = NumberFormat.getPercentInstance().format(0.25424);
       System.out.println(perceresult);

//User input via Scanner
       Scanner scanner =new Scanner(System.in);
       System.out.print("Your age is : ");
      byte age1=Byte.parseByte(scanner.nextLine().trim());
       System.out.println("You are :"+age1);
       System.out.println("Your Message is : ");

       String message12 = scanner.nextLine().trim();
       System.out.println("message :"+message12);

//1:30:37

}
}

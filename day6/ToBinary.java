package day6;
import java.lang.*;

import java.util.*;

import java.io.*;

import functionalPrograms.*;
public class ToBinary extends Utility {
	   // function to convert decimal to binary
    static String decToBinary(int n)
    {
      
        int[] binaryNum = new int[1000];
   
     
        int i = 0;
        while (n > 0) 
        {
           
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
         String str ="";
        for (int j = i - 1; j >= 0; j--)
      str=str+binaryNum[j];
        int L=8;
        String result =String.format("%" + L + "s", str).replace(' ', '0');
        		
        System.out.println(result);
		return result;
    }
   
      
    // driver program
    public static void main (String[] args) 
    {
        int n =getValue() ;
      String result=  decToBinary(n);
      System.out.println(result);
    }
}



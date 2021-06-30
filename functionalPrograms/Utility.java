package functionalPrograms;

import java.io.PrintWriter;
import java.util.Scanner;

public class Utility {
	public static Scanner sc = new Scanner(System.in);
	public static int getValue() {
		// TODO Auto-generated method stub
		
		int num=sc.nextInt();
		return num ;
	}

	

	public static Double getDouble() {
		// TODO Auto-generated method stub
		double d=sc.nextDouble();
		return d;
	}

	public Boolean getBoolean() {
		// TODO Auto-generated method stub
	boolean b=sc.hasNextBoolean();
		return b;
	}
	
	public <T> void print2DArray(T[][] inputArray, int rows, int columns) {
		PrintWriter printwriter = new PrintWriter(System.out);
		// TODO Auto-generated method stub
		for (int i =0;i<rows;i++)
		{
			for (int j =0;j<columns;j++)
			{ 
				printwriter.write(inputArray[i][j]+" ");
				printwriter.flush();
				//System.out.print(inputArray[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	int[] getArray(int size) {
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=getValue();
		}
		return arr;
	}
void printArray(int [] arr,int size) {
	int count=0;
	
	for(int i=0;i<size-2;i++)
	{
		String str="";
		for(int j=i+1;j<size-1;j++) {
			{
				for(int k=j+1;k<size;k++) {
					if(arr[i]+arr[j]+arr[k]==0) {
						count++;
						str=arr[i]+" "+arr[j]+" "+arr[k];
						System.out.println(str);
					}
				}
			}
		}
	}
	System.out.println(count);
}
}

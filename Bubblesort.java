

import java.util.Scanner;

public class Bubblesort {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size");
	   int x=sc.nextInt();
       int[]a=new int[x];
       System.out.println("enter array element");
       for(int i=0;i<a.length;i++){
    	   a[i]=sc.nextInt();
       }
       int temp;
       for(int i=0;i<a.length;i++){
    	   for(int j=1;j<a.length;j++){
    		   if(a[j-1]>a[j]){
    			 temp=a[j-1]; 
    			 a[j-1]=a[j];
    			 a[j]=temp;
    		   }
    	   }
       }
       for (int y : a) {
		System.out.print(" "+y);
	}

}
}

package rakesh;
import java.util.Scanner;  
public class Starpatter {

	public static void main(String[] args) {
		int i, j, k, n;  
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");  
		n = sc.nextInt();              
		for (i= 0; i<= n-1 ; i++)  
		{  
		for (j=0; j<i; j++)  
		{  
		System.out.print(" ");  
		}  
		for (k=i; k<=n-1; k++)   
		{   
		System.out.print("*" + " ");   
		}   
		System.out.println("");   
		}   
		
		for (i= 1; i<= n; i++)  
		{  
		for (j=n; j>i; j--)  
		{  
		System.out.print(" ");  
		}  
		for (k=1; k<=i; k++)  
		{  
		System.out.print("*" + " ");  
		}  
		System.out.println();
		}
		
	}
	}



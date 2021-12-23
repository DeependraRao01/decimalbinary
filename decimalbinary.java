package geeksternew;
import java.util.Scanner;

public class decimalbinary {
	
	
		public static void main(String args[])
		{   
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a Decimal number : ");
			int deci = sc.nextInt();
			int binary[] = new int[20];
			int i = 0; 
			while(deci > 0)
			{       
				int r = deci % 2;
				binary[i++] = r;
				deci = deci/2;
			}
			System.out.print("Binary number is : ");
			for(int j = i-1 ; j >= 0 ; j--)
			System.out.print(binary[j]+" ");
			
		}
	} 



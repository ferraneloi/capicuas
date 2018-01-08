package capicuas;

import java.util.Scanner;

public class Capicua {
	
	public static void imprimirarray(int[] array, int num)
	{		
		for (int i=0;i<num;i++)
		{
		System.out.println(array[i]);
		}
		
	}

	public static boolean palindrome(int numero)
	{
		boolean iguals=true;
		int i=0;
		
	
		String s = String.valueOf(numero);
		
		while ( iguals &&  i<((s.length())/2) )
			{
			 if (s.charAt(i) != s.charAt(s.length()-1-i ))
			 	iguals = false;
			 i++;
			}
		
		return iguals; 
	}
	
	
	public static void main(String[] args) {
		int numeros;
		Scanner sc=new Scanner(System.in);		
		numeros=sc.nextInt();
        int[] arraynums=new int[numeros];
		
		for (int i=0;i<numeros;i++){
		 arraynums[i]=sc.nextInt(); }

		for (int i=0;i<numeros;i++){
			 if (palindrome(arraynums[i]))
			      System.out.println("SI");
			 else System.out.println("NO");
		}
	}

}

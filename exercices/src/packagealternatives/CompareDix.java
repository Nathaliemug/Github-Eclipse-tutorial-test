package packagealternatives;

import java.util.Scanner;

public class CompareDix {

	public static void main(String[] args) {
		int a, b;
		System.out.println("entrez a  : ");
		a = new Scanner(System.in).nextInt();
		System.out.println("entrez b : ");
		b = new Scanner(System.in).nextInt();
		
		
		if(a >= 10 && b>=10)
		{
			System.out.println("la somme des 2 nombres : a+b=  : " + a + "+" + b + "=" + (a+b));
		}
		if(a < 10 && b<10)
		{
			System.out.println(" le produit : a*b=  : " + a + "*" + b + "=" + (a*b));
		}
		
		
		if(a >= 10 || b>=10)
		{
			if(a>b)
			{
				System.out.println(" la différence entre le plus grand et le plus petit  : " + a + "-" + b + "=" + (a-b));
			}
			else
			{
				System.out.println("la différence entre le plus petit et le plus grand n'est pas acceptable");
			}
			
		}

	}

}

package packagealternatives;

import java.util.Scanner;

public class Operation {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int choix, nb1, nb2;

		System.out.println("Entrez votre choix : ");

		System.out.println("1.addition ");

		System.out.println("2.soustraction  ");

		System.out.println("3.multiplication  ");

		System.out.println("4.division ");

		choix = new Scanner(System.in).nextInt();

		System.out.println("Entrez le 1er nombre : ");
		nb1 = new Scanner(System.in).nextInt();
		
		System.out.println("Entrez le 2eme nombre : ");
		nb2 = new Scanner(System.in).nextInt();

		switch(choix)
		{
		case 1 : 
			System.out.println("addition : " + (nb1+nb2));
			break;
		case 2 :
			System.out.println("soustraction : " + (nb1-nb2));
			break;
		case 3 : 
			System.out.println("multiplication : " + (nb1*nb2));
			break;
		case 4 : 

			if(nb2 ==0)
			{
				System.out.println("division impossible ");
			}
			else
			{
				System.out.println("division : " + (nb1/nb2));
			}

			break;


		}

	}

}

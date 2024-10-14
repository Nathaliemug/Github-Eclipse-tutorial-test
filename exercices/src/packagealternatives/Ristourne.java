package packagealternatives;

import java.util.Scanner;

public class Ristourne {

	public static void main(String[] args) {
		double montant;
		int nbEnfant;
		System.out.println("Quelle est le montant de vos achats ?");
		montant = new Scanner(System.in).nextDouble();
		System.out.println("Combien d'enfants avez-vous ?");
		nbEnfant = new Scanner(System.in).nextInt();


		if(montant>50 && nbEnfant>=3)
		{
			System.out.println("la ristourne est de : " + montant*10/100);

			if(montant>100)
			{
				System.out.println("la ristourne est de : " + montant*10/100);
			}
		}
		else 
		{
			System.out.println("la ristourne est de : " + montant*5/100);
		}
	}

}

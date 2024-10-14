package packagealternatives;

import java.util.Scanner;

public class Amende {

	public static void main(String[] args) {
		int limitationVit, vitesse, excesVit;
		System.out.println("Quelle est la limitation de vitesse ?");
		limitationVit = new Scanner(System.in).nextInt();
		System.out.println("Quelle est votre vitesse ?");
		vitesse = new Scanner(System.in).nextInt();
		
		
		excesVit = vitesse - limitationVit;
		
		if(excesVit>0 && excesVit<=20)
		{
			System.out.println("Amende de 50 €");
			
		}

		if(excesVit>20 && excesVit<=30)
		{
			System.out.println("Amende de 100 €"  );
		}
		
		if(excesVit>30 && excesVit<=50)
		{
			System.out.println("Amende de 200 €"  );
		}
		
		if(excesVit>50)
		{
			System.out.println( "Retrait de permis"  );
		}

	}

}

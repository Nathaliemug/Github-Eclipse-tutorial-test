package packagealternatives;

import java.util.Scanner;

public class DecomposeArgent {

	public static void main(String[] args) {

		int somme, nbillet, reste, npiece;
		System.out.println("entrez une somme d'argent : ");
		somme = new Scanner(System.in).nextInt();

		if(somme>=500)
		{
			reste = somme % 500;
			nbillet = (somme - reste)/500;
			System.out.println(nbillet + " billet de 500");
			
			somme = reste;

			if(somme >=200)
			{
				reste = somme % 200;
				nbillet = (somme - reste)/200;
				System.out.println(nbillet + " billet de 200");
				
				somme = reste;
			}
			if(somme >=100)
			{
				reste = somme % 100;
				nbillet = (somme - reste)/100;
				System.out.println(nbillet + " billet de 100");
				somme = reste;
			}
			if(somme >=50)
			{
				reste = somme % 50;
				nbillet = (somme - reste)/50;
				System.out.println(nbillet + " billet de 50");
				
				somme = reste;
			}
			if(somme >=20)
			{
				reste = somme % 20;
				nbillet = (somme - reste)/20;
				System.out.println(nbillet + " billet de 20");
				
				somme = reste;
			}
			if(somme >=10)
			{
				reste = somme % 10;
				nbillet = (somme - reste)/10;
				System.out.println(nbillet + " billet de 10");
				
				somme = reste;
			}
			if(somme >=5)
			{
				reste = somme % 5;
				nbillet = (somme - reste)/5;
				System.out.println(nbillet + "billet de 5");
				
				somme = reste;
			}
			if(somme >=2)
			{
				reste = somme % 2;
				npiece = (somme - reste)/2;
				System.out.println(npiece + " pièce de 2 centime");
				
				somme = reste;
			}
			if(somme >=1)
			{
				reste = somme % 1;
				npiece = (somme - reste)/1;
				System.out.println(npiece + " pièce de 1 centime");
				
				somme = reste;
			}
		}

	}

}

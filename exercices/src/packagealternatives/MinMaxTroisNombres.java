package packagealternatives;

import java.util.Scanner;

public class MinMaxTroisNombres {

	public static void main(String[] args) {
		int nb1, nb2, nb3, pp, pg;
		System.out.println("Entrez 1er nombres :");
		nb1 = new Scanner(System.in).nextInt();
		System.out.println("Entrez 2ème nombres :");
		nb2 = new Scanner(System.in).nextInt();
		System.out.println("Entrez 3ème nombres :");
		nb3 = new Scanner(System.in).nextInt();
		
		
		pg = nb1;
		pp = nb1;
		
		if(nb2<pp)
		{
		    pp = nb2;
		}
		if(nb3<pp)
		{
		    pp = nb3;
		}
		
		if(nb2>pg)
		{
		    pg = nb2;
		}
		if(nb3>pg)
		{
		    pg = nb3;
		}
		
		System.out.println("Le plus petit nombre est  :" + pp);
		System.out.println("Le plus grand nombre est :" + pg);
	
	}

}

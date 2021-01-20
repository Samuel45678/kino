import java.util.Scanner;

public class Main {
	
	
	public static void main(String[] args) 
	{
		for(boolean repete = true;repete == true;)
		{
		int volba = 0;
		
		System.out.println("Zadaj aku Operaciu chces vykonat:");
		System.out.println("1) Scitanie");
		System.out.println("2) Odcitanie");
		System.out.println("3) Kratenie");
		System.out.println("4) Delenie");
		System.out.println("5) Priemer");
		Scanner scanner = new Scanner(System.in);
		while(volba < 1 || volba > 5)
		{
			System.out.println("Zadaj cele cislo od 1 po 5!");
			volba = scanner.nextInt();
			
		}
		
		if (volba == 1)
		{
			System.out.println("Zadaj kolko cisel chces scitat");
			int pocet = 0;
			pocet = scanner.nextInt();
			double cisla[] = new double[pocet];
			double vysledok = 0;
			for (int i = 0; i < pocet; i++)
			{
				int o = 1 + i;
				System.out.println("Zadaj " + o + "-te cislo");
				cisla[i] = scanner.nextDouble();
				vysledok += cisla[i];
				
			}
			System.out.println("Vysledok sa rovna: " + vysledok);
		}
		else if(volba == 2)
		{
			System.out.println("Zadaj menšenec");
			double mensenec = scanner.nextDouble();
			System.out.println("Zadaj kolko mensitelov chces odcitat");
			int pocet = 0;
			pocet = scanner.nextInt();
			double cisla[] = new double[pocet];
			double vysledok = mensenec;
			for (int i = 0; i < pocet; i++)
			{
				int o = 1 + i;
				System.out.println("Zadaj " + o + "-te cislo");
				System.out.print(" - ");
				cisla[i] = scanner.nextDouble();
				vysledok -= cisla[i];
				
			}
			System.out.println("Vysledok sa rovna: " + vysledok);
			
		}
		else if(volba == 3)
		{
			System.out.println("Zadaj kolko cisel chces nasobit:");
			int pocet = 0;
			pocet = scanner.nextInt();
			double cisla[] = new double[pocet];
			double vysledok = 1;
			for (int i = 0; i < pocet; i++)
			{
				int o = 1 + i;
				System.out.println("Zadaj " + o + "-te cislo");
				cisla[i] = scanner.nextDouble();
				vysledok *= cisla[i];
				
			}
			System.out.println("Vysledok sa rovna: " + vysledok);
			
		}
		else if(volba == 4)
		{
			System.out.println("Zadaj Delenca");
			double delenec = scanner.nextDouble();
			System.out.println("Zadaj kolko delitelov chces pouzit?");
			int pocet = 0;
			pocet = scanner.nextInt();
			double cisla[] = new double[pocet];
			double vysledok = delenec;
			for (int i = 0; i < pocet; i++)
			{
				int o = 1 + i;
				System.out.println("Zadaj " + o + "-te cislo");
				cisla[i] = scanner.nextDouble();
				vysledok /= cisla[i];
				
			}
			System.out.println("Vysledok sa rovna: " + vysledok);
		}
		else 
		{
			System.out.println("Zadaj kolko cisel zpriemerovat:");
			int pocet = 0;
			pocet = scanner.nextInt();
			double cisla[] = new double[pocet];
			double vysledok = 0;
			for (int i = 0; i < pocet; i++)
			{
				int o = 1 + i;
				System.out.println("Zadaj " + o + "-te cislo");
				cisla[i] = scanner.nextDouble();
				vysledok += cisla[i];
				
			}
			vysledok /= pocet;
			System.out.println("Vysledok sa rovna: " + vysledok);
		}
		
		System.out.println("Chces pocitat dalsi priklad alebo ukoncit program??");
		System.out.println("Ano, chcem pocitat = 1; Nie, chcem skoncit = 0");
		if(scanner.nextInt() == 0)
			repete = false;
		}
	}

}

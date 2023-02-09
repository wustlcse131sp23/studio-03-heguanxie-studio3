package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("n = ?");
		int n = in.nextInt();
		boolean [] primeNumbers = new boolean[n];
		for (int i = 0; i < n; i ++)
		{
			primeNumbers [i] = true;
		}
		for (int factor = 2; factor < n ; factor++)
		{
			for (int multiple = factor + factor; multiple < n; multiple+=factor )
			{
				primeNumbers[multiple] = false;	
			}
		}
		for (int i = 1; i < n; i++)
		{
			System.out.println(primeNumbers[i]);
			if (primeNumbers[i] = true)
				System.out.println(i);
		}
	}

}

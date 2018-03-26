package practice;

import java.util.Scanner;

public class Uri {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		double a, cnt = 0, sum = 0;
		while(cin.hasNext()) {
			if((a = cin.nextDouble()) >= 0 && a <= 10) {
				cnt++;
				sum += a;
				if(cnt == 2) {
					sum /= 2;
					System.out.printf("media = %.2f\n",sum);
					do {
						a = cin.nextDouble();
						if(a == 2) {
							System.out.println("novo calculo (1-sim 2-nao)");
							return;
						}
						else System.out.println("novo calculo (1-sim 2-nao)");
						sum = cnt = 0;
					}while(a != 1);
				}
			}
			else {
				System.out.println("nota invalida");
			}	
		}
	}
}

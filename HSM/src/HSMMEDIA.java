import java.util.Scanner;

public class HSMMEDIA {

		public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);

				double n1, n2, n3, n4, mediaBim1 = 0;
				double n_1, n_2, n_3, n_4, mediaBim2 = 0;
				double mediasemestral = 0;


			System.out.println("Digite as 4 notas do primeiro bimestre:");
			n1 = teclado.nextDouble();
			n2 = teclado.nextDouble();
			n3 = teclado.nextDouble();
			n4 = teclado.nextDouble();

			mediaBim1 = ((n1*3)+(n2*3)+(n3*2)+(n4*2))/4;
			System.out.println("mediaBim1 = " + mediaBim1);


			System.out.println("Digite as 4 notas do segundo bimestre:");
			n_1 = teclado.nextDouble();
			n_2 = teclado.nextDouble();
			n_3 = teclado.nextDouble();
			n_4 = teclado.nextDouble();

			mediaBim2 = ((n_1*3)+(n_2*3)+(n_3*2)+(n_4*2))/4;
			System.out.println("mediaBim2 = " + mediaBim2);


			mediasemestral = (mediaBim1 + mediaBim2)/2;
			System.out.println("mediasemestral = " +mediasemestral);

			if(mediasemestral >=8) {
				System.out.println("Você foi aprovado");
			} else {
				System.out.println("Você foi reprovado");
				
			}


				}

			}

				
		


	

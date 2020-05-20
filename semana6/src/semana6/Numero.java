package semana6;
import java.util.Scanner;
public class Numero {

	public static void main(String[] args) {
	
			 int num;
			 Scanner scan=new Scanner(System.in);
			 System.out.print("Introduzca un número: ");
			 num=scan.nextInt();
			 while(num!=0)
			 {
			 if(num<0)
			 System.out.println("Negativo");
			 else
			 System.out.println("Positivo");
			 
			 System.out.print("Introduzca un número: ");
			 num=scan.nextInt();
			 }
			
	}

}

import java.util.Scanner;
// Класс для запуска калькулятора. Підтримує ввід користувача.
public class InteractRunner{
	
	public static void main(String[] arg){
		Scanner reader = new Scanner(System.in);
		try{
			CalcClass calc = new CalcClass();
			String exit = "no";
			while (!exit.equals("yes")){
				System.out.println("Enter first arg : ");
				String first = reader.next();
				System.out.println("Enter second arg : ");
				String second = reader.next();
				calc.cleanResult();
				System.out.println("Exit? : yes / no ");
				exit = reader.next();
			}
		}
		finally{
			reader.close();
		}
	}
}
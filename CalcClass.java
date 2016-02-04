/*
Реализация Калюкулятора через классы
*/
public class CalcClass {
	// Результат обчислення
	private int result;
	// Сумуемо аргументи @param params - аргументи сумування
	public void add( int ... params){
		for (Integer param : params){
			this.result += param;
		}
	}
	// Отримати результат @result обчислення
	public int getResult(){
		return this.result;
	}
	// Очистити результат сумування
	public void cleanResult(){
		this.result = 0;
	}
}
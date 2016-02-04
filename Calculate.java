public class Calculate {
	public static void main(String[] arg){
		System.out.println("Calculate is running");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[2]);
		String operation = arg[1];
		int reasalts = 0;
		System.out.println("operation is " + operation);
		if(operation.equals("+")) { reasalts = first + second;
		System.out.println(first + " " + operation + " " + second + " = "  + reasalts);}
		if(operation.equals("-")) { reasalts = first - second;
		System.out.println(first + " " + operation + " " + second + " = "  + reasalts);}
		if(operation.equals("*")) { reasalts = first * second;
		System.out.println(first + " " + operation + " " + second + " = "  + reasalts);}
		if(operation.equals("/")) { reasalts = first / second;
		System.out.println(first + " " + operation + " " + second + " = "  + reasalts);}
		//System.out.println("Nothing work ((");
	}
}
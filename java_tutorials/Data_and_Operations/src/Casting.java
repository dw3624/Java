
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;
		double c = (double) 1;
		System.out.println(c); // 1.0
		
		// int d = 1.1;
		double e = 1.1;
		int f = (int) 1.1;
		System.out.println(f); // 1
		
		// 1 to String
		String g = Integer.toString(1);
		System.out.println(g.getClass()); // class java.lang.String
	}

}

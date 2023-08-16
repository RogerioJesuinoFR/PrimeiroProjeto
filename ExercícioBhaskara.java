package aula01;

public class ExercícioBhaskara {

	public static void main(String[] args) {
		
		double x1;
		double x2;
		int a = 1;
		int b = -3;
		int c = -54;
		
		x1 = (-b + Math.sqrt((b * b) - (4 * a * c))) / (2*a);
		x2 = (-b - Math.sqrt((b * b) - (4 * a * c))) / (2*a);
		
		System.out.println("Os valores de x1 e x2 sao respectivamente: (" + x1 + ", " + x2 + ")");
	}
}

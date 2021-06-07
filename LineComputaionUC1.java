public class LineComputationUC1 {
		public static void main(String args[]) {
		System.out.println("Welcome To Line Computaion");
		Scanner sc = new Scanner(System.in);
		int x1= sc.nextInt();
		int y1= sc.nextInt();
		int x2= sc.nextInt();
		int y2= sc.nextInt();
		
		double length = Math.sqrt(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
				System.out.println("Lenght of the line is: "+length);
		}
	}

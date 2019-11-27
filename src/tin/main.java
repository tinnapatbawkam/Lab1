package tin;

public class main {

	public static void main(String[] args) {
		int a, b, c = 2;
		double gpa = 3.50;
		String firstName = "BossNa";
		
		System.out.println("Hello My Name is " + firstName);
		
		for(int i=0; i<10; i++)
			if(i % 2 == 0)
			System.out.println("Hello, " + i);
			//System.out.print(c);
		
		int[] numbers = {1, 1, 2, 3, 5};
		int[] even = new int[20];
		String[] fruits = {"banana", "apple", "melon", "orange"};
		

		String tel = "053-211-122";
		String[] sp = tel.split("-");
		System.out.println("("+sp[0]+")"+sp[1]);

	}

}

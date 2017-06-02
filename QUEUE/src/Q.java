
public class Q {

	public static void main(String[] args) {

		Subclass sc = new Subclass();

		sc.push(5);
		sc.push(7);
		sc.push(6);
	//	sc.push(6);
		

		System.out.println("abc");
		System.out.println(sc.pop());
		

		System.out.println(sc.pop());
		System.out.println(sc.peek() + "peek value");

		System.out.println(sc.pop());

		System.out.println(sc.peek() + " another peek value");

		
		System.out.println(sc.isEmpty());

	}

}

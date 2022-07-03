
public class Dog {
	String name = "Buksi";
	int age = 2;
	private int size;
	public int getSize() { // lehetővé teszem a get-el hogy elérhető és a másoltatát meg tudják ragadni
		return size;
	}

	public void setSize(int s) {// a set segitségével pedig meg lehet változtatni arra mire szerenténk
		size = s;
	}

	void bark() {
		System.out.println(name + ": Vau vau");
	}
}

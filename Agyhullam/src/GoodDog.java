public class GoodDog {

	private int size;// a size változóhoz nem férhet hozzá senki

	public int getSize() { // lehetővé teszem a get-el hogy elérhető és a másoltatát meg tudják ragadni
		return size;
	}

	public void setSize(int s) {// a set segitségével pedig meg lehet változtatni arra mire szerenténk
		size = s;
	}
	

	void bark() {
		if (size > 60) {
			System.out.println("Woof! Woof!");
		} else if (size > 14) {
			System.out.println("Ruff! Ruff!");
		} else {
			System.out.println("Yip! Yip!");
		}
		
	}
	

}


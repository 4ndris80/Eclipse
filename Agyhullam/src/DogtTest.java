
public class DogtTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Bart";

		Dog[] myDogs = new Dog[3];
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;

		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";

		System.out.println("The last Dog's name is: " + myDogs[2].name);

		int x = 0;
		while (x < myDogs.length) {
			myDogs[x].bark();
			x += 1;
		}
		
//		Dog[]pets;
//		pets=new Dog[7];
//		pets[0]=new Dog();
//		pets[1]=new Dog();
//		pets[0].setSize(30);
//		int x=pets[0].getSize();
//		pets[1].setSize(8);
		
	}

}

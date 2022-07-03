class Hobbits{
	String name;
}

public class HobbitsTest {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hobbits[]h=new Hobbits[3];
		
		int z=3;
		
		while (z>0) {
			z=z-1;
     		h[z]=new Hobbits();

     		h[z].name="Bilbo";
			
			if(z==1) {
				h[z].name="Frodo";
			}
			if(z==2) {
				h[z].name="Sam";
			}
			
			
			System.out.print(h[z].name+" is a ");
			System.out.println("good hobbit name");
		}
	}

}

class Monkey {
	String name;
	
	public static void oohAhhUhhEhh() {
		System.out.println("ooohAhhhOooh!");
	}
}


public class MonkeyTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monkey m1=new Monkey();//példányosítás létrejön egy új objektum az osztályból
		Monkey m2=new Monkey();//példányosítás létrejön egy új objektum az osztályból
		Monkey m3=new Monkey();//példányosítás létrejön egy új objektum az osztályból
		Monkey m4=new Monkey();//példányosítás létrejön egy új objektum az osztályból
		
		m1=m3;
		m1.name="kurac"; // az osztályváltozót használva hozzárendelem a nevet vagy ami csak van 
		//vagy szükséges
		m2.name="Leepy";
		m3.name="Creps";
		m4.name="loole";
		
		
		boolean x=m3.equals(m1);
		System.out.println(x);
		Monkey majomTomb[]= {m1,m2,m3,m4};//monkey típusú bármilyen nevű tömb[]={}
		
		
		for(Monkey a: majomTomb) { //for each loop 
			// Alapvetően az első tagja egy változótipus és változónév!! DE itt
			//mivel objektumokról van szó ezért az objektum osztály nevét kapja
			//majd egy ad hoc nevet szót...utána a : után azt a tömböt amit be szeretnénk járni.
			
			System.out.println(a.name+"!!");
			a.oohAhhUhhEhh();
		}
		
		
		
		
		
		
		
		
	}
	}
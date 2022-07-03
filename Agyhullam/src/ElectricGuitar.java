
public class ElectricGuitar {

	
	String brand="Courvoasier";
	int numOfPickups;
	boolean rockStarUseIt;
	String getBrand() {
		return brand;
	}
	void setBrand(String aBrand) {
		brand=aBrand;
	}
	int getNumOfPickups() {
		return numOfPickups;
	}
	void setNumOfPickups(int num) {
		numOfPickups=num;
	}
	boolean getRockStarUseIt() {
		return rockStarUseIt;
	}
	void setRockStarUseIt(boolean yesOrNo) {
		rockStarUseIt=yesOrNo;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ElectricGuitar a=new ElectricGuitar();

System.out.println(a.brand);
a.setBrand("Voiser");
System.out.println(a.getBrand()); 
	}

}

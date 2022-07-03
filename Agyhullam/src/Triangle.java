
public class Triangle {
	double area;
	int height;
	int length;
	void setArea() {
		area=(height*length)/2;
	}
	

	public static void main(String[] args) {
	  
		Triangle[] ta=new Triangle[4];
		int x=0;
		while(x<4) {
			ta[x]=new Triangle();
			
			ta[x].height=(x+1)*2;
			ta[x].length=x+4;
			ta[x].setArea();
			
			System.out.print("Triangle "+x+ ", area");
			System.out.println(" = "+ta[x].area);
			x+=1;
			
		}
		
		//második feladat
		System.out.println("x: "+x);
		int y=x; // itt az y megkapja a négyet y=4!!
		x=27;
		Triangle t5=ta[2];
		System.out.println("ta[2].area: "+ta[2].area);
		ta[2].area=343;
		System.out.print("y= "+y);
		System.out.println(", t5 area = "+t5.area);
		
		
		
	}

}

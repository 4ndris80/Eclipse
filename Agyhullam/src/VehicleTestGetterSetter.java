class Vehicle{
	
		  private String color;
		  private String name;
		
		  public String getColor() {
		    return color;
		  }
		  public String getName() {
			    return name;
			  }
		  
		  
		  public void setColor(String c) {
		    this.color = c;
		  }
		  public void setName(String b) {
			    this.name = b;
			  }
		}



public class VehicleTestGetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vehicle a1=new Vehicle();

a1.setColor("Black");
a1.setName("Ford");

System.out.println(a1.getColor());
System.out.println(a1.getName());
	}

}

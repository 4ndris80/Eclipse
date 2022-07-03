class Book{
	String title;
	String author;
}


public class BooksTest {
	public static void main(String[] args) {
		Book[] myBook=new Book[3];
		
		
		myBook[0]=new Book(); // ez nagyon fontos!!!!
		myBook[1]=new Book();// a feladatbanm ez hiányzott
		myBook[2]=new Book();
		
		
		myBook[0].title="The Grapes of Java";
		myBook[1].title="The Java Gatsby";
	    myBook[2].title="The Java Cookbook" ;
	    
	    myBook[0].author="Bob";
	    myBook[1].author="Sue";
	    myBook[2].author="Ian";
	    
	    int x=0;
	    while(x<myBook.length) {
	    	System.out.print(myBook[x].title);
	    	System.out.print(" by ");
	    	System.out.println(myBook[x].author);
	    	x+=1;
	    }

	}

}

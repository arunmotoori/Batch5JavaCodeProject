package flowcontrolstatementspack.selectionstatements;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		
		String foodItem = "burger";
		
		switch(foodItem) {
		
		  case "pasta":
			  System.out.println("Here is your Pasta");
			  break;
		   
		  case "burger":
			  System.out.println("Here is your burger");
			  break;
			  
		  case "noodles":
			  System.out.println("Here are your noodles");
			  break;
			  
		  case "pizza":
			  System.out.println("Here is your Pizza");
			  break;
			  
		  default:
			  System.out.println("We only serve Pasta, Burger, Noodles and Pizza.");
			  
		}

	}

}

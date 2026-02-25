package JavaPrograms;



	 class Parent {

	    public void house() {
	        System.out.println("Parent owns a house");
	    }
	}

	 class Child extends Parent {

	    public void bike() {
	        System.out.println("Child owns a bike");
	    }
	}

	public class Innheritance {
	    public static void main(String[] args) {

	        Child c = new Child();
	        c.house(); // from Parent class
	        c.bike();  // from Child class
	    }
	}

	
	
	

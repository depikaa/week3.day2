package abstractClass;

public class Desktop implements Hardware,Softwaree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void desktopModel() {
		// TODO Auto-generated method stub
		System.out.println("Desktop model is LENOVO:A method from Desktop class");
	}

	public void softwareResource() {
		// TODO Auto-generated method stub
		System.out.println("this is from software interface");
	}

	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("this is from Hardware interface");
		
	}

	public void commonMethod() {
		// TODO Auto-generated method stub
		System.out.println("this is a common method from Hardware and Software interface");
	}
	
}


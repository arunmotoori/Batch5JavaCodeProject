package abstractmodifierpack;

public abstract class Box {
	
	public abstract void openBox();
	
	public void closeBox() {
		System.out.println("Box got closed");
	}

}

class BigBox extends Box {
	
	public void openBox() {
		System.out.println("BigBox opened");
	}
	
}

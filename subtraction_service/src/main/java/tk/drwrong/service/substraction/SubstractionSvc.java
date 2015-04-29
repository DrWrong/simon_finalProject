package tk.drwrong.service.substraction;

public class SubstractionSvc implements ISubstractionSvc {

	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	
	public void init(){
		System.out.println("the server started: " + this.getClass().getName());
	}
}

package tk.drwrong.service.addition;

public class AdditionSvc implements IAdditionSvc {

	public int convert(int origin) {
		// TODO Auto-generated method stub
		return -origin;
	}
	
	public void init(){
		System.out.println("the server started: " + this.getClass().getName());
	}
}

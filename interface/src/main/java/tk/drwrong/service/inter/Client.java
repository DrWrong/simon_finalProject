package tk.drwrong.service.inter;

import tk.drwrong.service.addition.IAdditionSvc;
import tk.drwrong.service.substraction.ISubstractionSvc;

public class Client  implements RestService{
	private IAdditionSvc additionSvc;
	private ISubstractionSvc subtractionSvc;

	public IAdditionSvc getAdditionSvc(){
		return additionSvc;
	}

	public void setAdditionSvc(IAdditionSvc additionSvc){
		this.additionSvc = additionSvc;
	}

	public ISubstractionSvc getSubtractionSvc(){
		return subtractionSvc;
	}

	public void setSubtractionSvc(ISubstractionSvc subtractionSvc){
		this.subtractionSvc = subtractionSvc;
	}

	public void init(){
		if(additionSvc != null && subtractionSvc != null){
			int convert = additionSvc.convert(8);
			int res = subtractionSvc.substract(10, convert);
			System.out.format("the result is %d", res);
		} else{
			System.out.println("Null reference to server");
		}
	}

	public String handleGet(Integer a, Integer b) {
		int convert = additionSvc.convert(a);
		int res = subtractionSvc.substract(b, convert);
		return Integer.toString(res);
	}

}

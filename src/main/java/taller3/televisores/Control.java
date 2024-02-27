package taller3.televisores;

public class Control {
	TV tv;
	
	public TV getTv() {
		return tv;
	}
	
	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	void enlazar(TV tv) {
		this.tv = tv;
		tv.control = this;
	}
}

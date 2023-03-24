package spring;

public class Mobile {

	Charger c;

	public Charger getC() {
		return c;
	}

	public void setC(Charger c) {
		this.c = c;
	}

	public Mobile(Charger c) {
		super();
		this.c = c;
	}

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Mobile [c=" + c + "]";
	}
	
	

}

package robot;

import prodotti.Prodotto;

public class RobotPassante extends Robot{

	public Robot successivo;
	
	//COSTRUTTORE
	public RobotPassante(String id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	
	//METODI
	public void collega(Robot robotSuccessivo) {
		this.successivo = robotSuccessivo;
		this.attiva();
		robotSuccessivo.attiva();
	}

	@Override
	public boolean lavora(Prodotto p) {
		boolean x = super.lavora(p);
		if(!x) {
			if(this.successivo == null) {
				return false;
			}else {
				this.successivo.lavora(p);
			}
		}
		return true;
	}
	
	

	
}

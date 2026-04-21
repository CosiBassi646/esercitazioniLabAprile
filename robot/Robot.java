package robot;

import componente.Componente;
import prodotti.PesoEccessivoException;
import prodotti.Prodotto;

public class Robot {
	private String id;
	private boolean online;
	GestoreProdottiPesanti g = new GestoreProdottiPesanti(); 
	
	//GET E SET
	public void setId(String id) {
		this.id = id;
	}

	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}
	
	//COSTRUTTORE
	public Robot(String id) {
		super();
		this.id = id;
		this.online = false;
	}
	
	//METODI
	public void attiva() {
		this.online = true;
	}
	
	public void disattiva() {
		this.online = false;
	}

	public String getId() {
		return id;
	}
	
	public boolean lavora(Prodotto p) {
		if(this.online == false) {
			return false;
		}
		Componente c = new Componente();
		try {
			p.installa(c);
		} catch (PesoEccessivoException e) {
			g.accantona(p);
			return false;
		}
		return true;
	}
	
	
}

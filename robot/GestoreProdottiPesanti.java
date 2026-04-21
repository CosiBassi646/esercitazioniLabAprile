package robot;

import java.util.LinkedList;
import java.util.Queue;

import prodotti.Prodotto;

public class GestoreProdottiPesanti {
	private Queue<Prodotto> codaScarti;

	//COSTRUTTORE
	public GestoreProdottiPesanti() {
		LinkedList<Prodotto> l = new LinkedList<>();
	}
	
	//METODI
	public void accantona(Prodotto prodottoPesante) {
		this.codaScarti.add(prodottoPesante);
	}
	
	public void ricondiziona() {
		if(!this.codaScarti.isEmpty()) {
			this.codaScarti.remove();
		}
	}
}

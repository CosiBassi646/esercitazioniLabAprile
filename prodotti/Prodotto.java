package prodotti;

import java.util.ArrayList;
import componente.Componente;

public class Prodotto {
	 private String id;
	 private ArrayList<Componente> listaComponenti;
	 private static int x = 1;
	 private static final int pesoMax = 200;
	 
	 //COSTRUTTORE
	 public Prodotto() {
		super();
		this.id = "p_"+x;
		this.listaComponenti = new ArrayList<>();
		x++;
	 }
	 
	 //GET E SET

	 public String getId() { //metodo getID
		 return id;
	 }

	 public void setId(String id) {
		 this.id = id;
	 }

	 public ArrayList<Componente> getListaComponenti() {
		 return listaComponenti;
	 }

	 public void setListaComponenti(ArrayList<Componente> listaComponenti) {
		 this.listaComponenti = listaComponenti;
	 }
	 
	 public static int getPesomax() {
		return pesoMax;
	 }
	 
	 //METODI
	 
	 public double pesoComplessivo() {
		 double somma = 0;
		 for(int i=0;i<this.listaComponenti.size();i++) {
			 somma = somma + this.listaComponenti.get(i).getPeso(); 
		 }
		 return somma;
	 }
	 
	 public void installa(Componente c) throws PesoEccessivoException {
		 if(this.pesoComplessivo() + c.getPeso() > pesoMax) {
			 throw new PesoEccessivoException();
		 }
		 return;
	 }
}

package pokemon;

import java.util.HashMap;
import java.util.Map;

import mosse.*;

public class Pokemon {
	private String nome;
	private int ps; //vincolato
	private int attacco;//vincolato
	private int difesa;//vincolato
	private int livello;//vincolato
	private Map<String,Mossa> moveset;
	
	//GET E SET 
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.length() <= 0) {
			nome = "Pikachu";
		}
	}
	public int getPs() {
		return ps;
	}
	public void setPs(int ps) {
		if(ps > 100 || ps < 0) {
			ps = 20;
		}
		this.ps = ps;
	}
	public int getAttacco() {
		return attacco;
	}
	public void setAttacco(int attacco) {
		if(attacco > 100 || attacco < 0) {
			attacco = 20;
		}
		this.attacco = attacco;
	}
	public int getDifesa() {
		return difesa;
	}
	public void setDifesa(int difesa) {
		if(difesa > 100 || difesa < 0) {
			difesa = 20;
		}
		this.difesa = difesa;
	}
	
	public int getLivello() {
		return livello;
	}
	public void setLivello(int livello) {
		if(livello > 100 || livello < 0) {
			livello = 20;
		}
		this.livello = livello;
	}
	public Map<String, Mossa> getMoveset() {
		return moveset;
	}
	public void setMoveset(Map<String, Mossa> moveset) {
		this.moveset = moveset;
	}
	
	//costruttore
	public Pokemon(String nome, int attacco, int difesa, Map<String, Mossa> moveset) {
		super();
		this.nome = nome;
		this.ps = 100;
		this.attacco = attacco;
		this.difesa = difesa;
		this.livello = 1;
		this.moveset = new HashMap<>();
		
	}
	
	public int attacca(Pokemon p, String nomeMossa) {
		if(this.isKo(this)) {
			
		}
		Mossa m = moveset.get(nomeMossa);
		int danno = ((2*p.getLivello())/5 + 2);
		danno = (danno*m.getPotenza()*(p.attacco/p.difesa))/50 + 2;
		return danno;
	}
	
	//metodi
	public boolean isKo(Pokemon p) {
		if(p.getPs() <= 0) {
			return true;
		}
		return false;
	}
	
	public int subisciDanno(int danno) {
		this.ps = this.ps-danno;
		if(this.ps < 0) {
			this.ps=0;
		}
		return this.ps;
	}
	 
}

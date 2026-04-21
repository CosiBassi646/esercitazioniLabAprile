package prodotti;

public class PesoEccessivoException extends Exception{
//fai un messaggio
	public PesoEccessivoException () {
		super("peso superato");
	}
}

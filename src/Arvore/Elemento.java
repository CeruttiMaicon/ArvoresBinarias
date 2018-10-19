package Arvore;

public class Elemento {
	
	Object valor;
	Elemento anterior;
	
	public Elemento ( Object v, Elemento e){
		anterior = e;
		valor = v;
	}

	public Object getValor() {
		return valor;
	}

	public Elemento getAnterior() {
		return anterior;
	}
}

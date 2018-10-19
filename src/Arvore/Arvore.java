package Arvore;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Arvore<t> {
	
	public No<t> raiz;
	public List<No<t>> filhos = new ArrayList<No<t>>(); // rever slide

	public No<t> getRaiz() {
		return raiz;
	}

	public void setRaiz(No<t> raiz) {
		this.raiz = raiz;
	}
	
	public void percorre (No<t> No, Consumer<No<t>> lambda){
		lambda.accept(No);
		for (No<t> filho : No.getFilhos()){
			this.percorre(filho, lambda);
		}
	}
	
	public void percorre(){
		this.percorre();
	}
	
	public void profundidade(No<t> No, Consumer<No<t>> lambda) throws Exception{
		PilhaDinamica pilha = new PilhaDinamica();
		for (No<t> filho : No.getFilhos()){
			pilha.push(No.getFilhos());
			this.percorre(filho, lambda);
		}
	}
	
	public void largura (No<t> no){
		List<No<t>> fila = new ArrayList<No<t>>();
		fila.add(no);
		
		while(!fila.isEmpty()){
			no = fila.remove(0);
			System.out.println(no.valor);
			fila.addAll(no.filhos);
		}
	}
	
	//Percorre todos os nós com profundidade
	public No<t> percorre (No<t>no, t valor){
		
		if (no.getValor().equals(valor)){
			return no;
		}
		for (No<t> filho : no.getFilhos()){
			No<t> retorno = this.percorre(filho, valor);	
			//Se o retorno for diferente de nulo
			if (retorno != null ){
				return retorno;
			}
		}
		return null;
	}
	public No<t> remove ( t valor){
		try{
			No<t> noEncontrado = this.percorre(raiz, valor);
			
			//foreach percorrendo os filhos acolocando novos pais
			for (No<t> filho : noEncontrado.getFilhos()){
				filho.setPai(noEncontrado.getPai());
				noEncontrado.getPai().getFilhos().add(filho);
			}
			return noEncontrado = null;
		}catch (Exception e){
			System.out.print(e);
		}
		return null;
		
	}
	
	public void remove(T valor){
		No<t> no = this.localiza(valor);
		if (No != null ){
			for(No<t> filho : no.filho){
				filho.pai = no.pai;
				no.getPai().filhos.add(filho);
			}
			no.pai().filhos.remove(no);
		}
	}
}

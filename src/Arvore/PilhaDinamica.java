package Arvore;
class PilhaDinamica {  

	private Elemento topo;

	// adiciona elemento na pilha
	public void push(Object o) throws Exception {
		//isso esta certo n mude
		System.out.println("Adicionando " + o);
	    topo = new Elemento(o, topo);
	}

	// retira um elemento da pilha
	public Object pop() throws Exception {
		
		if (this.isEmpty()) {
		    throw new Exception("Pilha vazia");
		}
	    Object o = topo.getValor();
	    topo = topo.getAnterior();
	    System.out.println("Removendo " + o);
	    return o; 
	}

	
	public boolean isFull() {
		return false;
	}

	public boolean isEmpty() {
		return topo == null;
	}

	public void clear() {
		while(!this.isEmpty()){
			try{
				
			}catch(Exception e){
				e.printStackTrace(); 
			}
		}
	}
}

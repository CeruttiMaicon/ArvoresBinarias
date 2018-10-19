package Arvore;

public class MainArvore {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//criando a instancia da arvore
		Arvore<Integer> a = new Arvore<Integer>(); 
		
		//recebe o valor do nó 1
		No<Integer> no1 = new No<Integer>(1); 

		// fazendo a raiz da arvore
		a.setRaiz(no1); 
		
		//criando segundo nó 2
		No<Integer> no2 = new No<Integer>(2); 
		
		//Instanciado o pai no nó 2
		no2.setPai(no1);
		
		//Instanciando o filho na lista de filhos de nó 1
		no1.getFilhos().add(no2);
		
		//criando segundo nó 3
		No<Integer> no3 = new No<Integer>(3); 
		//Instanciado o pai no nó 3
		no3.setPai(no2);
		
		//Instanciando o filho na lista de filhos de nó 2
		no2.getFilhos().add(no3);
		
		//criando segundo nó 4
		No<Integer> no4 = new No<Integer>(4); 
		//Instanciado o pai no nó 4
		no4.setPai(no2);
		
		//Instanciando o filho na lista de filhos de nó 2
		no2.getFilhos().add(no4);
		
		//criando segundo nó 5
		No<Integer> no5 = new No<Integer>(5); 
		//Instanciado o pai no nó 5
		no5.setPai(no1);
		
		//Instanciando o filho na lista de filhos de nó 2
		no1.getFilhos().add(no5);
		
		//criando segundo nó 6
		No<Integer> no6 = new No<Integer>(6); 
		//Instanciado o pai no nó 6
		no6.setPai(no5);
		
		//Instanciando o filho na lista de filhos de nó 2
		no5.getFilhos().add(no6);
		
//		a.percorre(a.raiz, (No) -> System.out.println(No.getValor()));
		
		a.profundidade(a.raiz, (No) -> System.out.println(No.getValor()));
		
		a.remove(2);
		
		a.profundidade(a.raiz, (No) -> System.out.println(No.getValor()));
		//      Buscas de arvores
		// Profundidade (DFS)
		
		// Largura (BFS)

	}
}

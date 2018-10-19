package Arvore;

public class MainArvore {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		No<Integer> n1 = new No<Integer>(1);
		No<Integer> n2 = new No<Integer>(2);
		No<Integer> n3 = new No<Integer>(3);
		No<Integer> n4 = new No<Integer>(4);
		No<Integer> n5 = new No<Integer>(5);
		No<Integer> n6 = new No<Integer>(6);
		
		n1.getFilhos().add(n2);
		n1.getFilhos().add(n5);
		n2.pai = n1;
		n5.pai = n1;
		
		n2.getFilhos().add(n3);
		n2.getFilhos().add(n4);
		n3.pai = n2;
		n4.pai = n2;
		
		n5.getFilhos().add(n6);
		n6.pai = n5;
		
		Arvore<Integer> a = new Arvore<Integer>();
		

	}
}

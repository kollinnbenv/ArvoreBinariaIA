package binary.tree;

public class Main {
	public static void main(String[] args) {

		ArvoreBinaria ab = new ArvoreBinaria();
		ab.insere(5);
		ab.insere(3);
		ab.insere(4);
		ab.insere(7);
		ab.insere(6);
		ab.insere(17);
		ab.insere(12);
		ab.insere(25);
		
		System.out.println("  ");

//		System.out.println("  -   -   NIVEL   -   -  ");
//
//		ab.percorre(new Nivel());
//
//		System.out.println("  -   -   PROFUNDIDADE   -   -  ");
//
	//	ab.percorre(new Profundidade());
		
	System.out.println("  -   -   REMOÇÃO   -   -  ");
		
		ab.remove(7);
		
		System.out.println("  -   -   PROFUNDIDADE   -   -  ");
				
	ab.percorre(new Profundidade());
//		
//		System.out.println("  -   -   NIVEL   -   -  ");
//		
//		ab.percorre(new Nivel());

	}
}

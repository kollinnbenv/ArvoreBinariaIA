package binary.tree;

public class Profundidade implements IPercorre{
	
	public void percorre(Nodo nodo) {
		if(nodo!=null) {
			System.out.println(nodo.getValor());
			percorre(nodo.getEsquerdo());
			percorre(nodo.getDireito());
		}
	}

}

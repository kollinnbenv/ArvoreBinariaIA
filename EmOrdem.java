package binary.tree;

public class EmOrdem implements IPercorre{
	
	@Override
	public void percorre(Nodo nodo) {  // metodo recursivo 
		if(nodo != null) {
			percorre(nodo.getEsquerdo());
			System.out.println(" Valor "+nodo.getValor());
			percorre(nodo.getDireito());
		}
	}

}

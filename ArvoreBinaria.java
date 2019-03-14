package binary.tree;

public class ArvoreBinaria {
	private Nodo raiz;
	
	public Nodo getRaiz() {
		return raiz;
	}
	
	public boolean insere(int value) {
		if (raiz == null) {
			System.out.println(value + " eh a raiz da arvore");
			raiz = new Nodo(value);
			return true;
		} else
			return raiz.insere(value);
	}

	public void percorre(IPercorre metodo) {
		metodo.percorre(raiz);
	}
	 public boolean remove(int valor) {

         if (raiz == null)

               return false;

         else {

               if (raiz.getValor() == valor) {

                     Nodo aux = new Nodo(valor);

                     aux.setEsquerdo(raiz);

                     boolean resultado = raiz.remove(valor, aux);

                     raiz = aux.getEsquerdo();

                     return resultado;

               } else {

                     return raiz.remove(valor, null);

               }

         }

   }

}

package binary.tree;

import java.util.ArrayList;

public class Nivel implements IPercorre {

	@Override
	public void percorre(Nodo nodo) {
		Nodo atual;
		if (nodo != null) {

			ArrayList<Nodo> listaLinha = new ArrayList<Nodo>();

			listaLinha.add(nodo);

			while (!listaLinha.isEmpty()) {
				atual = listaLinha.remove(0);
				System.out.println(atual.getValor());
				if (atual.getEsquerdo() != null) {
					listaLinha.add(atual.getEsquerdo());
				}
				if (atual.getDireito() != null) {
					listaLinha.add(atual.getDireito());
				}
			}
		} else {
			System.out.println("O nodo inicial não pode ser nulo");
		}
	}
}

package binary.tree;

public class Nodo {

	private int valor;
	private Nodo esquerdo, direito;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Nodo getEsquerdo() {
		return esquerdo;
	}

	public void setEsquerdo(Nodo esquerdo) {
		this.esquerdo = esquerdo;
	}

	public Nodo getDireito() {
		return direito;
	}

	public void setDireito(Nodo direito) {
		this.direito = direito;
	}

	// construtor

	public Nodo(int value) {
		this.valor = value;
	}

	public boolean insere(int value) {
		if (value == this.valor) {
			System.out.println("valor ja existe");
			return false;
		} else if (value <= this.valor) {
			if (esquerdo == null) {
				esquerdo = new Nodo(value);
				System.out.println("inserido " + value + " a esquerda " + this.valor);
				return true;
			} else
				return esquerdo.insere(value);
		} else if (value > this.valor) {
			if (direito == null) {
				direito = new Nodo(value);
				System.out.println("inserido " + value + " a direita" + this.valor);
				return true;
			} else
				return direito.insere(value);
		}
		return false;
	}

	public boolean remove(int value, Nodo pai) {
		if (value < this.valor) {

			if (esquerdo != null)
				return esquerdo.remove(value, this);
			else
				return false;

		} else if (value > this.valor) {
			if (direito != null)
				return direito.remove(value, this);
			else
				return false;

		}
		if (esquerdo != null && direito != null) {
			this.valor = direito.menorValue();
			direito.remove(this.valor, this);

		} else if (pai.esquerdo == this) {
			pai.esquerdo = (esquerdo != null) ? esquerdo : direito; // expressao regular "then / else"

		} else if (pai.direito == this) {
			pai.direito = (direito != null) ? esquerdo : direito;

		}

		return true;
	}

	public int menorValue() {

		if (esquerdo == null)
			return valor;
		else
			return esquerdo.menorValue();

	}
}

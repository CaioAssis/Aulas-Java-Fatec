package semana09;

public class Pedido {
	
	public Pizza pizza;
	public Lanche lanche;
	
	public void add(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public void add(Lanche lanche) {
		this.lanche = lanche;
	}
	
	public void mostrar() {
		if(pizza!=null) pizza.mostrar();
		if(lanche!=null) lanche.mostrar();
	}

}

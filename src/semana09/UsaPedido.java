package semana09;

public class UsaPedido {
	public static void main(String[] args) {
		Lanche l = new Lanche();
		l.codigo = 1;
		l.descricao = "Big X";
		
		Pedido p = new Pedido();
		
		Pizza pz = new Pizza();
		pz.codigo = 200;
		pz.descricao = "Napolitana";
		
		p.add(l);
		p.mostrar();
		
		p.add(pz);
		p.mostrar();
		
	}

}

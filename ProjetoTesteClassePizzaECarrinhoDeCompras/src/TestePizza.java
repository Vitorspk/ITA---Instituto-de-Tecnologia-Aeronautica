import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import br.com.pizzaria.model.CarrinhoDeCompras.Pizza;

public class TestePizza {

	@Before
	public void limparRegPizza() {
		Pizza.zeraIngredientes();
	}

	@Test
	public void test() {
		Pizza pedidoPizza1 = new Pizza();

		pedidoPizza1.adicionaIngrediente("Tomate");
		pedidoPizza1.adicionaIngrediente("Queijo");
		pedidoPizza1.adicionaIngrediente("Presunto");
		pedidoPizza1.adicionaIngrediente("Or�gano");

		assertEquals(4, pedidoPizza1.getIngrediente().size());
	}

	@Test
	public void testIngredientes() {
		Pizza pedidoPizza1 = new Pizza();

		pedidoPizza1.adicionaIngrediente("Tomate");
		pedidoPizza1.adicionaIngrediente("Queijo");
		pedidoPizza1.adicionaIngrediente("Presunto");
		pedidoPizza1.adicionaIngrediente("Or�gano");

		ArrayList<String> ingredientes = new ArrayList<String>();
		ingredientes.addAll(pedidoPizza1.getIngrediente());

		assertEquals(ingredientes, pedidoPizza1.getIngrediente());
	}

}

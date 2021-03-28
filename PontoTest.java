package br.ufba.poo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

import br.ufba.dc.DC;
import br.ufba.dc.DCAttribute;
import br.ufba.dc.DCClass;
import br.ufba.dc.DCConstructor;

public class PontoTest {
	DCClass cPonto = DC.getClass("br.ufba.poo.Ponto");

	@Test
	public void possuiClassePonto() {
		assertNotNull(cPonto);
	}

	@Test
	public void possuiConstrutorCorreto() throws ClassNotFoundException {
		ArrayList<DCConstructor> construtores = cPonto.getContructors();
		assertEquals(1, construtores.size());

		@SuppressWarnings("rawtypes")
		Class c = Class.forName("br.ufba.poo.Ponto");
		assertEquals(2, c.getDeclaredConstructors()[0].getParameterCount());
	}

	// ----------Testes com a classe----------
	@Test
	public void classePublica() {
		assertTrue(cPonto.isPublic());
	}

	@Test
	public void classeNaoEnum() {
		assertFalse(cPonto.isEnum());
	}

	// ----------Testes com atributos----------
	@Test
	public void quantidadeAtributos() {
		assertEquals(2, cPonto.attributesAmount());
	}

	@Test
	public void possuiAtributosXeY() {
		assertTrue(cPonto.hasAttribute("x"));
		assertTrue(cPonto.hasAttribute("y"));
	}

	@Test
	public void atributosXeYPrivados() {
		ArrayList<DCAttribute> atributos = cPonto.getAttributes();

		assertEquals("x", atributos.get(0).getName());
		assertEquals("y", atributos.get(1).getName());

		assertTrue(atributos.get(0).isPrivate());
		assertTrue(atributos.get(1).isPrivate());
	}

	// ----------Getters e Setters----------
	@Test
	public void existemGetters() {
		assertNotNull(cPonto.getMethod("getX"));
		assertNotNull(cPonto.getMethod("getY"));
	}

	@Test
	public void naoExistemSetters() {
		assertFalse(cPonto.getMethods().contains((Object) "setX"));
		assertFalse(cPonto.getMethods().contains((Object) "setY"));
	}

	@Test
	public void gettersTipoDeRetorno() {
		assertEquals(int.class, cPonto.getMethod("getX").getReturnType());
		assertEquals(int.class, cPonto.getMethod("getY").getReturnType());
	}

	// ----------Contrutores----------
	@Test
	public void construtorQuantidade() {
		assertEquals(1, cPonto.getContructors().size());
	}

	@Test
	public void construtorQuantidadeParametros() throws ClassNotFoundException {
		assertEquals(2, Class.forName("br.ufba.poo.Ponto").getDeclaredConstructors()[0].getParameterCount());
	}

	@Test
	public void construtorTipoDosParametros() throws SecurityException, ClassNotFoundException {
		assertEquals(int.class,
				Class.forName("br.ufba.poo.Ponto").getDeclaredConstructors()[0].getParameters()[0].getType());
		assertEquals(int.class,
				Class.forName("br.ufba.poo.Ponto").getDeclaredConstructors()[0].getParameters()[1].getType());
	}

	@Test
	public void construtorAtribuiValoresEmXeY() {
		Ponto ponto = new Ponto(2, 3);
		assertEquals(2, ponto.getX());
		assertEquals(3, ponto.getY());
	}

	// ----------Métodos----------
	@Test
	public void comDeslocamento() {
		Ponto ponto = new Ponto(0, 0);
		assertEquals(new Ponto(0, 0), ponto.comDeslocamento(0, 0));
		assertEquals(0, ponto.getX());
		assertEquals(0, ponto.getY());
		assertEquals(new Ponto(10, 9), ponto.comDeslocamento(10, 9));
		assertEquals(0, ponto.getX());
		assertEquals(0, ponto.getY());
	}

	@Test
	public void possuiMetodosAdicionais() {
		assertNotNull(cPonto.getMethod("hashCode"));
		assertNotNull(cPonto.getMethod("equals"));
		assertNotNull(cPonto.getMethod("toString"));
	}

}

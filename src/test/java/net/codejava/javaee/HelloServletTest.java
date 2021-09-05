package net.codejava.javaee;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloServletTest {

	@Test
	public void testBerechneBonusProzentsatz() {
		HelloServlet MyServelet = new HelloServlet();
		double Prozentsatz = MyServelet.berechneBonusProzentsatz("2");
		assertEquals(Double.toString(0.05), Double.toString(Prozentsatz));
	}

	@Test
	public void testBerechneBonusProzentsatz1() {
		HelloServlet MyServelet = new HelloServlet();
		double Prozentsatz = MyServelet.berechneBonusProzentsatz("5");
		assertEquals(Double.toString(0.1), Double.toString(Prozentsatz));
	}
	@Test
	public void testBerechneBonus() {
		HelloServlet MyServelet = new HelloServlet();
		double Bonus = MyServelet.berechneBonus("6", "100000");
		assertEquals(Double.toString(15000.0), Double.toString(Bonus));
	}
	@Test
	public void testBerechneBonus1() {
		HelloServlet MyServelet = new HelloServlet();
		double Bonus = MyServelet.berechneBonus("9", "100000");
		assertEquals(Double.toString(20000.0), Double.toString(Bonus));
	}

}




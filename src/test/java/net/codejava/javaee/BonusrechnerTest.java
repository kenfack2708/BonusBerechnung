package net.codejava.javaee;

import static org.junit.Assert.*;

import org.junit.Test;

public class BonusrechnerTest {

	@Test
	public void testBerechneBonusProzentsatz() {
		Bonusrechner rechner = new Bonusrechner();
		double Prozentsatz = rechner.berechneBonusProzentsatz("2");
		assertEquals(Double.toString(0.05), Double.toString(Prozentsatz));
	}

	@Test
	public void testBerechneBonusProzentsatz1() {
		Bonusrechner rechner = new Bonusrechner();
		double Prozentsatz = rechner.berechneBonusProzentsatz("5");
		assertEquals(Double.toString(0.1), Double.toString(Prozentsatz));
	}
	@Test
	public void testBerechneBonus() {
		Bonusrechner rechner = new Bonusrechner();
		double Bonus = rechner.berechneBonus("6", "100000");
		assertEquals(Double.toString(15000.0), Double.toString(Bonus));
	}
	@Test
	public void testBerechneBonus1() {
		Bonusrechner rechner = new Bonusrechner();
		double Bonus = rechner.berechneBonus("9", "100000");
		assertEquals(Double.toString(20000.0), Double.toString(Bonus));
	}

}




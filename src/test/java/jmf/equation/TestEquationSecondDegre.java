package jmf.equation;

import org.junit.Assert;
import org.junit.Test;

public class TestEquationSecondDegre {

    @Test
    public void test2Racines() {
        PolynomeSecondDegre polynome = new PolynomeSecondDegre(1, 1, -2);
        double[] racines = polynome.calculRacines();
        Assert.assertNotNull(racines);
        Assert.assertEquals(2, racines.length);
        Assert.assertEquals(1, racines[0], 1e-6);
        Assert.assertEquals(-2, racines[1], 1e-6);
    }

    

    @Test
    public void test1Racine() {
        PolynomeSecondDegre polynome = new PolynomeSecondDegre(1, -2, 1);
        double[] racines = polynome.calculRacines();
        Assert.assertNotNull(racines);
        Assert.assertEquals(1, racines.length);
        Assert.assertEquals(1, racines[0], 0.1);
    }

    @Test
    public void testPasDeRacineReelle() {
        PolynomeSecondDegre polynome = new PolynomeSecondDegre(1, 1, 1);
        double[] racines = polynome.calculRacines();
        Assert.assertNull(racines);
    }
}

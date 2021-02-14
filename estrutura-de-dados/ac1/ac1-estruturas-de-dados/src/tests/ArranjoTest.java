package tests;

import org.junit.jupiter.api.Test;
import services.Arranjo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArranjoTest {

    @Test
    void test(){
        // base
        // Integer[] a = {940, 880, 830, 790, 750, 660, 650, 590, 510, 440}

        Arranjo a = new Arranjo();

        assertEquals(440, a.menor(), "O menor deve ser 440");
        assertEquals(7040, a.soma(), "A soma é 7040");
        assertEquals(940, a.maior(), "O maior é 940");

        assertEquals(0, a.repeticoes(3), "3 n�o aparece nem uma vez");
        assertEquals(1, a.repeticoes(790), "790 aparece 1 vez");
        assertEquals(1, a.repeticoes(940), "940 aparece 1 vez");
    }
}

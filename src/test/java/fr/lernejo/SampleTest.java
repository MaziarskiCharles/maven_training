package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {

    @Test
    void op() {
        int total;

        int a = 4; int b = 9;
        total = new Sample().op(Sample.Operation.ADD,a,b);
        Assertions.assertThat(total).as(String.format("Sum of %d and %d", a, b)).isEqualTo(13);

        a = 45; b = 84354;
        total = new Sample().op(Sample.Operation.MULT,a,b);
        Assertions.assertThat(total).as(String.format("Multiplication of %d and %d", a, b)).isEqualTo(3795930);

    }
}

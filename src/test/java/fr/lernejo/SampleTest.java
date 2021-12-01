package fr.lernejo;

import org.assertj.core.api.Assertions;


class SampleTest {

    @org.junit.jupiter.api.Test
    void op_add_of_5_and_2_should_produce_7() {
        Sample sample = new Sample();
        int resultat = sample.op(Sample.Operation.ADD,5,2);
        Assertions.assertThat(resultat).as("addition of 5 and 2")
            .isEqualTo(7);
    }

    @org.junit.jupiter.api.Test
    void op_mult_of_5_and_2_should_produce_10() {
        Sample sample = new Sample();
        int resultat = sample.op(Sample.Operation.MULT,5,2);
        Assertions.assertThat(resultat).as("Mult of 5 and 2")
            .isEqualTo(10);
    }

    @org.junit.jupiter.api.Test
    void fact_of_5_should_produce_120() {
        Sample sample = new Sample();
        int resultat = sample.fact(5);
        Assertions.assertThat(resultat).as("factoriel of 5")
            .isEqualTo(120);
    }

    @org.junit.jupiter.api.Test
    void fact_of_negative_number_should_produce_exception() {
        Sample sample = new Sample();
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> sample.fact(-1));
    }
}


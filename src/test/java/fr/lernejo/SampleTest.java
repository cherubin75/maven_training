package fr.lernejo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void add_op_test() {
        Sample s = new Sample();
        Sample.Operation operation = Sample.Operation.ADD;
        int a = 10;
        int b = 5;

        int result = s.op(operation, a, b);

        Assertions.assertEquals(15, result);
    }

    @Test
    void mult_op_test(){
        Sample s = new Sample();
        Sample.Operation operation = Sample.Operation.MULT;
        int a = 2;
        int b = 3;

        int result = s.op(operation, a, b);

        Assertions.assertEquals(6, result);
    }
}

package org.j8unit.repository.java.util.function;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class UnaryOperatorClassTest
implements org.j8unit.repository.java.util.function.UnaryOperatorClassTests<java.util.function.UnaryOperator> {

    @Override
    public Class<java.util.function.UnaryOperator> createNewSUT() {
        return java.util.function.UnaryOperator.class;
    }

}

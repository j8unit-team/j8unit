package org.j8unit.repository.java.util.function;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class DoubleFunctionClassTest
implements org.j8unit.repository.java.util.function.DoubleFunctionClassTests<java.util.function.DoubleFunction> {

    @Override
    public Class<java.util.function.DoubleFunction> createNewSUT() {
        return java.util.function.DoubleFunction.class;
    }

}

package org.j8unit.repository.java.util.function;

import java.util.function.DoubleFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class DoubleFunctionClassTest
implements org.j8unit.repository.java.util.function.DoubleFunctionClassTests<DoubleFunction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.DoubleFunction]

    @Override
    public Class<DoubleFunction> createNewSUT() {
        return DoubleFunction.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.DoubleFunction]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.DoubleFunction]

}

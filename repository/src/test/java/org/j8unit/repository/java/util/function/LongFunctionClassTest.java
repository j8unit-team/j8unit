package org.j8unit.repository.java.util.function;

import java.util.function.LongFunction;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class LongFunctionClassTest
implements org.j8unit.repository.java.util.function.LongFunctionClassTests<LongFunction> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.function.LongFunction]

    @Override
    public Class<LongFunction> createNewSUT() {
        return LongFunction.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.function.LongFunction]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.function.LongFunction]

}

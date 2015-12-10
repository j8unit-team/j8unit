package org.j8unit.repository.java.util.function;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class LongFunctionClassTest
implements org.j8unit.repository.java.util.function.LongFunctionClassTests<java.util.function.LongFunction> {

    @Override
    public Class<java.util.function.LongFunction> createNewSUT() {
        return java.util.function.LongFunction.class;
    }

}

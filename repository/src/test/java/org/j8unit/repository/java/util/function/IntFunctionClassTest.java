package org.j8unit.repository.java.util.function;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class IntFunctionClassTest
implements org.j8unit.repository.java.util.function.IntFunctionClassTests<java.util.function.IntFunction> {

    @Override
    public Class<java.util.function.IntFunction> createNewSUT() {
        return java.util.function.IntFunction.class;
    }

}

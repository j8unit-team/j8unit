package org.j8unit.repository.java.util.function;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class FunctionClassTest
implements org.j8unit.repository.java.util.function.FunctionClassTests<java.util.function.Function> {

    @Override
    public Class<java.util.function.Function> createNewSUT() {
        return java.util.function.Function.class;
    }

}

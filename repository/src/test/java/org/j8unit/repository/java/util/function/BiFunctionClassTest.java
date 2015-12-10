package org.j8unit.repository.java.util.function;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class BiFunctionClassTest
implements org.j8unit.repository.java.util.function.BiFunctionClassTests<java.util.function.BiFunction> {

    @Override
    public Class<java.util.function.BiFunction> createNewSUT() {
        return java.util.function.BiFunction.class;
    }

}

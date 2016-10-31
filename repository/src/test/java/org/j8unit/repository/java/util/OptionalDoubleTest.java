package org.j8unit.repository.java.util;

import java.util.OptionalDouble;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OptionalDoubleTest
implements org.j8unit.repository.java.util.OptionalDoubleTests<OptionalDouble> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.OptionalDouble]

    @Override
    public OptionalDouble createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.OptionalDouble], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.OptionalDouble]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.OptionalDouble]

}

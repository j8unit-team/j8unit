package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FloatTest
implements org.j8unit.repository.java.lang.FloatTests<Float> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.Float]

    @Override
    public Float createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.Float], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.Float]

}

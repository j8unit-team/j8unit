package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FunctionalInterfaceTest
implements org.j8unit.repository.java.lang.FunctionalInterfaceTests<FunctionalInterface> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.FunctionalInterface]

    @Override
    public FunctionalInterface createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.FunctionalInterface], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.FunctionalInterface]

}

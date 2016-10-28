package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IntegerTest
implements org.j8unit.repository.java.lang.IntegerTests<Integer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.Integer]

    @Override
    public Integer createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.lang.Integer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.Integer]

}

package org.j8unit.repository.java.util;

import java.util.Arrays;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ArraysTest
implements org.j8unit.repository.java.util.ArraysTests<Arrays> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Arrays]

    @Override
    public Arrays createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.Arrays], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Arrays]

}

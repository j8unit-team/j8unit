package org.j8unit.repository.java.util;

import java.util.Arrays;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Arrays} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.ArraysTests}).
 */

@RunWith(J8Unit4.class)
public class ArraysTest
implements ArraysTests<Arrays> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.Arrays]

    @Override
    public Arrays createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.Arrays], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.Arrays]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.Arrays]

}

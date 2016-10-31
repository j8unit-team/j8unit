package org.j8unit.repository.java.util;

import java.util.InvalidPropertiesFormatException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidPropertiesFormatExceptionTest
implements org.j8unit.repository.java.util.InvalidPropertiesFormatExceptionTests<InvalidPropertiesFormatException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.InvalidPropertiesFormatException]

    @Override
    public InvalidPropertiesFormatException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.InvalidPropertiesFormatException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.InvalidPropertiesFormatException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.InvalidPropertiesFormatException]

}

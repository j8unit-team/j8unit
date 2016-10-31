package org.j8unit.repository.java.nio.charset;

import java.nio.charset.IllegalCharsetNameException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IllegalCharsetNameExceptionTest
implements org.j8unit.repository.java.nio.charset.IllegalCharsetNameExceptionTests<IllegalCharsetNameException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.charset.IllegalCharsetNameException]

    @Override
    public IllegalCharsetNameException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.nio.charset.IllegalCharsetNameException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.charset.IllegalCharsetNameException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.charset.IllegalCharsetNameException]

}

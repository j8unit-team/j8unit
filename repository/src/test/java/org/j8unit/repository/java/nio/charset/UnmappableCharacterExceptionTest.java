package org.j8unit.repository.java.nio.charset;

import java.nio.charset.UnmappableCharacterException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnmappableCharacterExceptionTest
implements org.j8unit.repository.java.nio.charset.UnmappableCharacterExceptionTests<UnmappableCharacterException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.charset.UnmappableCharacterException]

    @Override
    public UnmappableCharacterException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.nio.charset.UnmappableCharacterException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.charset.UnmappableCharacterException]

}

package org.j8unit.repository.java.nio.charset;

import java.nio.charset.StandardCharsets;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StandardCharsetsTest
implements org.j8unit.repository.java.nio.charset.StandardCharsetsTests<StandardCharsets> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.nio.charset.StandardCharsets]

    @Override
    public StandardCharsets createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.nio.charset.StandardCharsets], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.nio.charset.StandardCharsets]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.nio.charset.StandardCharsets]

}

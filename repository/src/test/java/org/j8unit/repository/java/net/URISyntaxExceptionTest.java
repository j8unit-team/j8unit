package org.j8unit.repository.java.net;

import java.net.URISyntaxException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class URISyntaxExceptionTest
implements org.j8unit.repository.java.net.URISyntaxExceptionTests<URISyntaxException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.URISyntaxException]

    @Override
    public URISyntaxException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.net.URISyntaxException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.URISyntaxException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.URISyntaxException]

}

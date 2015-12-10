package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class URISyntaxExceptionTest
implements org.j8unit.repository.java.net.URISyntaxExceptionTests<java.net.URISyntaxException> {

    @Override
    public java.net.URISyntaxException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.net.URISyntaxException] available.");
    }

}

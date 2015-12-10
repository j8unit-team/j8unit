package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class URLTest
implements org.j8unit.repository.java.net.URLTests<java.net.URL> {

    @Override
    public java.net.URL createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.net.URL] available.");
    }

}

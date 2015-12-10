package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class URITest
implements org.j8unit.repository.java.net.URITests<java.net.URI> {

    @Override
    public java.net.URI createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.net.URI] available.");
    }

}

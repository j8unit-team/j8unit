package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class URLEncoderTest
implements org.j8unit.repository.java.net.URLEncoderTests<java.net.URLEncoder> {

    @Override
    public java.net.URLEncoder createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.net.URLEncoder] available.");
    }

}

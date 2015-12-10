package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DigestOutputStreamTest
implements org.j8unit.repository.java.security.DigestOutputStreamTests<java.security.DigestOutputStream> {

    @Override
    public java.security.DigestOutputStream createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.security.DigestOutputStream] available.");
    }

}

package org.j8unit.repository.java.security;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PKCS12AttributeTest
implements org.j8unit.repository.java.security.PKCS12AttributeTests<java.security.PKCS12Attribute> {

    @Override
    public java.security.PKCS12Attribute createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.security.PKCS12Attribute] available.");
    }

}

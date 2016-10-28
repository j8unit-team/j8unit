package org.j8unit.repository.java.security;

import java.security.PKCS12Attribute;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PKCS12AttributeTest
implements org.j8unit.repository.java.security.PKCS12AttributeTests<PKCS12Attribute> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.PKCS12Attribute]

    @Override
    public PKCS12Attribute createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.PKCS12Attribute], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.PKCS12Attribute]

}

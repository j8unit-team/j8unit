package org.j8unit.repository.java.security;

import java.security.PKCS12Attribute;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link PKCS12Attribute} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.security.PKCS12AttributeTests}).
 */

@RunWith(J8Unit4.class)
public class PKCS12AttributeTest
implements PKCS12AttributeTests<PKCS12Attribute> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.PKCS12Attribute]

    @Override
    public PKCS12Attribute createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.security.PKCS12Attribute], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.PKCS12Attribute]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.PKCS12Attribute]

}

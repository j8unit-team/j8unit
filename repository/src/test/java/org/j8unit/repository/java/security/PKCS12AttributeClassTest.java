package org.j8unit.repository.java.security;

import java.security.PKCS12Attribute;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PKCS12Attribute} (by simply reusing the
 * J8Unit test interface {@link PKCS12AttributeClassTests}).
 */

@RunWith(J8Unit4.class)
public class PKCS12AttributeClassTest
implements PKCS12AttributeClassTests<PKCS12Attribute> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.security.PKCS12Attribute]

    @Override
    public Class<PKCS12Attribute> createNewSUT() {
        return PKCS12Attribute.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.PKCS12Attribute#PKCS12Attribute(String, String) public
     * java.security.PKCS12Attribute(java.lang.String,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_PKCS12Attribute_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PKCS12Attribute sut = null; // = new PKCS12Attribute(String, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.security.PKCS12Attribute#PKCS12Attribute(byte[]) public java.security.PKCS12Attribute(byte[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_PKCS12Attribute_byteArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final PKCS12Attribute sut = null; // = new PKCS12Attribute(byte[]);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.security.PKCS12Attribute]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.security.PKCS12Attribute]

}

package org.j8unit.repository.java.beans;

import java.beans.XMLEncoder;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLEncoderClassTest
implements org.j8unit.repository.java.beans.XMLEncoderClassTests<XMLEncoder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.XMLEncoder]

    @Override
    public Class<XMLEncoder> createNewSUT() {
        return XMLEncoder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.beans.XMLEncoder#XMLEncoder(java.io.OutputStream, String, boolean, int) public
     * java.beans.XMLEncoder(java.io.OutputStream,java.lang.String,boolean,int)}.
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
    public void create_XMLEncoder_OutputStream_String_boolean_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final XMLEncoder sut = null; // = new XMLEncoder(java.io.OutputStream, String, boolean, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.beans.XMLEncoder#XMLEncoder(java.io.OutputStream) public
     * java.beans.XMLEncoder(java.io.OutputStream)}.
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
    public void create_XMLEncoder_OutputStream()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final XMLEncoder sut = null; // = new XMLEncoder(java.io.OutputStream);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.XMLEncoder]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.XMLEncoder]

}

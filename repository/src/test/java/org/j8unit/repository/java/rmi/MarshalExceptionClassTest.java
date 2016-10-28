package org.j8unit.repository.java.rmi;

import java.rmi.MarshalException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MarshalExceptionClassTest
implements org.j8unit.repository.java.rmi.MarshalExceptionClassTests<MarshalException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.rmi.MarshalException]

    @Override
    public Class<MarshalException> createNewSUT() {
        return MarshalException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link MarshalException#MarshalException(String)
     * public java.rmi.MarshalException(java.lang.String)}.
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
    public void create_MarshalException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MarshalException sut = null; // = new MarshalException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link MarshalException#MarshalException(String, Exception) public
     * java.rmi.MarshalException(java.lang.String,java.lang.Exception)}.
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
    public void create_MarshalException_String_Exception()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final MarshalException sut = null; // = new MarshalException(String, Exception);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.rmi.MarshalException]

}

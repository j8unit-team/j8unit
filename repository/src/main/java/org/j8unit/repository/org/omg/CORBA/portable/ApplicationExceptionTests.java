package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link org.omg.CORBA.portable.ApplicationException class org.omg.CORBA.portable.ApplicationException},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.org.omg.CORBA.portable.ApplicationExceptionClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ApplicationExceptionTests<SUT extends org.omg.CORBA.portable.ApplicationException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT>
{

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.portable.ApplicationException#getId() public java.lang.String org.omg.CORBA.portable.ApplicationException.getId()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getId() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link org.omg.CORBA.portable.ApplicationException#getInputStream() public org.omg.CORBA.portable.InputStream org.omg.CORBA.portable.ApplicationException.getInputStream()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInputStream() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

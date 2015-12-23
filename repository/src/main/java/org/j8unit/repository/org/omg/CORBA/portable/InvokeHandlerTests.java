package org.j8unit.repository.org.omg.CORBA.portable;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain org.omg.CORBA.portable.InvokeHandler interface
 * org.omg.CORBA.portable.InvokeHandler}, containing all instance relevant test methods (i.&thinsp;e., test methods of
 * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.org.omg.CORBA.portable.InvokeHandlerTests}.
 * </p>
 *
 * @see org.j8unit.repository.org.omg.CORBA.portable.InvokeHandlerClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim org.omg.CORBA.portable.InvokeHandler
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvokeHandlerTests<SUT extends org.omg.CORBA.portable.InvokeHandler>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link org.omg.CORBA.portable.InvokeHandler#_invoke(java.lang.String, org.omg.CORBA.portable.InputStream, org.omg.CORBA.portable.ResponseHandler)
     * public abstract org.omg.CORBA.portable.OutputStream
     * org.omg.CORBA.portable.InvokeHandler._invoke(java.lang.String,org.omg.CORBA.portable.InputStream,org.omg.CORBA.portable.ResponseHandler)
     * throws org.omg.CORBA.SystemException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim org.omg.CORBA.portable.InvokeHandler#_invoke(java.lang.String, org.omg.CORBA.portable.InputStream,
     *             org.omg.CORBA.portable.ResponseHandler)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test__invoke_String_InputStream_ResponseHandler()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

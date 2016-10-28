package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.UnknownUserException;

@RunWith(J8Unit4.class)
public class UnknownUserExceptionClassTest
implements org.j8unit.repository.org.omg.CORBA.UnknownUserExceptionClassTests<UnknownUserException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.UnknownUserException]

    @Override
    public Class<UnknownUserException> createNewSUT() {
        return UnknownUserException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.UnknownUserException#UnknownUserException() public org.omg.CORBA.UnknownUserException()}.
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
    public void create_UnknownUserException()
    throws Exception {
        // create new instance
        final UnknownUserException sut = new UnknownUserException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.UnknownUserException#UnknownUserException(org.omg.CORBA.Any) public
     * org.omg.CORBA.UnknownUserException(org.omg.CORBA.Any)}.
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
    public void create_UnknownUserException_Any()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnknownUserException sut = null; // = new UnknownUserException(org.omg.CORBA.Any);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.UnknownUserException]

}

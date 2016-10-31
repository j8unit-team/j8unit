package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.UnknownUserExceptionHolder;

@RunWith(J8Unit4.class)
public class UnknownUserExceptionHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.UnknownUserExceptionHolderClassTests<UnknownUserExceptionHolder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.UnknownUserExceptionHolder]

    @Override
    public Class<UnknownUserExceptionHolder> createNewSUT() {
        return UnknownUserExceptionHolder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.UnknownUserExceptionHolder#UnknownUserExceptionHolder(org.omg.CORBA.UnknownUserException)
     * public org.omg.CORBA.UnknownUserExceptionHolder(org.omg.CORBA.UnknownUserException)}.
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
    public void create_UnknownUserExceptionHolder_UnknownUserException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final UnknownUserExceptionHolder sut = null; // = new
                                                     // UnknownUserExceptionHolder(org.omg.CORBA.UnknownUserException);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.UnknownUserExceptionHolder#UnknownUserExceptionHolder() public
     * org.omg.CORBA.UnknownUserExceptionHolder()}.
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
    public void create_UnknownUserExceptionHolder()
    throws Exception {
        // create new instance
        final UnknownUserExceptionHolder sut = new UnknownUserExceptionHolder();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.UnknownUserExceptionHolder]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.UnknownUserExceptionHolder]

}

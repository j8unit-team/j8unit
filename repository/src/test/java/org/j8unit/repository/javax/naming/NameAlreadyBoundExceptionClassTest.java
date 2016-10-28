package org.j8unit.repository.javax.naming;

import javax.naming.NameAlreadyBoundException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NameAlreadyBoundExceptionClassTest
implements org.j8unit.repository.javax.naming.NameAlreadyBoundExceptionClassTests<NameAlreadyBoundException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.NameAlreadyBoundException]

    @Override
    public Class<NameAlreadyBoundException> createNewSUT() {
        return NameAlreadyBoundException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link NameAlreadyBoundException#NameAlreadyBoundException(String) public
     * javax.naming.NameAlreadyBoundException(java.lang.String)}.
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
    public void create_NameAlreadyBoundException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NameAlreadyBoundException sut = null; // = new NameAlreadyBoundException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link NameAlreadyBoundException#NameAlreadyBoundException() public javax.naming.NameAlreadyBoundException()}.
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
    public void create_NameAlreadyBoundException()
    throws Exception {
        // create new instance
        final NameAlreadyBoundException sut = new NameAlreadyBoundException();
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.NameAlreadyBoundException]

}

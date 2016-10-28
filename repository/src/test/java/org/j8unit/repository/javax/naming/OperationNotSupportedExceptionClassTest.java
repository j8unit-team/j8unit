package org.j8unit.repository.javax.naming;

import javax.naming.OperationNotSupportedException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OperationNotSupportedExceptionClassTest
implements org.j8unit.repository.javax.naming.OperationNotSupportedExceptionClassTests<OperationNotSupportedException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.OperationNotSupportedException]

    @Override
    public Class<OperationNotSupportedException> createNewSUT() {
        return OperationNotSupportedException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link OperationNotSupportedException#OperationNotSupportedException() public
     * javax.naming.OperationNotSupportedException()}.
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
    public void create_OperationNotSupportedException()
    throws Exception {
        // create new instance
        final OperationNotSupportedException sut = new OperationNotSupportedException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link OperationNotSupportedException#OperationNotSupportedException(String) public
     * javax.naming.OperationNotSupportedException(java.lang.String)}.
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
    public void create_OperationNotSupportedException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final OperationNotSupportedException sut = null; // = new OperationNotSupportedException(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.OperationNotSupportedException]

}

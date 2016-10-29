package org.j8unit.repository.javax.naming;

import javax.naming.CannotProceedException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CannotProceedExceptionClassTest
implements org.j8unit.repository.javax.naming.CannotProceedExceptionClassTests<CannotProceedException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.CannotProceedException]

    @Override
    public Class<CannotProceedException> createNewSUT() {
        return CannotProceedException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.CannotProceedException#CannotProceedException() public
     * javax.naming.CannotProceedException()}.
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
    public void create_CannotProceedException()
    throws Exception {
        // create new instance
        final CannotProceedException sut = new CannotProceedException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.CannotProceedException#CannotProceedException(String) public
     * javax.naming.CannotProceedException(java.lang.String)}.
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
    public void create_CannotProceedException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final CannotProceedException sut = null; // = new CannotProceedException(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.CannotProceedException]

}

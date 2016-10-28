package org.j8unit.repository.javax.security.auth;

import javax.security.auth.DestroyFailedException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DestroyFailedExceptionClassTest
implements org.j8unit.repository.javax.security.auth.DestroyFailedExceptionClassTests<DestroyFailedException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.security.auth.DestroyFailedException]

    @Override
    public Class<DestroyFailedException> createNewSUT() {
        return DestroyFailedException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link DestroyFailedException#DestroyFailedException()
     * public javax.security.auth.DestroyFailedException()}.
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
    public void create_DestroyFailedException()
    throws Exception {
        // create new instance
        final DestroyFailedException sut = new DestroyFailedException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link DestroyFailedException#DestroyFailedException(String) public
     * javax.security.auth.DestroyFailedException(java.lang.String)}.
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
    public void create_DestroyFailedException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final DestroyFailedException sut = null; // = new DestroyFailedException(String);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.security.auth.DestroyFailedException]

}

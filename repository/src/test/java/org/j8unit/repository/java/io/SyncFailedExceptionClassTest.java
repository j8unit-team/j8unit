package org.j8unit.repository.java.io;

import java.io.SyncFailedException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SyncFailedException} (by simply reusing
 * the J8Unit test interface {@link SyncFailedExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class SyncFailedExceptionClassTest
implements SyncFailedExceptionClassTests<SyncFailedException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.SyncFailedException]

    @Override
    public Class<SyncFailedException> createNewSUT() {
        return SyncFailedException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.io.SyncFailedException#SyncFailedException(String) public
     * java.io.SyncFailedException(java.lang.String)}.
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
    public void create_SyncFailedException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SyncFailedException sut = null; // = new SyncFailedException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.SyncFailedException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.SyncFailedException]

}

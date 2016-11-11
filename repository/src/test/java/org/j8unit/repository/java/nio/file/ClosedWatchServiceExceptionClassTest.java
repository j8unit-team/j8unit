package org.j8unit.repository.java.nio.file;

import java.nio.file.ClosedWatchServiceException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ClosedWatchServiceException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.nio.file.ClosedWatchServiceExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class ClosedWatchServiceExceptionClassTest
implements ClosedWatchServiceExceptionClassTests<ClosedWatchServiceException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.ClosedWatchServiceException]

    @Override
    public Class<ClosedWatchServiceException> createNewSUT() {
        return ClosedWatchServiceException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.nio.file.ClosedWatchServiceException#ClosedWatchServiceException() public
     * java.nio.file.ClosedWatchServiceException()}.
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
    public void create_ClosedWatchServiceException()
    throws Exception {
        // create new instance
        final ClosedWatchServiceException sut = new ClosedWatchServiceException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.ClosedWatchServiceException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.ClosedWatchServiceException]

}

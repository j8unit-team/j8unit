package org.j8unit.repository.java.io;

import java.io.IOError;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IOError} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.io.IOErrorClassTests}).
 */

@RunWith(J8Unit4.class)
public class IOErrorClassTest
implements IOErrorClassTests<IOError> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.IOError]

    @Override
    public Class<IOError> createNewSUT() {
        return IOError.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.io.IOError#IOError(Throwable) public
     * java.io.IOError(java.lang.Throwable)}.
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
    public void create_IOError_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final IOError sut = null; // = new IOError(Throwable);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.IOError]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.IOError]

}

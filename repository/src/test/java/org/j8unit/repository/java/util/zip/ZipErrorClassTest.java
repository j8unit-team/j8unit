package org.j8unit.repository.java.util.zip;

import java.util.zip.ZipError;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ZipError} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.zip.ZipErrorClassTests}).
 */

@RunWith(J8Unit4.class)
public class ZipErrorClassTest
implements ZipErrorClassTests<ZipError> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.zip.ZipError]

    @Override
    public Class<ZipError> createNewSUT() {
        return ZipError.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.zip.ZipError#ZipError(String) public
     * java.util.zip.ZipError(java.lang.String)}.
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
    public void create_ZipError_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ZipError sut = null; // = new ZipError(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.zip.ZipError]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.zip.ZipError]

}

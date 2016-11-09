package org.j8unit.repository.java.util.prefs;

import java.util.prefs.BackingStoreException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BackingStoreException} (by simply reusing
 * the J8Unit test interface {@link BackingStoreExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class BackingStoreExceptionClassTest
implements BackingStoreExceptionClassTests<BackingStoreException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.prefs.BackingStoreException]

    @Override
    public Class<BackingStoreException> createNewSUT() {
        return BackingStoreException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.prefs.BackingStoreException#BackingStoreException(String) public
     * java.util.prefs.BackingStoreException(java.lang.String)}.
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
    public void create_BackingStoreException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BackingStoreException sut = null; // = new BackingStoreException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.prefs.BackingStoreException#BackingStoreException(Throwable) public
     * java.util.prefs.BackingStoreException(java.lang.Throwable)}.
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
    public void create_BackingStoreException_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final BackingStoreException sut = null; // = new BackingStoreException(Throwable);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.prefs.BackingStoreException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.prefs.BackingStoreException]

}

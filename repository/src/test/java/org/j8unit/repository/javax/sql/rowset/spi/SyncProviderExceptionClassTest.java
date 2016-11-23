package org.j8unit.repository.javax.sql.rowset.spi;

import javax.sql.rowset.spi.SyncProviderException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SyncProviderException} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.sql.rowset.spi.SyncProviderExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class SyncProviderExceptionClassTest
implements SyncProviderExceptionClassTests<SyncProviderException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.sql.rowset.spi.SyncProviderException]

    @Override
    public Class<SyncProviderException> createNewSUT() {
        return SyncProviderException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sql.rowset.spi.SyncProviderException#SyncProviderException() public
     * javax.sql.rowset.spi.SyncProviderException()}.
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
    public void create_SyncProviderException()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SyncProviderException sut = new SyncProviderException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sql.rowset.spi.SyncProviderException#SyncProviderException(javax.sql.rowset.spi.SyncResolver) public
     * javax.sql.rowset.spi.SyncProviderException(javax.sql.rowset.spi.SyncResolver)}.
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
    public void create_SyncProviderException_SyncResolver()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SyncProviderException sut = null; // = new SyncProviderException(javax.sql.rowset.spi.SyncResolver);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.sql.rowset.spi.SyncProviderException#SyncProviderException(String) public
     * javax.sql.rowset.spi.SyncProviderException(java.lang.String)}.
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
    public void create_SyncProviderException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final SyncProviderException sut = null; // = new SyncProviderException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.sql.rowset.spi.SyncProviderException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.sql.rowset.spi.SyncProviderException]

}

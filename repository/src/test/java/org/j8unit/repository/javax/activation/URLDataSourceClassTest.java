package org.j8unit.repository.javax.activation;

import javax.activation.URLDataSource;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link URLDataSource} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.activation.URLDataSourceClassTests}).
 */

@RunWith(J8Unit4.class)
public class URLDataSourceClassTest
implements URLDataSourceClassTests<URLDataSource> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.activation.URLDataSource]

    @Override
    public Class<URLDataSource> createNewSUT() {
        return URLDataSource.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.activation.URLDataSource#URLDataSource(java.net.URL) public
     * javax.activation.URLDataSource(java.net.URL)}.
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
    public void create_URLDataSource_URL()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final URLDataSource sut = null; // = new URLDataSource(java.net.URL);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.activation.URLDataSource]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.activation.URLDataSource]

}

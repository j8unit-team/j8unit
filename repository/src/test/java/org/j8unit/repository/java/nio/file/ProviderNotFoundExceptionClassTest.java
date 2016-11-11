package org.j8unit.repository.java.nio.file;

import java.nio.file.ProviderNotFoundException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ProviderNotFoundException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.nio.file.ProviderNotFoundExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class ProviderNotFoundExceptionClassTest
implements ProviderNotFoundExceptionClassTests<ProviderNotFoundException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.ProviderNotFoundException]

    @Override
    public Class<ProviderNotFoundException> createNewSUT() {
        return ProviderNotFoundException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.nio.file.ProviderNotFoundException#ProviderNotFoundException() public
     * java.nio.file.ProviderNotFoundException()}.
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
    public void create_ProviderNotFoundException()
    throws Exception {
        // create new instance
        final ProviderNotFoundException sut = new ProviderNotFoundException();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.nio.file.ProviderNotFoundException#ProviderNotFoundException(String) public
     * java.nio.file.ProviderNotFoundException(java.lang.String)}.
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
    public void create_ProviderNotFoundException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ProviderNotFoundException sut = null; // = new ProviderNotFoundException(String);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.ProviderNotFoundException]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.ProviderNotFoundException]

}

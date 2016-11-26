package org.j8unit.repository.java.util;

import java.util.ServiceConfigurationError;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ServiceConfigurationError} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.util.ServiceConfigurationErrorClassTests}).
 */
@RunWith(J8Unit4.class)
public class ServiceConfigurationErrorClassTest
implements ServiceConfigurationErrorClassTests<ServiceConfigurationError> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.ServiceConfigurationError]

    @Override
    public Class<ServiceConfigurationError> createNewSUT() {
        return ServiceConfigurationError.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.ServiceConfigurationError#ServiceConfigurationError(String) public
     * java.util.ServiceConfigurationError(java.lang.String)}.
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
    public void create_ServiceConfigurationError_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ServiceConfigurationError sut = null; // = new ServiceConfigurationError(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.ServiceConfigurationError#ServiceConfigurationError(String, Throwable) public
     * java.util.ServiceConfigurationError(java.lang.String,java.lang.Throwable)}.
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
    public void create_ServiceConfigurationError_String_Throwable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ServiceConfigurationError sut = null; // = new ServiceConfigurationError(String, Throwable);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.ServiceConfigurationError]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.ServiceConfigurationError]

}

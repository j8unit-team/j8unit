package org.j8unit.repository.javax.naming;

import javax.naming.ConfigurationException;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ConfigurationException} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.naming.ConfigurationExceptionClassTests}).
 */

@RunWith(J8Unit4.class)
public class ConfigurationExceptionClassTest
implements ConfigurationExceptionClassTests<ConfigurationException> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.naming.ConfigurationException]

    @Override
    public Class<ConfigurationException> createNewSUT() {
        return ConfigurationException.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.ConfigurationException#ConfigurationException(String) public
     * javax.naming.ConfigurationException(java.lang.String)}.
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
    public void create_ConfigurationException_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ConfigurationException sut = null; // = new ConfigurationException(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.naming.ConfigurationException#ConfigurationException() public
     * javax.naming.ConfigurationException()}.
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
    public void create_ConfigurationException()
    throws Exception {
        // create new instance
        final ConfigurationException sut = new ConfigurationException();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.naming.ConfigurationException]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.naming.ConfigurationException]

}

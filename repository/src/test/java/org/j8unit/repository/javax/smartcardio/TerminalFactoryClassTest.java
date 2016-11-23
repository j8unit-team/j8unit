package org.j8unit.repository.javax.smartcardio;

import javax.smartcardio.TerminalFactory;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TerminalFactory} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.smartcardio.TerminalFactoryClassTests}).
 */

@RunWith(J8Unit4.class)
@SuppressWarnings("restriction")
public class TerminalFactoryClassTest
implements TerminalFactoryClassTests<TerminalFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.smartcardio.TerminalFactory]

    @Override
    public Class<TerminalFactory> createNewSUT() {
        return TerminalFactory.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.smartcardio.TerminalFactory#getDefaultType()
     * public static java.lang.String javax.smartcardio.TerminalFactory.getDefaultType()}.
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
    public void test_getDefaultType()
    throws Exception {
        // write some test for {@link javax.smartcardio.TerminalFactory#getDefaultType()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.smartcardio.TerminalFactory#getInstance(String, Object, java.security.Provider) public static
     * javax.smartcardio.TerminalFactory
     * javax.smartcardio.TerminalFactory.getInstance(java.lang.String,java.lang.Object,java.security.Provider) throws
     * java.security.NoSuchAlgorithmException}.
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
    public void test_getInstance_String_Object_Provider()
    throws Exception {
        // write some test for {@link javax.smartcardio.TerminalFactory#getInstance(String, Object,
        // java.security.Provider)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.smartcardio.TerminalFactory#getInstance(String, Object, String) public static
     * javax.smartcardio.TerminalFactory
     * javax.smartcardio.TerminalFactory.getInstance(java.lang.String,java.lang.Object,java.lang.String) throws
     * java.security.NoSuchAlgorithmException,java.security.NoSuchProviderException}.
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
    public void test_getInstance_String_Object_String()
    throws Exception {
        // write some test for {@link javax.smartcardio.TerminalFactory#getInstance(String, Object, String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.smartcardio.TerminalFactory#getInstance(String, Object) public static
     * javax.smartcardio.TerminalFactory
     * javax.smartcardio.TerminalFactory.getInstance(java.lang.String,java.lang.Object) throws
     * java.security.NoSuchAlgorithmException}.
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
    public void test_getInstance_String_Object()
    throws Exception {
        // write some test for {@link javax.smartcardio.TerminalFactory#getInstance(String, Object)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.smartcardio.TerminalFactory#getDefault()
     * public static javax.smartcardio.TerminalFactory javax.smartcardio.TerminalFactory.getDefault()}.
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
    public void test_getDefault()
    throws Exception {
        // write some test for {@link javax.smartcardio.TerminalFactory#getDefault()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.smartcardio.TerminalFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.smartcardio.TerminalFactory]

}

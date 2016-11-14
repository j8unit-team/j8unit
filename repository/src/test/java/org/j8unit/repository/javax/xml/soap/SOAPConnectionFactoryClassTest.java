package org.j8unit.repository.javax.xml.soap;

import static org.junit.Assert.fail;
import javax.xml.soap.SOAPConnectionFactory;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SOAPConnectionFactory} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.soap.SOAPConnectionFactoryClassTests}).
 */

@RunWith(J8Unit4.class)
public class SOAPConnectionFactoryClassTest
implements SOAPConnectionFactoryClassTests<SOAPConnectionFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.soap.SOAPConnectionFactory]

    @Override
    public Class<SOAPConnectionFactory> createNewSUT() {
        return SOAPConnectionFactory.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.xml.soap.SOAPConnectionFactory#SOAPConnectionFactory() public
     * javax.xml.soap.SOAPConnectionFactory()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("Cannot construct an abstract class!")
    @Test
    @Category(Draft.class)
    public void create_SOAPConnectionFactory()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.xml.soap.SOAPConnectionFactory#newInstance()
     * public static javax.xml.soap.SOAPConnectionFactory javax.xml.soap.SOAPConnectionFactory.newInstance() throws
     * javax.xml.soap.SOAPException,java.lang.UnsupportedOperationException}.
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
    public void test_newInstance()
    throws Exception {
        // write some test for {@link javax.xml.soap.SOAPConnectionFactory#newInstance()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.soap.SOAPConnectionFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.soap.SOAPConnectionFactory]

}

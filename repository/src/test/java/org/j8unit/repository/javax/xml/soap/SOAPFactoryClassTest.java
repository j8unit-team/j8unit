package org.j8unit.repository.javax.xml.soap;

import static org.junit.Assert.fail;
import javax.xml.soap.SOAPFactory;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SOAPFactory} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.soap.SOAPFactoryClassTests}).
 */

@RunWith(J8Unit4.class)
public class SOAPFactoryClassTest
implements SOAPFactoryClassTests<SOAPFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.soap.SOAPFactory]

    @Override
    public Class<SOAPFactory> createNewSUT() {
        return SOAPFactory.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.xml.soap.SOAPFactory#SOAPFactory() public
     * javax.xml.soap.SOAPFactory()}.
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
    public void create_SOAPFactory()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.xml.soap.SOAPFactory#newInstance() public
     * static javax.xml.soap.SOAPFactory javax.xml.soap.SOAPFactory.newInstance() throws javax.xml.soap.SOAPException}.
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
        // write some test for {@link javax.xml.soap.SOAPFactory#newInstance()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.xml.soap.SOAPFactory#newInstance(String)
     * public static javax.xml.soap.SOAPFactory javax.xml.soap.SOAPFactory.newInstance(java.lang.String) throws
     * javax.xml.soap.SOAPException}.
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
    public void test_newInstance_String()
    throws Exception {
        // write some test for {@link javax.xml.soap.SOAPFactory#newInstance(String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.soap.SOAPFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.soap.SOAPFactory]

}

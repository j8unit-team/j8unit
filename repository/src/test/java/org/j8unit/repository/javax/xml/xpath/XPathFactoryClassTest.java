package org.j8unit.repository.javax.xml.xpath;

import javax.xml.xpath.XPathFactory;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XPathFactory} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.xpath.XPathFactoryClassTests}).
 */
@RunWith(J8Unit4.class)
public class XPathFactoryClassTest
implements XPathFactoryClassTests<XPathFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.xpath.XPathFactory]

    @Override
    public Class<XPathFactory> createNewSUT() {
        return XPathFactory.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.xpath.XPathFactory#newInstance(String, String, ClassLoader) public static
     * javax.xml.xpath.XPathFactory
     * javax.xml.xpath.XPathFactory.newInstance(java.lang.String,java.lang.String,java.lang.ClassLoader) throws
     * javax.xml.xpath.XPathFactoryConfigurationException}.
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
    public void test_newInstance_String_String_ClassLoader()
    throws Exception {
        // write some test for {@link javax.xml.xpath.XPathFactory#newInstance(String, String, ClassLoader)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.xml.xpath.XPathFactory#newInstance() public
     * static javax.xml.xpath.XPathFactory javax.xml.xpath.XPathFactory.newInstance()}.
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
        // write some test for {@link javax.xml.xpath.XPathFactory#newInstance()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.xml.xpath.XPathFactory#newInstance(String)
     * public static javax.xml.xpath.XPathFactory javax.xml.xpath.XPathFactory.newInstance(java.lang.String) throws
     * javax.xml.xpath.XPathFactoryConfigurationException}.
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
        // write some test for {@link javax.xml.xpath.XPathFactory#newInstance(String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.xpath.XPathFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.xpath.XPathFactory]

}

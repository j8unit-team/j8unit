package org.j8unit.repository.javax.xml.datatype;

import javax.xml.datatype.DatatypeFactory;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DatatypeFactory} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.datatype.DatatypeFactoryClassTests}).
 */

@RunWith(J8Unit4.class)
public class DatatypeFactoryClassTest
implements DatatypeFactoryClassTests<DatatypeFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.datatype.DatatypeFactory]

    @Override
    public Class<DatatypeFactory> createNewSUT() {
        return DatatypeFactory.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.datatype.DatatypeFactory#newInstance(String, ClassLoader) public static
     * javax.xml.datatype.DatatypeFactory
     * javax.xml.datatype.DatatypeFactory.newInstance(java.lang.String,java.lang.ClassLoader) throws
     * javax.xml.datatype.DatatypeConfigurationException}.
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
    public void test_newInstance_String_ClassLoader()
    throws Exception {
        // write some test for {@link javax.xml.datatype.DatatypeFactory#newInstance(String, ClassLoader)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.xml.datatype.DatatypeFactory#newInstance()
     * public static javax.xml.datatype.DatatypeFactory javax.xml.datatype.DatatypeFactory.newInstance() throws
     * javax.xml.datatype.DatatypeConfigurationException}.
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
        // write some test for {@link javax.xml.datatype.DatatypeFactory#newInstance()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.datatype.DatatypeFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.datatype.DatatypeFactory]

}

package org.j8unit.repository.javax.xml.bind.annotation;

import javax.xml.bind.annotation.XmlAccessOrder;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XmlAccessOrder} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.bind.annotation.XmlAccessOrderClassTests}).
 */

@RunWith(J8Unit4.class)
public class XmlAccessOrderClassTest
implements XmlAccessOrderClassTests<XmlAccessOrder> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.annotation.XmlAccessOrder]

    @Override
    public Class<XmlAccessOrder> createNewSUT() {
        return XmlAccessOrder.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.xml.bind.annotation.XmlAccessOrder#values()
     * public static javax.xml.bind.annotation.XmlAccessOrder[] javax.xml.bind.annotation.XmlAccessOrder.values()}.
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
    public void test_values()
    throws Exception {
        // write some test for {@link javax.xml.bind.annotation.XmlAccessOrder#values()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.xml.bind.annotation.XmlAccessOrder#valueOf(String) public static
     * javax.xml.bind.annotation.XmlAccessOrder javax.xml.bind.annotation.XmlAccessOrder.valueOf(java.lang.String)}.
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
    public void test_valueOf_String()
    throws Exception {
        // write some test for {@link javax.xml.bind.annotation.XmlAccessOrder#valueOf(String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.bind.annotation.XmlAccessOrder]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.annotation.XmlAccessOrder]

}

package org.j8unit.repository.javax.xml.bind;

import static org.junit.Assert.fail;
import javax.xml.bind.JAXBIntrospector;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JAXBIntrospectorClassTest
implements org.j8unit.repository.javax.xml.bind.JAXBIntrospectorClassTests<JAXBIntrospector> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.bind.JAXBIntrospector]

    @Override
    public Class<JAXBIntrospector> createNewSUT() {
        return JAXBIntrospector.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link JAXBIntrospector#JAXBIntrospector() public
     * javax.xml.bind.JAXBIntrospector()}.
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
    public void create_JAXBIntrospector()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link JAXBIntrospector#getValue(Object) public static
     * java.lang.Object javax.xml.bind.JAXBIntrospector.getValue(java.lang.Object)}.
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
    public void test_getValue_Object()
    throws Exception {
        // write some test for {@link JAXBIntrospector#getValue(Object)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.bind.JAXBIntrospector]

}

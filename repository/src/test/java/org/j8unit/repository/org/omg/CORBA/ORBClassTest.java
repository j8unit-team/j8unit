package org.j8unit.repository.org.omg.CORBA;

import static org.junit.Assert.fail;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.ORB;

@RunWith(J8Unit4.class)
public class ORBClassTest
implements org.j8unit.repository.org.omg.CORBA.ORBClassTests<ORB> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.ORB]

    @Override
    public Class<ORB> createNewSUT() {
        return ORB.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.ORB#ORB() public
     * org.omg.CORBA.ORB()}.
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
    public void create_ORB()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.CORBA.ORB#init(String[], java.util.Properties) public static org.omg.CORBA.ORB
     * org.omg.CORBA.ORB.init(java.lang.String[],java.util.Properties)}.
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
    public void test_init_StringArray_Properties()
    throws Exception {
        // write some test for {@link org.omg.CORBA.ORB#init(String[], java.util.Properties)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.CORBA.ORB#init(java.applet.Applet, java.util.Properties) public static org.omg.CORBA.ORB
     * org.omg.CORBA.ORB.init(java.applet.Applet,java.util.Properties)}.
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
    public void test_init_Applet_Properties()
    throws Exception {
        // write some test for {@link org.omg.CORBA.ORB#init(java.applet.Applet, java.util.Properties)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link org.omg.CORBA.ORB#init() public static synchronized
     * org.omg.CORBA.ORB org.omg.CORBA.ORB.init()}.
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
    public void test_init()
    throws Exception {
        // write some test for {@link org.omg.CORBA.ORB#init()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.ORB]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.ORB]

}

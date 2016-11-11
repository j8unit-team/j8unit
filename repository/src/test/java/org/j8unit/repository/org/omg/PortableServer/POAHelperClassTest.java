package org.j8unit.repository.org.omg.PortableServer;

import static org.junit.Assert.fail;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.PortableServer.POAHelper;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link POAHelper} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.org.omg.PortableServer.POAHelperClassTests}).
 */

@RunWith(J8Unit4.class)
public class POAHelperClassTest
implements POAHelperClassTests<POAHelper> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableServer.POAHelper]

    @Override
    public Class<POAHelper> createNewSUT() {
        return POAHelper.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.PortableServer.POAHelper#POAHelper()
     * public org.omg.PortableServer.POAHelper()}.
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
    public void create_POAHelper()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.PortableServer.POAHelper#extract(org.omg.CORBA.Any) public static org.omg.PortableServer.POA
     * org.omg.PortableServer.POAHelper.extract(org.omg.CORBA.Any)}.
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
    public void test_extract_Any()
    throws Exception {
        // write some test for {@link org.omg.PortableServer.POAHelper#extract(org.omg.CORBA.Any)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.PortableServer.POAHelper#read(org.omg.CORBA.portable.InputStream) public static
     * org.omg.PortableServer.POA org.omg.PortableServer.POAHelper.read(org.omg.CORBA.portable.InputStream)}.
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
    public void test_read_InputStream()
    throws Exception {
        // write some test for {@link org.omg.PortableServer.POAHelper#read(org.omg.CORBA.portable.InputStream)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link org.omg.PortableServer.POAHelper#id() public static
     * java.lang.String org.omg.PortableServer.POAHelper.id()}.
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
    public void test_id()
    throws Exception {
        // write some test for {@link org.omg.PortableServer.POAHelper#id()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.PortableServer.POAHelper#narrow(org.omg.CORBA.Object) public static org.omg.PortableServer.POA
     * org.omg.PortableServer.POAHelper.narrow(org.omg.CORBA.Object)}.
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
    public void test_narrow_Object()
    throws Exception {
        // write some test for {@link org.omg.PortableServer.POAHelper#narrow(org.omg.CORBA.Object)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.PortableServer.POAHelper#insert(org.omg.CORBA.Any, org.omg.PortableServer.POA) public static void
     * org.omg.PortableServer.POAHelper.insert(org.omg.CORBA.Any,org.omg.PortableServer.POA)}.
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
    public void test_insert_Any_POA()
    throws Exception {
        // write some test for {@link org.omg.PortableServer.POAHelper#insert(org.omg.CORBA.Any,
        // org.omg.PortableServer.POA)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.PortableServer.POAHelper#write(org.omg.CORBA.portable.OutputStream, org.omg.PortableServer.POA)
     * public static void
     * org.omg.PortableServer.POAHelper.write(org.omg.CORBA.portable.OutputStream,org.omg.PortableServer.POA)}.
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
    public void test_write_OutputStream_POA()
    throws Exception {
        // write some test for {@link org.omg.PortableServer.POAHelper#write(org.omg.CORBA.portable.OutputStream,
        // org.omg.PortableServer.POA)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link org.omg.PortableServer.POAHelper#type() public
     * static synchronized org.omg.CORBA.TypeCode org.omg.PortableServer.POAHelper.type()}.
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
    public void test_type()
    throws Exception {
        // write some test for {@link org.omg.PortableServer.POAHelper#type()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableServer.POAHelper]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableServer.POAHelper]

}

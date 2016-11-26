package org.j8unit.repository.org.omg.CORBA;

import static org.junit.Assert.fail;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.PolicyHelper;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PolicyHelper} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.PolicyHelperClassTests}).
 */
@RunWith(J8Unit4.class)
public class PolicyHelperClassTest
implements PolicyHelperClassTests<PolicyHelper> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.PolicyHelper]

    @Override
    public Class<PolicyHelper> createNewSUT() {
        return PolicyHelper.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.CORBA.PolicyHelper#PolicyHelper()
     * public org.omg.CORBA.PolicyHelper()}.
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
    public void create_PolicyHelper()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.CORBA.PolicyHelper#extract(org.omg.CORBA.Any) public static org.omg.CORBA.Policy
     * org.omg.CORBA.PolicyHelper.extract(org.omg.CORBA.Any)}.
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
        // write some test for {@link org.omg.CORBA.PolicyHelper#extract(org.omg.CORBA.Any)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.CORBA.PolicyHelper#read(org.omg.CORBA.portable.InputStream) public static org.omg.CORBA.Policy
     * org.omg.CORBA.PolicyHelper.read(org.omg.CORBA.portable.InputStream)}.
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
        // write some test for {@link org.omg.CORBA.PolicyHelper#read(org.omg.CORBA.portable.InputStream)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.CORBA.PolicyHelper#write(org.omg.CORBA.portable.OutputStream, org.omg.CORBA.Policy) public static
     * void org.omg.CORBA.PolicyHelper.write(org.omg.CORBA.portable.OutputStream,org.omg.CORBA.Policy)}.
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
    public void test_write_OutputStream_Policy()
    throws Exception {
        // write some test for {@link org.omg.CORBA.PolicyHelper#write(org.omg.CORBA.portable.OutputStream,
        // org.omg.CORBA.Policy)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link org.omg.CORBA.PolicyHelper#type() public static
     * synchronized org.omg.CORBA.TypeCode org.omg.CORBA.PolicyHelper.type()}.
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
        // write some test for {@link org.omg.CORBA.PolicyHelper#type()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.CORBA.PolicyHelper#insert(org.omg.CORBA.Any, org.omg.CORBA.Policy) public static void
     * org.omg.CORBA.PolicyHelper.insert(org.omg.CORBA.Any,org.omg.CORBA.Policy)}.
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
    public void test_insert_Any_Policy()
    throws Exception {
        // write some test for {@link org.omg.CORBA.PolicyHelper#insert(org.omg.CORBA.Any, org.omg.CORBA.Policy)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link org.omg.CORBA.PolicyHelper#id() public static
     * java.lang.String org.omg.CORBA.PolicyHelper.id()}.
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
        // write some test for {@link org.omg.CORBA.PolicyHelper#id()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.CORBA.PolicyHelper#narrow(org.omg.CORBA.Object) public static org.omg.CORBA.Policy
     * org.omg.CORBA.PolicyHelper.narrow(org.omg.CORBA.Object)}.
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
        // write some test for {@link org.omg.CORBA.PolicyHelper#narrow(org.omg.CORBA.Object)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.PolicyHelper]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.PolicyHelper]

}

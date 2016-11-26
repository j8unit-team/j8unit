package org.j8unit.repository.org.omg.CORBA;

import static org.junit.Assert.fail;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.ParameterModeHelper;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ParameterModeHelper} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.ParameterModeHelperClassTests}).
 */
@RunWith(J8Unit4.class)
public class ParameterModeHelperClassTest
implements ParameterModeHelperClassTests<ParameterModeHelper> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.ParameterModeHelper]

    @Override
    public Class<ParameterModeHelper> createNewSUT() {
        return ParameterModeHelper.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.ParameterModeHelper#ParameterModeHelper() public org.omg.CORBA.ParameterModeHelper()}.
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
    public void create_ParameterModeHelper()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.CORBA.ParameterModeHelper#extract(org.omg.CORBA.Any) public static org.omg.CORBA.ParameterMode
     * org.omg.CORBA.ParameterModeHelper.extract(org.omg.CORBA.Any)}.
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
        // write some test for {@link org.omg.CORBA.ParameterModeHelper#extract(org.omg.CORBA.Any)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.CORBA.ParameterModeHelper#read(org.omg.CORBA.portable.InputStream) public static
     * org.omg.CORBA.ParameterMode org.omg.CORBA.ParameterModeHelper.read(org.omg.CORBA.portable.InputStream)}.
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
        // write some test for {@link org.omg.CORBA.ParameterModeHelper#read(org.omg.CORBA.portable.InputStream)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.CORBA.ParameterModeHelper#insert(org.omg.CORBA.Any, org.omg.CORBA.ParameterMode) public static
     * void org.omg.CORBA.ParameterModeHelper.insert(org.omg.CORBA.Any,org.omg.CORBA.ParameterMode)}.
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
    public void test_insert_Any_ParameterMode()
    throws Exception {
        // write some test for {@link org.omg.CORBA.ParameterModeHelper#insert(org.omg.CORBA.Any,
        // org.omg.CORBA.ParameterMode)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link org.omg.CORBA.ParameterModeHelper#id() public static
     * java.lang.String org.omg.CORBA.ParameterModeHelper.id()}.
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
        // write some test for {@link org.omg.CORBA.ParameterModeHelper#id()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link org.omg.CORBA.ParameterModeHelper#type() public
     * static synchronized org.omg.CORBA.TypeCode org.omg.CORBA.ParameterModeHelper.type()}.
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
        // write some test for {@link org.omg.CORBA.ParameterModeHelper#type()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.CORBA.ParameterModeHelper#write(org.omg.CORBA.portable.OutputStream, org.omg.CORBA.ParameterMode)
     * public static void
     * org.omg.CORBA.ParameterModeHelper.write(org.omg.CORBA.portable.OutputStream,org.omg.CORBA.ParameterMode)}.
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
    public void test_write_OutputStream_ParameterMode()
    throws Exception {
        // write some test for {@link org.omg.CORBA.ParameterModeHelper#write(org.omg.CORBA.portable.OutputStream,
        // org.omg.CORBA.ParameterMode)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.ParameterModeHelper]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.ParameterModeHelper]

}

package org.j8unit.repository.org.omg.CosNaming;

import static org.junit.Assert.fail;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CosNaming.BindingTypeHelper;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link BindingTypeHelper} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CosNaming.BindingTypeHelperClassTests}).
 */

@RunWith(J8Unit4.class)
public class BindingTypeHelperClassTest
implements BindingTypeHelperClassTests<BindingTypeHelper> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.BindingTypeHelper]

    @Override
    public Class<BindingTypeHelper> createNewSUT() {
        return BindingTypeHelper.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CosNaming.BindingTypeHelper#BindingTypeHelper() public org.omg.CosNaming.BindingTypeHelper()}.
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
    public void create_BindingTypeHelper()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.CosNaming.BindingTypeHelper#extract(org.omg.CORBA.Any) public static org.omg.CosNaming.BindingType
     * org.omg.CosNaming.BindingTypeHelper.extract(org.omg.CORBA.Any)}.
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
        // write some test for {@link org.omg.CosNaming.BindingTypeHelper#extract(org.omg.CORBA.Any)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.CosNaming.BindingTypeHelper#read(org.omg.CORBA.portable.InputStream) public static
     * org.omg.CosNaming.BindingType org.omg.CosNaming.BindingTypeHelper.read(org.omg.CORBA.portable.InputStream)}.
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
        // write some test for {@link org.omg.CosNaming.BindingTypeHelper#read(org.omg.CORBA.portable.InputStream)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.CosNaming.BindingTypeHelper#insert(org.omg.CORBA.Any, org.omg.CosNaming.BindingType) public static
     * void org.omg.CosNaming.BindingTypeHelper.insert(org.omg.CORBA.Any,org.omg.CosNaming.BindingType)}.
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
    public void test_insert_Any_BindingType()
    throws Exception {
        // write some test for {@link org.omg.CosNaming.BindingTypeHelper#insert(org.omg.CORBA.Any,
        // org.omg.CosNaming.BindingType)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link org.omg.CosNaming.BindingTypeHelper#id() public
     * static java.lang.String org.omg.CosNaming.BindingTypeHelper.id()}.
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
        // write some test for {@link org.omg.CosNaming.BindingTypeHelper#id()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link org.omg.CosNaming.BindingTypeHelper#type() public
     * static synchronized org.omg.CORBA.TypeCode org.omg.CosNaming.BindingTypeHelper.type()}.
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
        // write some test for {@link org.omg.CosNaming.BindingTypeHelper#type()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.CosNaming.BindingTypeHelper#write(org.omg.CORBA.portable.OutputStream, org.omg.CosNaming.BindingType)
     * public static void
     * org.omg.CosNaming.BindingTypeHelper.write(org.omg.CORBA.portable.OutputStream,org.omg.CosNaming.BindingType)}.
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
    public void test_write_OutputStream_BindingType()
    throws Exception {
        // write some test for {@link org.omg.CosNaming.BindingTypeHelper#write(org.omg.CORBA.portable.OutputStream,
        // org.omg.CosNaming.BindingType)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CosNaming.BindingTypeHelper]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.BindingTypeHelper]

}

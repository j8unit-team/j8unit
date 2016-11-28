package org.j8unit.repository.org.omg.DynamicAny;

import static org.junit.Assert.fail;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynAnyHelper;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DynAnyHelper} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.DynamicAny.DynAnyHelperClassTests}).
 */
@RunWith(J8Unit4.class)
public class DynAnyHelperClassTest
implements DynAnyHelperClassTests<DynAnyHelper> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynAnyHelper]

    @Override
    public Class<DynAnyHelper> createNewSUT() {
        return DynAnyHelper.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link org.omg.DynamicAny.DynAnyHelper#DynAnyHelper()
     * public org.omg.DynamicAny.DynAnyHelper()}.
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
    public void create_DynAnyHelper()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.DynamicAny.DynAnyHelper#extract(org.omg.CORBA.Any) public static org.omg.DynamicAny.DynAny
     * org.omg.DynamicAny.DynAnyHelper.extract(org.omg.CORBA.Any)}.
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
        // write some test for {@link org.omg.DynamicAny.DynAnyHelper#extract(org.omg.CORBA.Any)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.DynamicAny.DynAnyHelper#read(org.omg.CORBA.portable.InputStream) public static
     * org.omg.DynamicAny.DynAny org.omg.DynamicAny.DynAnyHelper.read(org.omg.CORBA.portable.InputStream)}.
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
        // write some test for {@link org.omg.DynamicAny.DynAnyHelper#read(org.omg.CORBA.portable.InputStream)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.DynamicAny.DynAnyHelper#write(org.omg.CORBA.portable.OutputStream, org.omg.DynamicAny.DynAny)
     * public static void
     * org.omg.DynamicAny.DynAnyHelper.write(org.omg.CORBA.portable.OutputStream,org.omg.DynamicAny.DynAny)}.
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
    public void test_write_OutputStream_DynAny()
    throws Exception {
        // write some test for {@link org.omg.DynamicAny.DynAnyHelper#write(org.omg.CORBA.portable.OutputStream,
        // org.omg.DynamicAny.DynAny)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link org.omg.DynamicAny.DynAnyHelper#type() public static
     * synchronized org.omg.CORBA.TypeCode org.omg.DynamicAny.DynAnyHelper.type()}.
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
        // write some test for {@link org.omg.DynamicAny.DynAnyHelper#type()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.DynamicAny.DynAnyHelper#unchecked_narrow(org.omg.CORBA.Object) public static
     * org.omg.DynamicAny.DynAny org.omg.DynamicAny.DynAnyHelper.unchecked_narrow(org.omg.CORBA.Object)}.
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
    public void test_unchecked_narrow_Object()
    throws Exception {
        // write some test for {@link org.omg.DynamicAny.DynAnyHelper#unchecked_narrow(org.omg.CORBA.Object)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.DynamicAny.DynAnyHelper#insert(org.omg.CORBA.Any, org.omg.DynamicAny.DynAny) public static void
     * org.omg.DynamicAny.DynAnyHelper.insert(org.omg.CORBA.Any,org.omg.DynamicAny.DynAny)}.
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
    public void test_insert_Any_DynAny()
    throws Exception {
        // write some test for {@link org.omg.DynamicAny.DynAnyHelper#insert(org.omg.CORBA.Any,
        // org.omg.DynamicAny.DynAny)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link org.omg.DynamicAny.DynAnyHelper#id() public static
     * java.lang.String org.omg.DynamicAny.DynAnyHelper.id()}.
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
        // write some test for {@link org.omg.DynamicAny.DynAnyHelper#id()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.DynamicAny.DynAnyHelper#narrow(org.omg.CORBA.Object) public static org.omg.DynamicAny.DynAny
     * org.omg.DynamicAny.DynAnyHelper.narrow(org.omg.CORBA.Object)}.
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
        // write some test for {@link org.omg.DynamicAny.DynAnyHelper#narrow(org.omg.CORBA.Object)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.DynamicAny.DynAnyHelper]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynAnyHelper]

}

package org.j8unit.repository.org.omg.CosNaming;

import static org.junit.Assert.fail;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.Any;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NameHelper;

@RunWith(J8Unit4.class)
public class NameHelperClassTest
implements org.j8unit.repository.org.omg.CosNaming.NameHelperClassTests<NameHelper> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CosNaming.NameHelper]

    @Override
    public Class<NameHelper> createNewSUT() {
        return NameHelper.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link NameHelper#NameHelper() public
     * org.omg.CosNaming.NameHelper()}.
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
    public void create_NameHelper()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link NameHelper#insert(Any, NameComponent[]) public
     * static void org.omg.CosNaming.NameHelper.insert(org.omg.CORBA.Any,org.omg.CosNaming.NameComponent[])}.
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
    public void test_insert_Any_NameComponentArray()
    throws Exception {
        // write some test for {@link NameHelper#insert(Any, NameComponent[])}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link NameHelper#id() public static java.lang.String
     * org.omg.CosNaming.NameHelper.id()}.
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
        // write some test for {@link NameHelper#id()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link NameHelper#type() public static synchronized
     * org.omg.CORBA.TypeCode org.omg.CosNaming.NameHelper.type()}.
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
        // write some test for {@link NameHelper#type()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link NameHelper#write(OutputStream, NameComponent[])
     * public static void
     * org.omg.CosNaming.NameHelper.write(org.omg.CORBA.portable.OutputStream,org.omg.CosNaming.NameComponent[])}.
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
    public void test_write_OutputStream_NameComponentArray()
    throws Exception {
        // write some test for {@link NameHelper#write(OutputStream, NameComponent[])}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link NameHelper#read(InputStream) public static
     * org.omg.CosNaming.NameComponent[] org.omg.CosNaming.NameHelper.read(org.omg.CORBA.portable.InputStream)}.
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
        // write some test for {@link NameHelper#read(InputStream)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link NameHelper#extract(Any) public static
     * org.omg.CosNaming.NameComponent[] org.omg.CosNaming.NameHelper.extract(org.omg.CORBA.Any)}.
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
        // write some test for {@link NameHelper#extract(Any)}
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CosNaming.NameHelper]

}

package org.j8unit.repository.org.omg.CORBA;

import static org.junit.Assert.fail;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.omg.CORBA.CompletionStatusHelper;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CompletionStatusHelper} (by simply
 * reusing the J8Unit test interface {@link CompletionStatusHelperClassTests}).
 */

@RunWith(J8Unit4.class)
public class CompletionStatusHelperClassTest
implements CompletionStatusHelperClassTests<CompletionStatusHelper> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.CompletionStatusHelper]

    @Override
    public Class<CompletionStatusHelper> createNewSUT() {
        return CompletionStatusHelper.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link org.omg.CORBA.CompletionStatusHelper#CompletionStatusHelper() public
     * org.omg.CORBA.CompletionStatusHelper()}.
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
    public void create_CompletionStatusHelper()
    throws Exception {
        fail("Cannot construct an abstract class!");
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link org.omg.CORBA.CompletionStatusHelper#type() public
     * static synchronized org.omg.CORBA.TypeCode org.omg.CORBA.CompletionStatusHelper.type()}.
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
        // write some test for {@link org.omg.CORBA.CompletionStatusHelper#type()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.CORBA.CompletionStatusHelper#write(org.omg.CORBA.portable.OutputStream, org.omg.CORBA.CompletionStatus)
     * public static void
     * org.omg.CORBA.CompletionStatusHelper.write(org.omg.CORBA.portable.OutputStream,org.omg.CORBA.CompletionStatus)}.
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
    public void test_write_OutputStream_CompletionStatus()
    throws Exception {
        // write some test for {@link org.omg.CORBA.CompletionStatusHelper#write(org.omg.CORBA.portable.OutputStream,
        // org.omg.CORBA.CompletionStatus)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.CORBA.CompletionStatusHelper#insert(org.omg.CORBA.Any, org.omg.CORBA.CompletionStatus) public
     * static void org.omg.CORBA.CompletionStatusHelper.insert(org.omg.CORBA.Any,org.omg.CORBA.CompletionStatus)}.
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
    public void test_insert_Any_CompletionStatus()
    throws Exception {
        // write some test for {@link org.omg.CORBA.CompletionStatusHelper#insert(org.omg.CORBA.Any,
        // org.omg.CORBA.CompletionStatus)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link org.omg.CORBA.CompletionStatusHelper#id() public
     * static java.lang.String org.omg.CORBA.CompletionStatusHelper.id()}.
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
        // write some test for {@link org.omg.CORBA.CompletionStatusHelper#id()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.CORBA.CompletionStatusHelper#extract(org.omg.CORBA.Any) public static
     * org.omg.CORBA.CompletionStatus org.omg.CORBA.CompletionStatusHelper.extract(org.omg.CORBA.Any)}.
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
        // write some test for {@link org.omg.CORBA.CompletionStatusHelper#extract(org.omg.CORBA.Any)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link org.omg.CORBA.CompletionStatusHelper#read(org.omg.CORBA.portable.InputStream) public static
     * org.omg.CORBA.CompletionStatus org.omg.CORBA.CompletionStatusHelper.read(org.omg.CORBA.portable.InputStream)}.
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
        // write some test for {@link org.omg.CORBA.CompletionStatusHelper#read(org.omg.CORBA.portable.InputStream)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.CompletionStatusHelper]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.CompletionStatusHelper]

}

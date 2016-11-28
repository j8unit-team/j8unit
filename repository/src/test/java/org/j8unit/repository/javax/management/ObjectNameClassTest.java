package org.j8unit.repository.javax.management;

import javax.management.ObjectName;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ObjectName} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.management.ObjectNameClassTests}).
 */
@RunWith(J8Unit4.class)
public class ObjectNameClassTest
implements ObjectNameClassTests<ObjectName> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.ObjectName]

    @Override
    public Class<ObjectName> createNewSUT() {
        return ObjectName.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.ObjectName#ObjectName(String, String, String) public
     * javax.management.ObjectName(java.lang.String,java.lang.String,java.lang.String) throws
     * javax.management.MalformedObjectNameException}.
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
    public void create_ObjectName_String_String_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ObjectName sut = null; // = new ObjectName(String, String, String);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.management.ObjectName#ObjectName(String, java.util.Hashtable) public
     * javax.management.ObjectName(java.lang.String,java.util.Hashtable<java.lang.String, java.lang.String>) throws
     * javax.management.MalformedObjectNameException}.
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
    public void create_ObjectName_String_Hashtable()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ObjectName sut = null; // = new ObjectName(String, java.util.Hashtable);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link javax.management.ObjectName#ObjectName(String)
     * public javax.management.ObjectName(java.lang.String) throws javax.management.MalformedObjectNameException}.
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
    public void create_ObjectName_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final ObjectName sut = null; // = new ObjectName(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.management.ObjectName#getInstance(javax.management.ObjectName) public static
     * javax.management.ObjectName javax.management.ObjectName.getInstance(javax.management.ObjectName)}.
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
    public void test_getInstance_ObjectName()
    throws Exception {
        // write some test for {@link javax.management.ObjectName#getInstance(javax.management.ObjectName)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.management.ObjectName#getInstance(String)
     * public static javax.management.ObjectName javax.management.ObjectName.getInstance(java.lang.String) throws
     * javax.management.MalformedObjectNameException,java.lang.NullPointerException}.
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
    public void test_getInstance_String()
    throws Exception {
        // write some test for {@link javax.management.ObjectName#getInstance(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.management.ObjectName#getInstance(String, java.util.Hashtable) public static
     * javax.management.ObjectName
     * javax.management.ObjectName.getInstance(java.lang.String,java.util.Hashtable<java.lang.String, java.lang.String>)
     * throws javax.management.MalformedObjectNameException}.
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
    public void test_getInstance_String_Hashtable()
    throws Exception {
        // write some test for {@link javax.management.ObjectName#getInstance(String, java.util.Hashtable)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test
     * {@link javax.management.ObjectName#getInstance(String, String, String) public static javax.management.ObjectName
     * javax.management.ObjectName.getInstance(java.lang.String,java.lang.String,java.lang.String) throws
     * javax.management.MalformedObjectNameException}.
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
    public void test_getInstance_String_String_String()
    throws Exception {
        // write some test for {@link javax.management.ObjectName#getInstance(String, String, String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.management.ObjectName#unquote(String) public
     * static java.lang.String javax.management.ObjectName.unquote(java.lang.String)}.
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
    public void test_unquote_String()
    throws Exception {
        // write some test for {@link javax.management.ObjectName#unquote(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.management.ObjectName#quote(String) public
     * static java.lang.String javax.management.ObjectName.quote(java.lang.String)}.
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
    public void test_quote_String()
    throws Exception {
        // write some test for {@link javax.management.ObjectName#quote(String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.ObjectName]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.ObjectName]

}

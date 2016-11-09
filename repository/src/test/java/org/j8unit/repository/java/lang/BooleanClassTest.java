package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Boolean} (by simply reusing the J8Unit
 * test interface {@link BooleanClassTests}).
 */

@RunWith(J8Unit4.class)
public class BooleanClassTest
implements BooleanClassTests<Boolean> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.Boolean]

    @Override
    public Class<Boolean> createNewSUT() {
        return Boolean.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Boolean#Boolean(boolean) public
     * java.lang.Boolean(boolean)}.
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
    public void create_Boolean_boolean()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Boolean sut = null; // = new Boolean(boolean);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link Boolean#Boolean(String) public
     * java.lang.Boolean(java.lang.String)}.
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
    public void create_Boolean_String()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Boolean sut = null; // = new Boolean(String);
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Boolean#logicalAnd(boolean, boolean) public static
     * boolean java.lang.Boolean.logicalAnd(boolean,boolean)}.
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
    public void test_logicalAnd_boolean_boolean()
    throws Exception {
        // write some test for {@link Boolean#logicalAnd(boolean, boolean)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Boolean#parseBoolean(String) public static boolean
     * java.lang.Boolean.parseBoolean(java.lang.String)}.
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
    public void test_parseBoolean_String()
    throws Exception {
        // write some test for {@link Boolean#parseBoolean(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Boolean#toString(boolean) public static
     * java.lang.String java.lang.Boolean.toString(boolean)}.
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
    public void test_toString_boolean()
    throws Exception {
        // write some test for {@link Boolean#toString(boolean)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Boolean#getBoolean(String) public static boolean
     * java.lang.Boolean.getBoolean(java.lang.String)}.
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
    public void test_getBoolean_String()
    throws Exception {
        // write some test for {@link Boolean#getBoolean(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Boolean#logicalXor(boolean, boolean) public static
     * boolean java.lang.Boolean.logicalXor(boolean,boolean)}.
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
    public void test_logicalXor_boolean_boolean()
    throws Exception {
        // write some test for {@link Boolean#logicalXor(boolean, boolean)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Boolean#logicalOr(boolean, boolean) public static
     * boolean java.lang.Boolean.logicalOr(boolean,boolean)}.
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
    public void test_logicalOr_boolean_boolean()
    throws Exception {
        // write some test for {@link Boolean#logicalOr(boolean, boolean)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Boolean#compare(boolean, boolean) public static int
     * java.lang.Boolean.compare(boolean,boolean)}.
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
    public void test_compare_boolean_boolean()
    throws Exception {
        // write some test for {@link Boolean#compare(boolean, boolean)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Boolean#hashCode(boolean) public static int
     * java.lang.Boolean.hashCode(boolean)}.
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
    public void test_hashCode_boolean()
    throws Exception {
        // write some test for {@link Boolean#hashCode(boolean)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Boolean#valueOf(String) public static
     * java.lang.Boolean java.lang.Boolean.valueOf(java.lang.String)}.
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
    public void test_valueOf_String()
    throws Exception {
        // write some test for {@link Boolean#valueOf(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Boolean#valueOf(boolean) public static
     * java.lang.Boolean java.lang.Boolean.valueOf(boolean)}.
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
    public void test_valueOf_boolean()
    throws Exception {
        // write some test for {@link Boolean#valueOf(boolean)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.Boolean]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.Boolean]

}

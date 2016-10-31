package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ClassClassTest
implements org.j8unit.repository.java.lang.ClassClassTests<Class> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.Class]

    @Override
    public Class<Class> createNewSUT() {
        return Class.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Class#forName(String) public static
     * java.lang.Class<?> java.lang.Class.forName(java.lang.String) throws java.lang.ClassNotFoundException}.
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
    public void test_forName_String()
    throws Exception {
        // write some test for {@link Class#forName(String)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Class#forName(String, boolean, ClassLoader) public
     * static java.lang.Class<?> java.lang.Class.forName(java.lang.String,boolean,java.lang.ClassLoader) throws
     * java.lang.ClassNotFoundException}.
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
    public void test_forName_String_boolean_ClassLoader()
    throws Exception {
        // write some test for {@link Class#forName(String, boolean, ClassLoader)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.Class]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.Class]

}

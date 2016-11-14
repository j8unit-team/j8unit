package org.j8unit.repository.java.lang;

import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Enum} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.java.lang.EnumClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class EnumClassTest
implements EnumClassTests<Enum> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.Enum]

    @Override
    public Class<Enum> createNewSUT() {
        return Enum.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link Enum#valueOf(Class, String) public static <T> T
     * java.lang.Enum.valueOf(java.lang.Class<T>,java.lang.String)}.
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
    public void test_valueOf_Class_String()
    throws Exception {
        // write some test for {@link Enum#valueOf(Class, String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.Enum]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.Enum]

}

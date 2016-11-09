package org.j8unit.repository.java.time.temporal;

import java.time.temporal.ChronoField;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ChronoField} (by simply reusing the
 * J8Unit test interface {@link ChronoFieldClassTests}).
 */

@RunWith(J8Unit4.class)
public class ChronoFieldClassTest
implements ChronoFieldClassTests<ChronoField> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.time.temporal.ChronoField]

    @Override
    public Class<ChronoField> createNewSUT() {
        return ChronoField.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.time.temporal.ChronoField#values() public
     * static java.time.temporal.ChronoField[] java.time.temporal.ChronoField.values()}.
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
    public void test_values()
    throws Exception {
        // write some test for {@link java.time.temporal.ChronoField#values()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.time.temporal.ChronoField#valueOf(String)
     * public static java.time.temporal.ChronoField java.time.temporal.ChronoField.valueOf(java.lang.String)}.
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
        // write some test for {@link java.time.temporal.ChronoField#valueOf(String)}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.time.temporal.ChronoField]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.time.temporal.ChronoField]

}

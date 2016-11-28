package org.j8unit.repository.java.text;

import java.text.Collator;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Collator} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.text.CollatorClassTests}).
 */
@RunWith(J8Unit4.class)
public class CollatorClassTest
implements CollatorClassTests<Collator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.text.Collator]

    @Override
    public Class<Collator> createNewSUT() {
        return Collator.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.text.Collator#getAvailableLocales() public
     * static synchronized java.util.Locale[] java.text.Collator.getAvailableLocales()}.
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
    public void test_getAvailableLocales()
    throws Exception {
        // write some test for {@link java.text.Collator#getAvailableLocales()}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.text.Collator#getInstance(java.util.Locale)
     * public static java.text.Collator java.text.Collator.getInstance(java.util.Locale)}.
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
    public void test_getInstance_Locale()
    throws Exception {
        // write some test for {@link java.text.Collator#getInstance(java.util.Locale)}
    }

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link java.text.Collator#getInstance() public static
     * synchronized java.text.Collator java.text.Collator.getInstance()}.
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
    public void test_getInstance()
    throws Exception {
        // write some test for {@link java.text.Collator#getInstance()}
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.text.Collator]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.text.Collator]

}

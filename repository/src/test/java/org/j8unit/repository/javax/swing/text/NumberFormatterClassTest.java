package org.j8unit.repository.javax.swing.text;

import javax.swing.text.NumberFormatter;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NumberFormatter} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.NumberFormatterClassTests}).
 */
@RunWith(J8Unit4.class)
public class NumberFormatterClassTest
implements NumberFormatterClassTests<NumberFormatter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.text.NumberFormatter]

    @Override
    public Class<NumberFormatter> createNewSUT() {
        return NumberFormatter.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.NumberFormatter#NumberFormatter(java.text.NumberFormat) public
     * javax.swing.text.NumberFormatter(java.text.NumberFormat)}.
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
    public void create_NumberFormatter_NumberFormat()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NumberFormatter sut = null; // = new NumberFormatter(java.text.NumberFormat);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link javax.swing.text.NumberFormatter#NumberFormatter() public javax.swing.text.NumberFormatter()}.
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
    public void create_NumberFormatter()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final NumberFormatter sut = new NumberFormatter();
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.text.NumberFormatter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.text.NumberFormatter]

}

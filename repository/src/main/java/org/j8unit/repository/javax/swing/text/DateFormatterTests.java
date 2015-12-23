package org.j8unit.repository.javax.swing.text;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.swing.text.DateFormatter class javax.swing.text.DateFormatter},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.swing.text.DateFormatterTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.swing.text.DateFormatterClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.swing.text.DateFormatter
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DateFormatterTests<SUT extends javax.swing.text.DateFormatter>
extends org.j8unit.repository.javax.swing.text.InternationalFormatterTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.text.DateFormatter#setFormat(java.text.DateFormat) public void
     * javax.swing.text.DateFormatter.setFormat(java.text.DateFormat)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.swing.text.DateFormatter#setFormat(java.text.DateFormat)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setFormat_DateFormat()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

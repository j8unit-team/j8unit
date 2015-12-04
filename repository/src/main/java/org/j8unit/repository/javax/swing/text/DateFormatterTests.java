package org.j8unit.repository.javax.swing.text;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.text.DateFormatter class javax.swing.text.DateFormatter}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.text.DateFormatterClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DateFormatterTests<SUT extends javax.swing.text.DateFormatter>
extends org.j8unit.repository.javax.swing.text.InternationalFormatterTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.text.DateFormatter#setFormat(java.text.DateFormat) public void
     * javax.swing.text.DateFormatter.setFormat(java.text.DateFormat)}.
     * </p>
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

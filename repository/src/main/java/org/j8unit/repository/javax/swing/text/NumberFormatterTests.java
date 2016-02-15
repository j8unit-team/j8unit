package org.j8unit.repository.javax.swing.text;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.text.NumberFormatter class javax.swing.text.NumberFormatter}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link NumberFormatterClassTests}.
 * </p>
 *
 * @see javax.swing.text.NumberFormatter class javax.swing.text.NumberFormatter (the hereby targeted class-under-test
 *      class)
 * @see NumberFormatterClassTests NumberFormatterClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface NumberFormatterTests<SUT extends javax.swing.text.NumberFormatter>
extends InternationalFormatterTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.text.NumberFormatter#setFormat(java.text.Format) public void
     * javax.swing.text.NumberFormatter.setFormat(java.text.Format)}.
     *
     * <p>
     * Test method for {@link javax.swing.text.NumberFormatter#setFormat(java.text.Format) public void
     * javax.swing.text.NumberFormatter.setFormat(java.text.Format)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.text.NumberFormatter#setFormat(java.text.Format) public void
     *      javax.swing.text.NumberFormatter.setFormat(java.text.Format) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setFormat_Format()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

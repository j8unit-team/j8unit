package org.j8unit.repository.javax.print.attribute.standard;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.print.attribute.standard.DialogTypeSelection class
 * javax.print.attribute.standard.DialogTypeSelection}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link DialogTypeSelectionClassTests}.
 * </p>
 *
 * @see javax.print.attribute.standard.DialogTypeSelection class javax.print.attribute.standard.DialogTypeSelection (the
 *      hereby targeted class-under-test class)
 * @see DialogTypeSelectionClassTests DialogTypeSelectionClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DialogTypeSelectionTests<SUT extends javax.print.attribute.standard.DialogTypeSelection>
extends org.j8unit.repository.javax.print.attribute.PrintRequestAttributeTests<SUT>, org.j8unit.repository.javax.print.attribute.EnumSyntaxTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.print.attribute.standard.DialogTypeSelection#getName() public final java.lang.String
     * javax.print.attribute.standard.DialogTypeSelection.getName()}.
     *
     * <p>
     * Test method for {@link javax.print.attribute.standard.DialogTypeSelection#getName() public final java.lang.String
     * javax.print.attribute.standard.DialogTypeSelection.getName()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.attribute.standard.DialogTypeSelection#getName() public final java.lang.String
     *      javax.print.attribute.standard.DialogTypeSelection.getName() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.standard.DialogTypeSelection#getCategory() public final
     * java.lang.Class javax.print.attribute.standard.DialogTypeSelection.getCategory()}.
     *
     * <p>
     * Test method for {@link javax.print.attribute.standard.DialogTypeSelection#getCategory() public final
     * java.lang.Class javax.print.attribute.standard.DialogTypeSelection.getCategory()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.attribute.standard.DialogTypeSelection#getCategory() public final java.lang.Class
     *      javax.print.attribute.standard.DialogTypeSelection.getCategory() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getCategory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

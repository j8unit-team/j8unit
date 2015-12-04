package org.j8unit.repository.javax.print.attribute.standard;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.print.attribute.standard.PrinterStateReasons class
 * javax.print.attribute.standard.PrinterStateReasons}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.print.attribute.standard.PrinterStateReasonsClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface PrinterStateReasonsTests<SUT extends javax.print.attribute.standard.PrinterStateReasons>
extends org.j8unit.repository.javax.print.attribute.PrintServiceAttributeTests<SUT>,
org.j8unit.repository.java.util.HashMapTests<SUT, javax.print.attribute.standard.PrinterStateReason, javax.print.attribute.standard.Severity> {

    /**
     * <p>
     * Test method for {@link javax.print.attribute.standard.PrinterStateReasons#getCategory() public final
     * java.lang.Class javax.print.attribute.standard.PrinterStateReasons.getCategory()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getCategory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.attribute.standard.PrinterStateReasons#getName() public final java.lang.String
     * javax.print.attribute.standard.PrinterStateReasons.getName()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.print.attribute.standard.PrinterStateReasons#printerStateReasonSet(javax.print.attribute.standard.Severity)
     * public java.util.Set
     * javax.print.attribute.standard.PrinterStateReasons.printerStateReasonSet(javax.print.attribute.standard.Severity)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_printerStateReasonSet_Severity()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.print.attribute.standard.PrinterStateReasons#put(javax.print.attribute.standard.PrinterStateReason,javax.print.attribute.standard.Severity)
     * public javax.print.attribute.standard.Severity
     * javax.print.attribute.standard.PrinterStateReasons.put(javax.print.attribute.standard.PrinterStateReason,javax.print.attribute.standard.Severity)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_put_PrinterStateReason_Severity()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

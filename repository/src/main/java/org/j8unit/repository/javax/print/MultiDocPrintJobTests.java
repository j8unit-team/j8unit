package org.j8unit.repository.javax.print;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.print.MultiDocPrintJob interface javax.print.MultiDocPrintJob}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link MultiDocPrintJobClassTests}.
 * </p>
 *
 * @see javax.print.MultiDocPrintJob interface javax.print.MultiDocPrintJob (the hereby targeted class-under-test class)
 * @see MultiDocPrintJobClassTests MultiDocPrintJobClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MultiDocPrintJobTests<SUT extends javax.print.MultiDocPrintJob>
extends DocPrintJobTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.print.MultiDocPrintJob#print(javax.print.MultiDoc, javax.print.attribute.PrintRequestAttributeSet)
     * public abstract void
     * javax.print.MultiDocPrintJob.print(javax.print.MultiDoc,javax.print.attribute.PrintRequestAttributeSet) throws
     * javax.print.PrintException}.
     *
     * <p>
     * Test method for
     * {@link javax.print.MultiDocPrintJob#print(javax.print.MultiDoc, javax.print.attribute.PrintRequestAttributeSet)
     * public abstract void
     * javax.print.MultiDocPrintJob.print(javax.print.MultiDoc,javax.print.attribute.PrintRequestAttributeSet) throws
     * javax.print.PrintException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.MultiDocPrintJob#print(javax.print.MultiDoc, javax.print.attribute.PrintRequestAttributeSet)
     *      public abstract void
     *      javax.print.MultiDocPrintJob.print(javax.print.MultiDoc,javax.print.attribute.PrintRequestAttributeSet)
     *      throws javax.print.PrintException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_print_MultiDoc_PrintRequestAttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

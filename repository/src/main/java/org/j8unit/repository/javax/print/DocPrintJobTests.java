package org.j8unit.repository.javax.print;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.print.DocPrintJob interface javax.print.DocPrintJob}, containing all instance relevant
 * test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.print.DocPrintJobClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface DocPrintJobTests<SUT extends javax.print.DocPrintJob>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.print.DocPrintJob#addPrintJobAttributeListener(javax.print.event.PrintJobAttributeListener,javax.print.attribute.PrintJobAttributeSet)
     * public abstract void
     * javax.print.DocPrintJob.addPrintJobAttributeListener(javax.print.event.PrintJobAttributeListener,javax.print.attribute.PrintJobAttributeSet)}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addPrintJobAttributeListener_PrintJobAttributeListener_PrintJobAttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.DocPrintJob#addPrintJobListener(javax.print.event.PrintJobListener) public
     * abstract void javax.print.DocPrintJob.addPrintJobListener(javax.print.event.PrintJobListener)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addPrintJobListener_PrintJobListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.DocPrintJob#getAttributes() public abstract
     * javax.print.attribute.PrintJobAttributeSet javax.print.DocPrintJob.getAttributes()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAttributes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.DocPrintJob#getPrintService() public abstract javax.print.PrintService
     * javax.print.DocPrintJob.getPrintService()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrintService()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.print.DocPrintJob#print(javax.print.Doc,javax.print.attribute.PrintRequestAttributeSet) public
     * abstract void javax.print.DocPrintJob.print(javax.print.Doc,javax.print.attribute.PrintRequestAttributeSet)
     * throws javax.print.PrintException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_print_Doc_PrintRequestAttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.print.DocPrintJob#removePrintJobAttributeListener(javax.print.event.PrintJobAttributeListener)
     * public abstract void
     * javax.print.DocPrintJob.removePrintJobAttributeListener(javax.print.event.PrintJobAttributeListener)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removePrintJobAttributeListener_PrintJobAttributeListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.DocPrintJob#removePrintJobListener(javax.print.event.PrintJobListener) public
     * abstract void javax.print.DocPrintJob.removePrintJobListener(javax.print.event.PrintJobListener)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removePrintJobListener_PrintJobListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

package org.j8unit.repository.javax.print;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.print.DocPrintJob interface javax.print.DocPrintJob}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link DocPrintJobClassTests}.
 * </p>
 *
 * @see javax.print.DocPrintJob interface javax.print.DocPrintJob (the hereby targeted class-under-test class)
 * @see DocPrintJobClassTests DocPrintJobClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DocPrintJobTests<SUT extends javax.print.DocPrintJob>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.print.DocPrintJob#getAttributes() public abstract
     * javax.print.attribute.PrintJobAttributeSet javax.print.DocPrintJob.getAttributes()}.
     *
     * <p>
     * Test method for {@link javax.print.DocPrintJob#getAttributes() public abstract
     * javax.print.attribute.PrintJobAttributeSet javax.print.DocPrintJob.getAttributes()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.DocPrintJob#getAttributes() public abstract javax.print.attribute.PrintJobAttributeSet
     *      javax.print.DocPrintJob.getAttributes() (the hereby targeted method-under-test)
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
     * Test method for
     * {@link javax.print.DocPrintJob#removePrintJobAttributeListener(javax.print.event.PrintJobAttributeListener)
     * public abstract void
     * javax.print.DocPrintJob.removePrintJobAttributeListener(javax.print.event.PrintJobAttributeListener)}.
     *
     * <p>
     * Test method for
     * {@link javax.print.DocPrintJob#removePrintJobAttributeListener(javax.print.event.PrintJobAttributeListener)
     * public abstract void
     * javax.print.DocPrintJob.removePrintJobAttributeListener(javax.print.event.PrintJobAttributeListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.DocPrintJob#removePrintJobAttributeListener(javax.print.event.PrintJobAttributeListener) public
     *      abstract void
     *      javax.print.DocPrintJob.removePrintJobAttributeListener(javax.print.event.PrintJobAttributeListener) (the
     *      hereby targeted method-under-test)
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
     * Test method for
     * {@link javax.print.DocPrintJob#print(javax.print.Doc, javax.print.attribute.PrintRequestAttributeSet) public
     * abstract void javax.print.DocPrintJob.print(javax.print.Doc,javax.print.attribute.PrintRequestAttributeSet)
     * throws javax.print.PrintException}.
     *
     * <p>
     * Test method for
     * {@link javax.print.DocPrintJob#print(javax.print.Doc, javax.print.attribute.PrintRequestAttributeSet) public
     * abstract void javax.print.DocPrintJob.print(javax.print.Doc,javax.print.attribute.PrintRequestAttributeSet)
     * throws javax.print.PrintException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.DocPrintJob#print(javax.print.Doc, javax.print.attribute.PrintRequestAttributeSet) public
     *      abstract void javax.print.DocPrintJob.print(javax.print.Doc,javax.print.attribute.PrintRequestAttributeSet)
     *      throws javax.print.PrintException (the hereby targeted method-under-test)
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
     * Test method for {@link javax.print.DocPrintJob#getPrintService() public abstract javax.print.PrintService
     * javax.print.DocPrintJob.getPrintService()}.
     *
     * <p>
     * Test method for {@link javax.print.DocPrintJob#getPrintService() public abstract javax.print.PrintService
     * javax.print.DocPrintJob.getPrintService()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.DocPrintJob#getPrintService() public abstract javax.print.PrintService
     *      javax.print.DocPrintJob.getPrintService() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.print.DocPrintJob#addPrintJobListener(javax.print.event.PrintJobListener) public
     * abstract void javax.print.DocPrintJob.addPrintJobListener(javax.print.event.PrintJobListener)}.
     *
     * <p>
     * Test method for {@link javax.print.DocPrintJob#addPrintJobListener(javax.print.event.PrintJobListener) public
     * abstract void javax.print.DocPrintJob.addPrintJobListener(javax.print.event.PrintJobListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.DocPrintJob#addPrintJobListener(javax.print.event.PrintJobListener) public abstract void
     *      javax.print.DocPrintJob.addPrintJobListener(javax.print.event.PrintJobListener) (the hereby targeted
     *      method-under-test)
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
     * Test method for {@link javax.print.DocPrintJob#removePrintJobListener(javax.print.event.PrintJobListener) public
     * abstract void javax.print.DocPrintJob.removePrintJobListener(javax.print.event.PrintJobListener)}.
     *
     * <p>
     * Test method for {@link javax.print.DocPrintJob#removePrintJobListener(javax.print.event.PrintJobListener) public
     * abstract void javax.print.DocPrintJob.removePrintJobListener(javax.print.event.PrintJobListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.DocPrintJob#removePrintJobListener(javax.print.event.PrintJobListener) public abstract void
     *      javax.print.DocPrintJob.removePrintJobListener(javax.print.event.PrintJobListener) (the hereby targeted
     *      method-under-test)
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

    /**
     * <p>
     * Test method for
     * {@link javax.print.DocPrintJob#addPrintJobAttributeListener(javax.print.event.PrintJobAttributeListener, javax.print.attribute.PrintJobAttributeSet)
     * public abstract void
     * javax.print.DocPrintJob.addPrintJobAttributeListener(javax.print.event.PrintJobAttributeListener,javax.print.attribute.PrintJobAttributeSet)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.print.DocPrintJob#addPrintJobAttributeListener(javax.print.event.PrintJobAttributeListener, javax.print.attribute.PrintJobAttributeSet)
     * public abstract void
     * javax.print.DocPrintJob.addPrintJobAttributeListener(javax.print.event.PrintJobAttributeListener,javax.print.attribute.PrintJobAttributeSet)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.DocPrintJob#addPrintJobAttributeListener(javax.print.event.PrintJobAttributeListener,
     *      javax.print.attribute.PrintJobAttributeSet) public abstract void
     *      javax.print.DocPrintJob.addPrintJobAttributeListener(javax.print.event.PrintJobAttributeListener,javax.print
     *      .attribute.PrintJobAttributeSet) (the hereby targeted method-under-test)
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

}

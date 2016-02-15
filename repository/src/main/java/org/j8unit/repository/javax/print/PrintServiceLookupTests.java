package org.j8unit.repository.javax.print;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.print.PrintServiceLookup class javax.print.PrintServiceLookup}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link PrintServiceLookupClassTests}.
 * </p>
 *
 * @see javax.print.PrintServiceLookup class javax.print.PrintServiceLookup (the hereby targeted class-under-test class)
 * @see PrintServiceLookupClassTests PrintServiceLookupClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PrintServiceLookupTests<SUT extends javax.print.PrintServiceLookup>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.print.PrintServiceLookup#getMultiDocPrintServices(javax.print.DocFlavor[], javax.print.attribute.AttributeSet)
     * public abstract javax.print.MultiDocPrintService[]
     * javax.print.PrintServiceLookup.getMultiDocPrintServices(javax.print.DocFlavor[],javax.print.attribute.AttributeSet)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.print.PrintServiceLookup#getMultiDocPrintServices(javax.print.DocFlavor[], javax.print.attribute.AttributeSet)
     * public abstract javax.print.MultiDocPrintService[]
     * javax.print.PrintServiceLookup.getMultiDocPrintServices(javax.print.DocFlavor[],javax.print.attribute.AttributeSet)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.PrintServiceLookup#getMultiDocPrintServices(javax.print.DocFlavor[],
     *      javax.print.attribute.AttributeSet) public abstract javax.print.MultiDocPrintService[]
     *      javax.print.PrintServiceLookup.getMultiDocPrintServices(javax.print.DocFlavor[],javax.print.attribute.
     *      AttributeSet) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMultiDocPrintServices_DocFlavorArray_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.PrintServiceLookup#getDefaultPrintService() public abstract
     * javax.print.PrintService javax.print.PrintServiceLookup.getDefaultPrintService()}.
     *
     * <p>
     * Test method for {@link javax.print.PrintServiceLookup#getDefaultPrintService() public abstract
     * javax.print.PrintService javax.print.PrintServiceLookup.getDefaultPrintService()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.PrintServiceLookup#getDefaultPrintService() public abstract javax.print.PrintService
     *      javax.print.PrintServiceLookup.getDefaultPrintService() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDefaultPrintService()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.print.PrintServiceLookup#getPrintServices(javax.print.DocFlavor, javax.print.attribute.AttributeSet)
     * public abstract javax.print.PrintService[]
     * javax.print.PrintServiceLookup.getPrintServices(javax.print.DocFlavor,javax.print.attribute.AttributeSet)}.
     *
     * <p>
     * Test method for
     * {@link javax.print.PrintServiceLookup#getPrintServices(javax.print.DocFlavor, javax.print.attribute.AttributeSet)
     * public abstract javax.print.PrintService[]
     * javax.print.PrintServiceLookup.getPrintServices(javax.print.DocFlavor,javax.print.attribute.AttributeSet)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.PrintServiceLookup#getPrintServices(javax.print.DocFlavor, javax.print.attribute.AttributeSet)
     *      public abstract javax.print.PrintService[]
     *      javax.print.PrintServiceLookup.getPrintServices(javax.print.DocFlavor,javax.print.attribute.AttributeSet)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrintServices_DocFlavor_AttributeSet()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.PrintServiceLookup#getPrintServices() public abstract
     * javax.print.PrintService[] javax.print.PrintServiceLookup.getPrintServices()}.
     *
     * <p>
     * Test method for {@link javax.print.PrintServiceLookup#getPrintServices() public abstract
     * javax.print.PrintService[] javax.print.PrintServiceLookup.getPrintServices()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.PrintServiceLookup#getPrintServices() public abstract javax.print.PrintService[]
     *      javax.print.PrintServiceLookup.getPrintServices() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrintServices()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

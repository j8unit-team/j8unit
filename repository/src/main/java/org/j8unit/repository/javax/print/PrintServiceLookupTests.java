package org.j8unit.repository.javax.print;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.print.PrintServiceLookup class javax.print.PrintServiceLookup}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.print.PrintServiceLookupClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PrintServiceLookupTests<SUT extends javax.print.PrintServiceLookup>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.print.PrintServiceLookup#getDefaultPrintService() public abstract
     * javax.print.PrintService javax.print.PrintServiceLookup.getDefaultPrintService()}.
     * </p>
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
     * {@link javax.print.PrintServiceLookup#getMultiDocPrintServices(javax.print.DocFlavor[],javax.print.attribute.AttributeSet)
     * public abstract javax.print.MultiDocPrintService[]
     * javax.print.PrintServiceLookup.getMultiDocPrintServices(javax.print.DocFlavor[],javax.print.attribute.AttributeSet)}
     * .
     * </p>
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
     * Test method for {@link javax.print.PrintServiceLookup#getPrintServices() public abstract
     * javax.print.PrintService[] javax.print.PrintServiceLookup.getPrintServices()}.
     * </p>
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

    /**
     * <p>
     * Test method for
     * {@link javax.print.PrintServiceLookup#getPrintServices(javax.print.DocFlavor,javax.print.attribute.AttributeSet)
     * public abstract javax.print.PrintService[]
     * javax.print.PrintServiceLookup.getPrintServices(javax.print.DocFlavor,javax.print.attribute.AttributeSet)}.
     * </p>
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

}

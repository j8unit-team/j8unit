package org.j8unit.repository.javax.print;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.print.PrintServiceLookup class javax.print.PrintServiceLookup},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.print.PrintServiceLookupTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.print.PrintServiceLookupClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.print.PrintServiceLookup
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PrintServiceLookupTests<SUT extends javax.print.PrintServiceLookup>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.print.PrintServiceLookup#getDefaultPrintService() public abstract
     * javax.print.PrintService javax.print.PrintServiceLookup.getDefaultPrintService()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.print.PrintServiceLookup#getDefaultPrintService()
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
     * @j8unit.aim javax.print.PrintServiceLookup#getMultiDocPrintServices(javax.print.DocFlavor[],
     *             javax.print.attribute.AttributeSet)
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
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.print.PrintServiceLookup#getPrintServices()
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
     * {@link javax.print.PrintServiceLookup#getPrintServices(javax.print.DocFlavor, javax.print.attribute.AttributeSet)
     * public abstract javax.print.PrintService[]
     * javax.print.PrintServiceLookup.getPrintServices(javax.print.DocFlavor,javax.print.attribute.AttributeSet)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.print.PrintServiceLookup#getPrintServices(javax.print.DocFlavor,
     *             javax.print.attribute.AttributeSet)
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

package org.j8unit.repository.javax.print;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.print.StreamPrintServiceFactory class javax.print.StreamPrintServiceFactory}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.print.StreamPrintServiceFactoryClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface StreamPrintServiceFactoryTests<SUT extends javax.print.StreamPrintServiceFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.print.StreamPrintServiceFactory#getPrintService(java.io.OutputStream) public
     * abstract javax.print.StreamPrintService
     * javax.print.StreamPrintServiceFactory.getPrintService(java.io.OutputStream)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrintService_OutputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.StreamPrintServiceFactory#getOutputFormat() public abstract java.lang.String
     * javax.print.StreamPrintServiceFactory.getOutputFormat()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOutputFormat()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.StreamPrintServiceFactory#getSupportedDocFlavors() public abstract
     * javax.print.DocFlavor[] javax.print.StreamPrintServiceFactory.getSupportedDocFlavors()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSupportedDocFlavors()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

package org.j8unit.repository.javax.print;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.print.StreamPrintServiceFactory class
 * javax.print.StreamPrintServiceFactory}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link StreamPrintServiceFactoryClassTests}.
 * </p>
 *
 * @see javax.print.StreamPrintServiceFactory class javax.print.StreamPrintServiceFactory (the hereby targeted
 *      class-under-test class)
 * @see StreamPrintServiceFactoryClassTests StreamPrintServiceFactoryClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StreamPrintServiceFactoryTests<SUT extends javax.print.StreamPrintServiceFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.print.StreamPrintServiceFactory#getPrintService(java.io.OutputStream) public
     * abstract javax.print.StreamPrintService
     * javax.print.StreamPrintServiceFactory.getPrintService(java.io.OutputStream)}.
     *
     * <p>
     * Test method for {@link javax.print.StreamPrintServiceFactory#getPrintService(java.io.OutputStream) public
     * abstract javax.print.StreamPrintService
     * javax.print.StreamPrintServiceFactory.getPrintService(java.io.OutputStream)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.StreamPrintServiceFactory#getPrintService(java.io.OutputStream) public abstract
     *      javax.print.StreamPrintService javax.print.StreamPrintServiceFactory.getPrintService(java.io.OutputStream)
     *      (the hereby targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link javax.print.StreamPrintServiceFactory#getOutputFormat() public abstract java.lang.String
     * javax.print.StreamPrintServiceFactory.getOutputFormat()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.StreamPrintServiceFactory#getOutputFormat() public abstract java.lang.String
     *      javax.print.StreamPrintServiceFactory.getOutputFormat() (the hereby targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link javax.print.StreamPrintServiceFactory#getSupportedDocFlavors() public abstract
     * javax.print.DocFlavor[] javax.print.StreamPrintServiceFactory.getSupportedDocFlavors()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.StreamPrintServiceFactory#getSupportedDocFlavors() public abstract javax.print.DocFlavor[]
     *      javax.print.StreamPrintServiceFactory.getSupportedDocFlavors() (the hereby targeted method-under-test)
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

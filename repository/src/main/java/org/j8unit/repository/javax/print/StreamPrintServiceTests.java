package org.j8unit.repository.javax.print;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.print.StreamPrintService class javax.print.StreamPrintService}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link StreamPrintServiceClassTests}.
 * </p>
 *
 * @see javax.print.StreamPrintService class javax.print.StreamPrintService (the hereby targeted class-under-test class)
 * @see StreamPrintServiceClassTests StreamPrintServiceClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface StreamPrintServiceTests<SUT extends javax.print.StreamPrintService>
extends PrintServiceTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.print.StreamPrintService#getOutputFormat() public abstract java.lang.String
     * javax.print.StreamPrintService.getOutputFormat()}.
     *
     * <p>
     * Test method for {@link javax.print.StreamPrintService#getOutputFormat() public abstract java.lang.String
     * javax.print.StreamPrintService.getOutputFormat()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.StreamPrintService#getOutputFormat() public abstract java.lang.String
     *      javax.print.StreamPrintService.getOutputFormat() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.print.StreamPrintService#isDisposed() public boolean
     * javax.print.StreamPrintService.isDisposed()}.
     *
     * <p>
     * Test method for {@link javax.print.StreamPrintService#isDisposed() public boolean
     * javax.print.StreamPrintService.isDisposed()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.StreamPrintService#isDisposed() public boolean javax.print.StreamPrintService.isDisposed() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isDisposed()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.StreamPrintService#getOutputStream() public java.io.OutputStream
     * javax.print.StreamPrintService.getOutputStream()}.
     *
     * <p>
     * Test method for {@link javax.print.StreamPrintService#getOutputStream() public java.io.OutputStream
     * javax.print.StreamPrintService.getOutputStream()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.StreamPrintService#getOutputStream() public java.io.OutputStream
     *      javax.print.StreamPrintService.getOutputStream() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOutputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.print.StreamPrintService#dispose() public void
     * javax.print.StreamPrintService.dispose()}.
     *
     * <p>
     * Test method for {@link javax.print.StreamPrintService#dispose() public void
     * javax.print.StreamPrintService.dispose()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.print.StreamPrintService#dispose() public void javax.print.StreamPrintService.dispose() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_dispose()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain Object#hashCode() class java.lang.Object}</li>
     * <li>{@linkplain javax.print.PrintService#hashCode() interface javax.print.PrintService}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
    }

    /**
     * <p>
     * The method-under-test covered by this test method is inherited duplicatedly within the declaring
     * class-under-test:
     * </p>
     * <ul>
     * <li>{@linkplain Object#equals(Object) class java.lang.Object}</li>
     * <li>{@linkplain javax.print.PrintService#equals(Object) interface javax.print.PrintService}</li>
     * </ul>
     *
     * <p>
     * In result, there are duplicated according test methods within the parent test classes. To solve this situation,
     * this method must be overridden. Dont't worry, there will be meaningful test methods soon and, thus, overriding
     * becomes unnecessary.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
    }

}

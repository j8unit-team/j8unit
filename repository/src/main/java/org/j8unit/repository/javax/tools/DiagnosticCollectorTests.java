package org.j8unit.repository.javax.tools;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.tools.DiagnosticCollector class javax.tools.DiagnosticCollector}.
 * The complementary j8unit test interface containing the class relevant aspects is
 * {@link DiagnosticCollectorClassTests}.
 * </p>
 *
 * @see javax.tools.DiagnosticCollector class javax.tools.DiagnosticCollector (the hereby targeted class-under-test
 *      class)
 * @see DiagnosticCollectorClassTests DiagnosticCollectorClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DiagnosticCollectorTests<SUT extends javax.tools.DiagnosticCollector<S>, S>
extends DiagnosticListenerTests<SUT, S>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.tools.DiagnosticCollector#report(javax.tools.Diagnostic) public void
     * javax.tools.DiagnosticCollector.report(javax.tools.Diagnostic<? extends S>)}.
     *
     * <p>
     * Test method for {@link javax.tools.DiagnosticCollector#report(javax.tools.Diagnostic) public void
     * javax.tools.DiagnosticCollector.report(javax.tools.Diagnostic)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.DiagnosticCollector#report(javax.tools.Diagnostic) public void
     *      javax.tools.DiagnosticCollector.report(javax.tools.Diagnostic) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_report_Diagnostic()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.tools.DiagnosticCollector#getDiagnostics() public
     * java.util.List<javax.tools.Diagnostic<? extends S>> javax.tools.DiagnosticCollector.getDiagnostics()}.
     *
     * <p>
     * Test method for {@link javax.tools.DiagnosticCollector#getDiagnostics() public java.util.List
     * javax.tools.DiagnosticCollector.getDiagnostics()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.tools.DiagnosticCollector#getDiagnostics() public java.util.List
     *      javax.tools.DiagnosticCollector.getDiagnostics() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getDiagnostics()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

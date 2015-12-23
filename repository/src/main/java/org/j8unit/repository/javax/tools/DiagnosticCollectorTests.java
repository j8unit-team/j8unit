package org.j8unit.repository.javax.tools;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.tools.DiagnosticCollector class javax.tools.DiagnosticCollector}
 * , containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.tools.DiagnosticCollectorTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.tools.DiagnosticCollectorClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.tools.DiagnosticCollector
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DiagnosticCollectorTests<SUT extends javax.tools.DiagnosticCollector<S>, S>
extends org.j8unit.repository.javax.tools.DiagnosticListenerTests<SUT, S>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.tools.DiagnosticCollector#getDiagnostics() public java.util.List
     * javax.tools.DiagnosticCollector.getDiagnostics()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.tools.DiagnosticCollector#getDiagnostics()
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

    /**
     * <p>
     * Test method for {@link javax.tools.DiagnosticCollector#report(javax.tools.Diagnostic) public void
     * javax.tools.DiagnosticCollector.report(javax.tools.Diagnostic)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.tools.DiagnosticCollector#report(javax.tools.Diagnostic)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_report_Diagnostic()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

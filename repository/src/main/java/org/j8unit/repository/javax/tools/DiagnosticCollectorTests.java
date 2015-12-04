package org.j8unit.repository.javax.tools;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.tools.DiagnosticCollector class javax.tools.DiagnosticCollector}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.tools.DiagnosticCollectorClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DiagnosticCollectorTests<SUT extends javax.tools.DiagnosticCollector<S>, S>
extends org.j8unit.repository.javax.tools.DiagnosticListenerTests<SUT, S>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.tools.DiagnosticCollector#getDiagnostics() public java.util.List
     * javax.tools.DiagnosticCollector.getDiagnostics()}.
     * </p>
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
     * </p>
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

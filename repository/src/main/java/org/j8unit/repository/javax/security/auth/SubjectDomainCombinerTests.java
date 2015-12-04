package org.j8unit.repository.javax.security.auth;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.security.auth.SubjectDomainCombiner class javax.security.auth.SubjectDomainCombiner},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.security.auth.SubjectDomainCombinerClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SubjectDomainCombinerTests<SUT extends javax.security.auth.SubjectDomainCombiner>
extends org.j8unit.repository.java.security.DomainCombinerTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.security.auth.SubjectDomainCombiner#combine(java.security.ProtectionDomain[],java.security.ProtectionDomain[])
     * public java.security.ProtectionDomain[]
     * javax.security.auth.SubjectDomainCombiner.combine(java.security.ProtectionDomain[],java.security.ProtectionDomain[])}
     * .
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_combine_ProtectionDomainArray_ProtectionDomainArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.security.auth.SubjectDomainCombiner#getSubject() public javax.security.auth.Subject
     * javax.security.auth.SubjectDomainCombiner.getSubject()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSubject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

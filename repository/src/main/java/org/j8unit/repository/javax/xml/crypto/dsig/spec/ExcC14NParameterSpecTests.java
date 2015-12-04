package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.crypto.dsig.spec.ExcC14NParameterSpec class
 * javax.xml.crypto.dsig.spec.ExcC14NParameterSpec}, containing all instance relevant test methods (i.&thinsp;e., test
 * methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.crypto.dsig.spec.ExcC14NParameterSpecClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ExcC14NParameterSpecTests<SUT extends javax.xml.crypto.dsig.spec.ExcC14NParameterSpec>
extends org.j8unit.repository.javax.xml.crypto.dsig.spec.C14NMethodParameterSpecTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.spec.ExcC14NParameterSpec#getPrefixList() public java.util.List
     * javax.xml.crypto.dsig.spec.ExcC14NParameterSpec.getPrefixList()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrefixList()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

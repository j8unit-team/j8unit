package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.crypto.dsig.SignatureMethod interface javax.xml.crypto.dsig.SignatureMethod},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.crypto.dsig.SignatureMethodClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SignatureMethodTests<SUT extends javax.xml.crypto.dsig.SignatureMethod>
extends org.j8unit.repository.javax.xml.crypto.XMLStructureTests<SUT>, org.j8unit.repository.javax.xml.crypto.AlgorithmMethodTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.SignatureMethod#getParameterSpec() public abstract
     * java.security.spec.AlgorithmParameterSpec javax.xml.crypto.dsig.SignatureMethod.getParameterSpec()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getParameterSpec()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

package org.j8unit.repository.javax.xml.crypto;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.crypto.KeySelector class javax.xml.crypto.KeySelector}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.crypto.KeySelectorClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface KeySelectorTests<SUT extends javax.xml.crypto.KeySelector>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.xml.crypto.KeySelector$Purpose class javax.xml.crypto.KeySelector$Purpose},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.xml.crypto.KeySelectorClassTests.PurposeClassTests
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PurposeTests<SUT extends javax.xml.crypto.KeySelector.Purpose>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.xml.crypto.KeySelector.Purpose#toString() public java.lang.String
         * javax.xml.crypto.KeySelector$Purpose.toString()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_toString()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.KeySelector#select(javax.xml.crypto.dsig.keyinfo.KeyInfo,javax.xml.crypto.KeySelector.Purpose,javax.xml.crypto.AlgorithmMethod,javax.xml.crypto.XMLCryptoContext)
     * public abstract javax.xml.crypto.KeySelectorResult
     * javax.xml.crypto.KeySelector.select(javax.xml.crypto.dsig.keyinfo.KeyInfo,javax.xml.crypto.KeySelector$Purpose,javax.xml.crypto.AlgorithmMethod,javax.xml.crypto.XMLCryptoContext)
     * throws javax.xml.crypto.KeySelectorException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_select_KeyInfo_Purpose_AlgorithmMethod_XMLCryptoContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

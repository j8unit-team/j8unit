package org.j8unit.repository.javax.xml.crypto;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.crypto.KeySelector class javax.xml.crypto.KeySelector}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link KeySelectorClassTests}.
 * </p>
 *
 * @see javax.xml.crypto.KeySelector class javax.xml.crypto.KeySelector (the hereby targeted class-under-test class)
 * @see KeySelectorClassTests KeySelectorClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface KeySelectorTests<SUT extends javax.xml.crypto.KeySelector>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.KeySelector#select(javax.xml.crypto.dsig.keyinfo.KeyInfo, javax.xml.crypto.KeySelector.Purpose, javax.xml.crypto.AlgorithmMethod, javax.xml.crypto.XMLCryptoContext)
     * public abstract javax.xml.crypto.KeySelectorResult
     * javax.xml.crypto.KeySelector.select(javax.xml.crypto.dsig.keyinfo.KeyInfo,javax.xml.crypto.KeySelector$Purpose,javax.xml.crypto.AlgorithmMethod,javax.xml.crypto.XMLCryptoContext)
     * throws javax.xml.crypto.KeySelectorException}.
     *
     * <p>
     * Test method for
     * {@link javax.xml.crypto.KeySelector#select(javax.xml.crypto.dsig.keyinfo.KeyInfo, javax.xml.crypto.KeySelector.Purpose, javax.xml.crypto.AlgorithmMethod, javax.xml.crypto.XMLCryptoContext)
     * public abstract javax.xml.crypto.KeySelectorResult
     * javax.xml.crypto.KeySelector.select(javax.xml.crypto.dsig.keyinfo.KeyInfo,javax.xml.crypto.KeySelector$Purpose,javax.xml.crypto.AlgorithmMethod,javax.xml.crypto.XMLCryptoContext)
     * throws javax.xml.crypto.KeySelectorException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.KeySelector#select(javax.xml.crypto.dsig.keyinfo.KeyInfo,
     *      javax.xml.crypto.KeySelector.Purpose, javax.xml.crypto.AlgorithmMethod, javax.xml.crypto.XMLCryptoContext)
     *      public abstract javax.xml.crypto.KeySelectorResult
     *      javax.xml.crypto.KeySelector.select(javax.xml.crypto.dsig.keyinfo.KeyInfo,javax.xml.crypto.
     *      KeySelector$Purpose,javax.xml.crypto.AlgorithmMethod,javax.xml.crypto.XMLCryptoContext) throws
     *      javax.xml.crypto.KeySelectorException (the hereby targeted method-under-test)
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

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.xml.crypto.KeySelector.Purpose class
     * javax.xml.crypto.KeySelector$Purpose}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link KeySelectorClassTests.PurposeClassTests}.
     * </p>
     *
     * @see javax.xml.crypto.KeySelector.Purpose class javax.xml.crypto.KeySelector$Purpose (the hereby targeted
     *      class-under-test class)
     * @see KeySelectorClassTests.PurposeClassTests KeySelectorClassTests.PurposeClassTests (the complementary j8unit
     *      test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PurposeTests<SUT extends javax.xml.crypto.KeySelector.Purpose>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.xml.crypto.KeySelector.Purpose#toString() public java.lang.String
         * javax.xml.crypto.KeySelector$Purpose.toString()}.
         *
         * <p>
         * Test method for {@link javax.xml.crypto.KeySelector.Purpose#toString() public java.lang.String
         * javax.xml.crypto.KeySelector$Purpose.toString()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.xml.crypto.KeySelector.Purpose#toString() public java.lang.String
         *      javax.xml.crypto.KeySelector$Purpose.toString() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_toString()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}

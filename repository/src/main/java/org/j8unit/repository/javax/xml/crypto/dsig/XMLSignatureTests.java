package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.crypto.dsig.XMLSignature interface
 * javax.xml.crypto.dsig.XMLSignature}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link XMLSignatureClassTests}.
 * </p>
 *
 * @see javax.xml.crypto.dsig.XMLSignature interface javax.xml.crypto.dsig.XMLSignature (the hereby targeted
 *      class-under-test class)
 * @see XMLSignatureClassTests XMLSignatureClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XMLSignatureTests<SUT extends javax.xml.crypto.dsig.XMLSignature>
extends org.j8unit.repository.javax.xml.crypto.XMLStructureTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignature#validate(javax.xml.crypto.dsig.XMLValidateContext)
     * public abstract boolean javax.xml.crypto.dsig.XMLSignature.validate(javax.xml.crypto.dsig.XMLValidateContext)
     * throws javax.xml.crypto.dsig.XMLSignatureException}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignature#validate(javax.xml.crypto.dsig.XMLValidateContext)
     * public abstract boolean javax.xml.crypto.dsig.XMLSignature.validate(javax.xml.crypto.dsig.XMLValidateContext)
     * throws javax.xml.crypto.dsig.XMLSignatureException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignature#validate(javax.xml.crypto.dsig.XMLValidateContext) public abstract
     *      boolean javax.xml.crypto.dsig.XMLSignature.validate(javax.xml.crypto.dsig.XMLValidateContext) throws
     *      javax.xml.crypto.dsig.XMLSignatureException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_validate_XMLValidateContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignature#getObjects() public abstract java.util.List
     * javax.xml.crypto.dsig.XMLSignature.getObjects()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignature#getObjects() public abstract java.util.List
     * javax.xml.crypto.dsig.XMLSignature.getObjects()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignature#getObjects() public abstract java.util.List
     *      javax.xml.crypto.dsig.XMLSignature.getObjects() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getObjects()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignature#getId() public abstract java.lang.String
     * javax.xml.crypto.dsig.XMLSignature.getId()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignature#getId() public abstract java.lang.String
     * javax.xml.crypto.dsig.XMLSignature.getId()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignature#getId() public abstract java.lang.String
     *      javax.xml.crypto.dsig.XMLSignature.getId() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getId()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignature#getKeyInfo() public abstract
     * javax.xml.crypto.dsig.keyinfo.KeyInfo javax.xml.crypto.dsig.XMLSignature.getKeyInfo()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignature#getKeyInfo() public abstract
     * javax.xml.crypto.dsig.keyinfo.KeyInfo javax.xml.crypto.dsig.XMLSignature.getKeyInfo()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignature#getKeyInfo() public abstract javax.xml.crypto.dsig.keyinfo.KeyInfo
     *      javax.xml.crypto.dsig.XMLSignature.getKeyInfo() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getKeyInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignature#sign(javax.xml.crypto.dsig.XMLSignContext) public
     * abstract void javax.xml.crypto.dsig.XMLSignature.sign(javax.xml.crypto.dsig.XMLSignContext) throws
     * javax.xml.crypto.MarshalException,javax.xml.crypto.dsig.XMLSignatureException}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignature#sign(javax.xml.crypto.dsig.XMLSignContext) public
     * abstract void javax.xml.crypto.dsig.XMLSignature.sign(javax.xml.crypto.dsig.XMLSignContext) throws
     * javax.xml.crypto.MarshalException,javax.xml.crypto.dsig.XMLSignatureException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignature#sign(javax.xml.crypto.dsig.XMLSignContext) public abstract void
     *      javax.xml.crypto.dsig.XMLSignature.sign(javax.xml.crypto.dsig.XMLSignContext) throws
     *      javax.xml.crypto.MarshalException,javax.xml.crypto.dsig.XMLSignatureException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_sign_XMLSignContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignature#getKeySelectorResult() public abstract
     * javax.xml.crypto.KeySelectorResult javax.xml.crypto.dsig.XMLSignature.getKeySelectorResult()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignature#getKeySelectorResult() public abstract
     * javax.xml.crypto.KeySelectorResult javax.xml.crypto.dsig.XMLSignature.getKeySelectorResult()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignature#getKeySelectorResult() public abstract javax.xml.crypto.KeySelectorResult
     *      javax.xml.crypto.dsig.XMLSignature.getKeySelectorResult() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getKeySelectorResult()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignature#getSignedInfo() public abstract
     * javax.xml.crypto.dsig.SignedInfo javax.xml.crypto.dsig.XMLSignature.getSignedInfo()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignature#getSignedInfo() public abstract
     * javax.xml.crypto.dsig.SignedInfo javax.xml.crypto.dsig.XMLSignature.getSignedInfo()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignature#getSignedInfo() public abstract javax.xml.crypto.dsig.SignedInfo
     *      javax.xml.crypto.dsig.XMLSignature.getSignedInfo() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSignedInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignature#getSignatureValue() public abstract
     * javax.xml.crypto.dsig.XMLSignature$SignatureValue javax.xml.crypto.dsig.XMLSignature.getSignatureValue()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignature#getSignatureValue() public abstract
     * javax.xml.crypto.dsig.XMLSignature$SignatureValue javax.xml.crypto.dsig.XMLSignature.getSignatureValue()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignature#getSignatureValue() public abstract
     *      javax.xml.crypto.dsig.XMLSignature$SignatureValue javax.xml.crypto.dsig.XMLSignature.getSignatureValue()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSignatureValue()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.xml.crypto.dsig.XMLSignature.SignatureValue interface
     * javax.xml.crypto.dsig.XMLSignature$SignatureValue}. The complementary j8unit test interface containing the class
     * relevant aspects is {@link XMLSignatureClassTests.SignatureValueClassTests}.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignature.SignatureValue interface
     *      javax.xml.crypto.dsig.XMLSignature$SignatureValue (the hereby targeted class-under-test class)
     * @see XMLSignatureClassTests.SignatureValueClassTests XMLSignatureClassTests.SignatureValueClassTests (the
     *      complementary j8unit test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface SignatureValueTests<SUT extends javax.xml.crypto.dsig.XMLSignature.SignatureValue>
    extends org.j8unit.repository.javax.xml.crypto.XMLStructureTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.xml.crypto.dsig.XMLSignature.SignatureValue#getValue() public abstract byte[]
         * javax.xml.crypto.dsig.XMLSignature$SignatureValue.getValue()}.
         *
         * <p>
         * Test method for {@link javax.xml.crypto.dsig.XMLSignature.SignatureValue#getValue() public abstract byte[]
         * javax.xml.crypto.dsig.XMLSignature$SignatureValue.getValue()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.xml.crypto.dsig.XMLSignature.SignatureValue#getValue() public abstract byte[]
         *      javax.xml.crypto.dsig.XMLSignature$SignatureValue.getValue() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getValue()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for
         * {@link javax.xml.crypto.dsig.XMLSignature.SignatureValue#validate(javax.xml.crypto.dsig.XMLValidateContext)
         * public abstract boolean
         * javax.xml.crypto.dsig.XMLSignature$SignatureValue.validate(javax.xml.crypto.dsig.XMLValidateContext) throws
         * javax.xml.crypto.dsig.XMLSignatureException}.
         *
         * <p>
         * Test method for
         * {@link javax.xml.crypto.dsig.XMLSignature.SignatureValue#validate(javax.xml.crypto.dsig.XMLValidateContext)
         * public abstract boolean
         * javax.xml.crypto.dsig.XMLSignature$SignatureValue.validate(javax.xml.crypto.dsig.XMLValidateContext) throws
         * javax.xml.crypto.dsig.XMLSignatureException}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.xml.crypto.dsig.XMLSignature.SignatureValue#validate(javax.xml.crypto.dsig.XMLValidateContext)
         *      public abstract boolean
         *      javax.xml.crypto.dsig.XMLSignature$SignatureValue.validate(javax.xml.crypto.dsig.XMLValidateContext)
         *      throws javax.xml.crypto.dsig.XMLSignatureException (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_validate_XMLValidateContext()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.xml.crypto.dsig.XMLSignature.SignatureValue#getId() public abstract
         * java.lang.String javax.xml.crypto.dsig.XMLSignature$SignatureValue.getId()}.
         *
         * <p>
         * Test method for {@link javax.xml.crypto.dsig.XMLSignature.SignatureValue#getId() public abstract
         * java.lang.String javax.xml.crypto.dsig.XMLSignature$SignatureValue.getId()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.xml.crypto.dsig.XMLSignature.SignatureValue#getId() public abstract java.lang.String
         *      javax.xml.crypto.dsig.XMLSignature$SignatureValue.getId() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getId()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}

package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.xml.crypto.dsig.XMLSignature interface javax.xml.crypto.dsig.XMLSignature},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.crypto.dsig.XMLSignatureClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface XMLSignatureTests<SUT extends javax.xml.crypto.dsig.XMLSignature>
extends org.j8unit.repository.javax.xml.crypto.XMLStructureTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignature#validate(javax.xml.crypto.dsig.XMLValidateContext) public abstract boolean javax.xml.crypto.dsig.XMLSignature.validate(javax.xml.crypto.dsig.XMLValidateContext) throws javax.xml.crypto.dsig.XMLSignatureException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_validate_XMLValidateContext() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignature#getObjects() public abstract java.util.List javax.xml.crypto.dsig.XMLSignature.getObjects()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getObjects() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignature#getId() public abstract java.lang.String javax.xml.crypto.dsig.XMLSignature.getId()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getId() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignature#getKeyInfo() public abstract javax.xml.crypto.dsig.keyinfo.KeyInfo javax.xml.crypto.dsig.XMLSignature.getKeyInfo()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getKeyInfo() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignature#sign(javax.xml.crypto.dsig.XMLSignContext) public abstract void javax.xml.crypto.dsig.XMLSignature.sign(javax.xml.crypto.dsig.XMLSignContext) throws javax.xml.crypto.MarshalException,javax.xml.crypto.dsig.XMLSignatureException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_sign_XMLSignContext() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignature#getKeySelectorResult() public abstract javax.xml.crypto.KeySelectorResult javax.xml.crypto.dsig.XMLSignature.getKeySelectorResult()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getKeySelectorResult() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignature#getSignedInfo() public abstract javax.xml.crypto.dsig.SignedInfo javax.xml.crypto.dsig.XMLSignature.getSignedInfo()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSignedInfo() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignature#getSignatureValue() public abstract javax.xml.crypto.dsig.XMLSignature$SignatureValue javax.xml.crypto.dsig.XMLSignature.getSignatureValue()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSignatureValue() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link javax.xml.crypto.dsig.XMLSignature$SignatureValue interface javax.xml.crypto.dsig.XMLSignature$SignatureValue},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.xml.crypto.dsig.XMLSignatureClassTests.SignatureValueClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface SignatureValueTests<SUT extends javax.xml.crypto.dsig.XMLSignature.SignatureValue>
    extends org.j8unit.repository.javax.xml.crypto.XMLStructureTests<SUT>
    {

        /**
         * <p>
         * Test method for {@link javax.xml.crypto.dsig.XMLSignature.SignatureValue#getValue() public abstract byte[] javax.xml.crypto.dsig.XMLSignature$SignatureValue.getValue()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getValue() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.xml.crypto.dsig.XMLSignature.SignatureValue#validate(javax.xml.crypto.dsig.XMLValidateContext) public abstract boolean javax.xml.crypto.dsig.XMLSignature$SignatureValue.validate(javax.xml.crypto.dsig.XMLValidateContext) throws javax.xml.crypto.dsig.XMLSignatureException}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_validate_XMLValidateContext() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.xml.crypto.dsig.XMLSignature.SignatureValue#getId() public abstract java.lang.String javax.xml.crypto.dsig.XMLSignature$SignatureValue.getId()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getId() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}

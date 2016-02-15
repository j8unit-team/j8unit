package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.crypto.dsig.XMLSignatureFactory class
 * javax.xml.crypto.dsig.XMLSignatureFactory}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link XMLSignatureFactoryClassTests}.
 * </p>
 *
 * @see javax.xml.crypto.dsig.XMLSignatureFactory class javax.xml.crypto.dsig.XMLSignatureFactory (the hereby targeted
 *      class-under-test class)
 * @see XMLSignatureFactoryClassTests XMLSignatureFactoryClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface XMLSignatureFactoryTests<SUT extends javax.xml.crypto.dsig.XMLSignatureFactory>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newXMLSignature(javax.xml.crypto.dsig.SignedInfo, javax.xml.crypto.dsig.keyinfo.KeyInfo, java.util.List, String, String)
     * public abstract javax.xml.crypto.dsig.XMLSignature
     * javax.xml.crypto.dsig.XMLSignatureFactory.newXMLSignature(javax.xml.crypto.dsig.SignedInfo,javax.xml.crypto.dsig.keyinfo.KeyInfo,java.util.List,java.lang.String,java.lang.String)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newXMLSignature(javax.xml.crypto.dsig.SignedInfo, javax.xml.crypto.dsig.keyinfo.KeyInfo, java.util.List, String, String)
     * public abstract javax.xml.crypto.dsig.XMLSignature
     * javax.xml.crypto.dsig.XMLSignatureFactory.newXMLSignature(javax.xml.crypto.dsig.SignedInfo,javax.xml.crypto.dsig.keyinfo.KeyInfo,java.util.List,java.lang.String,java.lang.String)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignatureFactory#newXMLSignature(javax.xml.crypto.dsig.SignedInfo,
     *      javax.xml.crypto.dsig.keyinfo.KeyInfo, java.util.List, String, String) public abstract
     *      javax.xml.crypto.dsig.XMLSignature
     *      javax.xml.crypto.dsig.XMLSignatureFactory.newXMLSignature(javax.xml.crypto.dsig.SignedInfo,javax.xml.crypto.
     *      dsig.keyinfo.KeyInfo,java.util.List,java.lang.String,java.lang.String) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newXMLSignature_SignedInfo_KeyInfo_List_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newXMLSignature(javax.xml.crypto.dsig.SignedInfo, javax.xml.crypto.dsig.keyinfo.KeyInfo)
     * public abstract javax.xml.crypto.dsig.XMLSignature
     * javax.xml.crypto.dsig.XMLSignatureFactory.newXMLSignature(javax.xml.crypto.dsig.SignedInfo,javax.xml.crypto.dsig.keyinfo.KeyInfo)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newXMLSignature(javax.xml.crypto.dsig.SignedInfo, javax.xml.crypto.dsig.keyinfo.KeyInfo)
     * public abstract javax.xml.crypto.dsig.XMLSignature
     * javax.xml.crypto.dsig.XMLSignatureFactory.newXMLSignature(javax.xml.crypto.dsig.SignedInfo,javax.xml.crypto.dsig.keyinfo.KeyInfo)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignatureFactory#newXMLSignature(javax.xml.crypto.dsig.SignedInfo,
     *      javax.xml.crypto.dsig.keyinfo.KeyInfo) public abstract javax.xml.crypto.dsig.XMLSignature
     *      javax.xml.crypto.dsig.XMLSignatureFactory.newXMLSignature(javax.xml.crypto.dsig.SignedInfo,javax.xml.crypto.
     *      dsig.keyinfo.KeyInfo) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newXMLSignature_SignedInfo_KeyInfo()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignatureFactory#isFeatureSupported(String) public abstract
     * boolean javax.xml.crypto.dsig.XMLSignatureFactory.isFeatureSupported(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignatureFactory#isFeatureSupported(String) public abstract
     * boolean javax.xml.crypto.dsig.XMLSignatureFactory.isFeatureSupported(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignatureFactory#isFeatureSupported(String) public abstract boolean
     *      javax.xml.crypto.dsig.XMLSignatureFactory.isFeatureSupported(java.lang.String) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isFeatureSupported_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newSignedInfo(javax.xml.crypto.dsig.CanonicalizationMethod, javax.xml.crypto.dsig.SignatureMethod, java.util.List)
     * public abstract javax.xml.crypto.dsig.SignedInfo
     * javax.xml.crypto.dsig.XMLSignatureFactory.newSignedInfo(javax.xml.crypto.dsig.CanonicalizationMethod,javax.xml.crypto.dsig.SignatureMethod,java.util.List)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newSignedInfo(javax.xml.crypto.dsig.CanonicalizationMethod, javax.xml.crypto.dsig.SignatureMethod, java.util.List)
     * public abstract javax.xml.crypto.dsig.SignedInfo
     * javax.xml.crypto.dsig.XMLSignatureFactory.newSignedInfo(javax.xml.crypto.dsig.CanonicalizationMethod,javax.xml.crypto.dsig.SignatureMethod,java.util.List)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignatureFactory#newSignedInfo(javax.xml.crypto.dsig.CanonicalizationMethod,
     *      javax.xml.crypto.dsig.SignatureMethod, java.util.List) public abstract javax.xml.crypto.dsig.SignedInfo
     *      javax.xml.crypto.dsig.XMLSignatureFactory.newSignedInfo(javax.xml.crypto.dsig.CanonicalizationMethod,javax.
     *      xml.crypto.dsig.SignatureMethod,java.util.List) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newSignedInfo_CanonicalizationMethod_SignatureMethod_List()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newSignedInfo(javax.xml.crypto.dsig.CanonicalizationMethod, javax.xml.crypto.dsig.SignatureMethod, java.util.List, String)
     * public abstract javax.xml.crypto.dsig.SignedInfo
     * javax.xml.crypto.dsig.XMLSignatureFactory.newSignedInfo(javax.xml.crypto.dsig.CanonicalizationMethod,javax.xml.crypto.dsig.SignatureMethod,java.util.List,java.lang.String)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newSignedInfo(javax.xml.crypto.dsig.CanonicalizationMethod, javax.xml.crypto.dsig.SignatureMethod, java.util.List, String)
     * public abstract javax.xml.crypto.dsig.SignedInfo
     * javax.xml.crypto.dsig.XMLSignatureFactory.newSignedInfo(javax.xml.crypto.dsig.CanonicalizationMethod,javax.xml.crypto.dsig.SignatureMethod,java.util.List,java.lang.String)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignatureFactory#newSignedInfo(javax.xml.crypto.dsig.CanonicalizationMethod,
     *      javax.xml.crypto.dsig.SignatureMethod, java.util.List, String) public abstract
     *      javax.xml.crypto.dsig.SignedInfo
     *      javax.xml.crypto.dsig.XMLSignatureFactory.newSignedInfo(javax.xml.crypto.dsig.CanonicalizationMethod,javax.
     *      xml.crypto.dsig.SignatureMethod,java.util.List,java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newSignedInfo_CanonicalizationMethod_SignatureMethod_List_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newSignatureProperty(java.util.List, String, String) public
     * abstract javax.xml.crypto.dsig.SignatureProperty
     * javax.xml.crypto.dsig.XMLSignatureFactory.newSignatureProperty(java.util.List,java.lang.String,java.lang.String)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newSignatureProperty(java.util.List, String, String) public
     * abstract javax.xml.crypto.dsig.SignatureProperty
     * javax.xml.crypto.dsig.XMLSignatureFactory.newSignatureProperty(java.util.List,java.lang.String,java.lang.String)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignatureFactory#newSignatureProperty(java.util.List, String, String) public
     *      abstract javax.xml.crypto.dsig.SignatureProperty
     *      javax.xml.crypto.dsig.XMLSignatureFactory.newSignatureProperty(java.util.List,java.lang.String,java.lang.
     *      String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newSignatureProperty_List_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignatureFactory#getMechanismType() public final java.lang.String
     * javax.xml.crypto.dsig.XMLSignatureFactory.getMechanismType()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignatureFactory#getMechanismType() public final java.lang.String
     * javax.xml.crypto.dsig.XMLSignatureFactory.getMechanismType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignatureFactory#getMechanismType() public final java.lang.String
     *      javax.xml.crypto.dsig.XMLSignatureFactory.getMechanismType() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMechanismType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newTransform(String, javax.xml.crypto.dsig.spec.TransformParameterSpec)
     * public abstract javax.xml.crypto.dsig.Transform
     * javax.xml.crypto.dsig.XMLSignatureFactory.newTransform(java.lang.String,javax.xml.crypto.dsig.spec.TransformParameterSpec)
     * throws java.security.NoSuchAlgorithmException,java.security.InvalidAlgorithmParameterException}.
     *
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newTransform(String, javax.xml.crypto.dsig.spec.TransformParameterSpec)
     * public abstract javax.xml.crypto.dsig.Transform
     * javax.xml.crypto.dsig.XMLSignatureFactory.newTransform(java.lang.String,javax.xml.crypto.dsig.spec.TransformParameterSpec)
     * throws java.security.NoSuchAlgorithmException,java.security.InvalidAlgorithmParameterException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignatureFactory#newTransform(String,
     *      javax.xml.crypto.dsig.spec.TransformParameterSpec) public abstract javax.xml.crypto.dsig.Transform
     *      javax.xml.crypto.dsig.XMLSignatureFactory.newTransform(java.lang.String,javax.xml.crypto.dsig.spec.
     *      TransformParameterSpec) throws
     *      java.security.NoSuchAlgorithmException,java.security.InvalidAlgorithmParameterException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newTransform_String_TransformParameterSpec()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newTransform(String, javax.xml.crypto.XMLStructure) public
     * abstract javax.xml.crypto.dsig.Transform
     * javax.xml.crypto.dsig.XMLSignatureFactory.newTransform(java.lang.String,javax.xml.crypto.XMLStructure) throws
     * java.security.NoSuchAlgorithmException,java.security.InvalidAlgorithmParameterException}.
     *
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newTransform(String, javax.xml.crypto.XMLStructure) public
     * abstract javax.xml.crypto.dsig.Transform
     * javax.xml.crypto.dsig.XMLSignatureFactory.newTransform(java.lang.String,javax.xml.crypto.XMLStructure) throws
     * java.security.NoSuchAlgorithmException,java.security.InvalidAlgorithmParameterException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignatureFactory#newTransform(String, javax.xml.crypto.XMLStructure) public
     *      abstract javax.xml.crypto.dsig.Transform
     *      javax.xml.crypto.dsig.XMLSignatureFactory.newTransform(java.lang.String,javax.xml.crypto.XMLStructure)
     *      throws java.security.NoSuchAlgorithmException,java.security.InvalidAlgorithmParameterException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newTransform_String_XMLStructure()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newReference(String, javax.xml.crypto.dsig.DigestMethod, java.util.List, String, String, byte[])
     * public abstract javax.xml.crypto.dsig.Reference
     * javax.xml.crypto.dsig.XMLSignatureFactory.newReference(java.lang.String,javax.xml.crypto.dsig.DigestMethod,java.util.List,java.lang.String,java.lang.String,byte[])}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newReference(String, javax.xml.crypto.dsig.DigestMethod, java.util.List, String, String, byte[])
     * public abstract javax.xml.crypto.dsig.Reference
     * javax.xml.crypto.dsig.XMLSignatureFactory.newReference(java.lang.String,javax.xml.crypto.dsig.DigestMethod,java.util.List,java.lang.String,java.lang.String,byte[])}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignatureFactory#newReference(String, javax.xml.crypto.dsig.DigestMethod,
     *      java.util.List, String, String, byte[]) public abstract javax.xml.crypto.dsig.Reference
     *      javax.xml.crypto.dsig.XMLSignatureFactory.newReference(java.lang.String,javax.xml.crypto.dsig.DigestMethod,
     *      java.util.List,java.lang.String,java.lang.String,byte[]) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newReference_String_DigestMethod_List_String_String_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newReference(String, javax.xml.crypto.dsig.DigestMethod, java.util.List, javax.xml.crypto.Data, java.util.List, String, String)
     * public abstract javax.xml.crypto.dsig.Reference
     * javax.xml.crypto.dsig.XMLSignatureFactory.newReference(java.lang.String,javax.xml.crypto.dsig.DigestMethod,java.util.List,javax.xml.crypto.Data,java.util.List,java.lang.String,java.lang.String)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newReference(String, javax.xml.crypto.dsig.DigestMethod, java.util.List, javax.xml.crypto.Data, java.util.List, String, String)
     * public abstract javax.xml.crypto.dsig.Reference
     * javax.xml.crypto.dsig.XMLSignatureFactory.newReference(java.lang.String,javax.xml.crypto.dsig.DigestMethod,java.util.List,javax.xml.crypto.Data,java.util.List,java.lang.String,java.lang.String)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignatureFactory#newReference(String, javax.xml.crypto.dsig.DigestMethod,
     *      java.util.List, javax.xml.crypto.Data, java.util.List, String, String) public abstract
     *      javax.xml.crypto.dsig.Reference
     *      javax.xml.crypto.dsig.XMLSignatureFactory.newReference(java.lang.String,javax.xml.crypto.dsig.DigestMethod,
     *      java.util.List,javax.xml.crypto.Data,java.util.List,java.lang.String,java.lang.String) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newReference_String_DigestMethod_List_Data_List_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newReference(String, javax.xml.crypto.dsig.DigestMethod) public
     * abstract javax.xml.crypto.dsig.Reference
     * javax.xml.crypto.dsig.XMLSignatureFactory.newReference(java.lang.String,javax.xml.crypto.dsig.DigestMethod)}.
     *
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newReference(String, javax.xml.crypto.dsig.DigestMethod) public
     * abstract javax.xml.crypto.dsig.Reference
     * javax.xml.crypto.dsig.XMLSignatureFactory.newReference(java.lang.String,javax.xml.crypto.dsig.DigestMethod)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignatureFactory#newReference(String, javax.xml.crypto.dsig.DigestMethod) public
     *      abstract javax.xml.crypto.dsig.Reference
     *      javax.xml.crypto.dsig.XMLSignatureFactory.newReference(java.lang.String,javax.xml.crypto.dsig.DigestMethod)
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newReference_String_DigestMethod()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newReference(String, javax.xml.crypto.dsig.DigestMethod, java.util.List, String, String)
     * public abstract javax.xml.crypto.dsig.Reference
     * javax.xml.crypto.dsig.XMLSignatureFactory.newReference(java.lang.String,javax.xml.crypto.dsig.DigestMethod,java.util.List,java.lang.String,java.lang.String)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newReference(String, javax.xml.crypto.dsig.DigestMethod, java.util.List, String, String)
     * public abstract javax.xml.crypto.dsig.Reference
     * javax.xml.crypto.dsig.XMLSignatureFactory.newReference(java.lang.String,javax.xml.crypto.dsig.DigestMethod,java.util.List,java.lang.String,java.lang.String)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignatureFactory#newReference(String, javax.xml.crypto.dsig.DigestMethod,
     *      java.util.List, String, String) public abstract javax.xml.crypto.dsig.Reference
     *      javax.xml.crypto.dsig.XMLSignatureFactory.newReference(java.lang.String,javax.xml.crypto.dsig.DigestMethod,
     *      java.util.List,java.lang.String,java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newReference_String_DigestMethod_List_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newXMLObject(java.util.List, String, String, String) public
     * abstract javax.xml.crypto.dsig.XMLObject
     * javax.xml.crypto.dsig.XMLSignatureFactory.newXMLObject(java.util.List,java.lang.String,java.lang.String,java.lang.String)}
     * .
     *
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newXMLObject(java.util.List, String, String, String) public
     * abstract javax.xml.crypto.dsig.XMLObject
     * javax.xml.crypto.dsig.XMLSignatureFactory.newXMLObject(java.util.List,java.lang.String,java.lang.String,java.lang.String)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignatureFactory#newXMLObject(java.util.List, String, String, String) public
     *      abstract javax.xml.crypto.dsig.XMLObject
     *      javax.xml.crypto.dsig.XMLSignatureFactory.newXMLObject(java.util.List,java.lang.String,java.lang.String,java
     *      .lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newXMLObject_List_String_String_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignatureFactory#newManifest(java.util.List) public abstract
     * javax.xml.crypto.dsig.Manifest javax.xml.crypto.dsig.XMLSignatureFactory.newManifest(java.util.List)}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignatureFactory#newManifest(java.util.List) public abstract
     * javax.xml.crypto.dsig.Manifest javax.xml.crypto.dsig.XMLSignatureFactory.newManifest(java.util.List)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignatureFactory#newManifest(java.util.List) public abstract
     *      javax.xml.crypto.dsig.Manifest javax.xml.crypto.dsig.XMLSignatureFactory.newManifest(java.util.List) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newManifest_List()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignatureFactory#newManifest(java.util.List, String) public
     * abstract javax.xml.crypto.dsig.Manifest
     * javax.xml.crypto.dsig.XMLSignatureFactory.newManifest(java.util.List,java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignatureFactory#newManifest(java.util.List, String) public
     * abstract javax.xml.crypto.dsig.Manifest
     * javax.xml.crypto.dsig.XMLSignatureFactory.newManifest(java.util.List,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignatureFactory#newManifest(java.util.List, String) public abstract
     *      javax.xml.crypto.dsig.Manifest
     *      javax.xml.crypto.dsig.XMLSignatureFactory.newManifest(java.util.List,java.lang.String) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newManifest_List_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#unmarshalXMLSignature(javax.xml.crypto.dsig.XMLValidateContext)
     * public abstract javax.xml.crypto.dsig.XMLSignature
     * javax.xml.crypto.dsig.XMLSignatureFactory.unmarshalXMLSignature(javax.xml.crypto.dsig.XMLValidateContext) throws
     * javax.xml.crypto.MarshalException}.
     *
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#unmarshalXMLSignature(javax.xml.crypto.dsig.XMLValidateContext)
     * public abstract javax.xml.crypto.dsig.XMLSignature
     * javax.xml.crypto.dsig.XMLSignatureFactory.unmarshalXMLSignature(javax.xml.crypto.dsig.XMLValidateContext) throws
     * javax.xml.crypto.MarshalException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignatureFactory#unmarshalXMLSignature(javax.xml.crypto.dsig.XMLValidateContext)
     *      public abstract javax.xml.crypto.dsig.XMLSignature
     *      javax.xml.crypto.dsig.XMLSignatureFactory.unmarshalXMLSignature(javax.xml.crypto.dsig.XMLValidateContext)
     *      throws javax.xml.crypto.MarshalException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unmarshalXMLSignature_XMLValidateContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#unmarshalXMLSignature(javax.xml.crypto.XMLStructure) public
     * abstract javax.xml.crypto.dsig.XMLSignature
     * javax.xml.crypto.dsig.XMLSignatureFactory.unmarshalXMLSignature(javax.xml.crypto.XMLStructure) throws
     * javax.xml.crypto.MarshalException}.
     *
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#unmarshalXMLSignature(javax.xml.crypto.XMLStructure) public
     * abstract javax.xml.crypto.dsig.XMLSignature
     * javax.xml.crypto.dsig.XMLSignatureFactory.unmarshalXMLSignature(javax.xml.crypto.XMLStructure) throws
     * javax.xml.crypto.MarshalException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignatureFactory#unmarshalXMLSignature(javax.xml.crypto.XMLStructure) public
     *      abstract javax.xml.crypto.dsig.XMLSignature
     *      javax.xml.crypto.dsig.XMLSignatureFactory.unmarshalXMLSignature(javax.xml.crypto.XMLStructure) throws
     *      javax.xml.crypto.MarshalException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unmarshalXMLSignature_XMLStructure()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newSignatureMethod(String, javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec)
     * public abstract javax.xml.crypto.dsig.SignatureMethod
     * javax.xml.crypto.dsig.XMLSignatureFactory.newSignatureMethod(java.lang.String,javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec)
     * throws java.security.NoSuchAlgorithmException,java.security.InvalidAlgorithmParameterException}.
     *
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newSignatureMethod(String, javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec)
     * public abstract javax.xml.crypto.dsig.SignatureMethod
     * javax.xml.crypto.dsig.XMLSignatureFactory.newSignatureMethod(java.lang.String,javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec)
     * throws java.security.NoSuchAlgorithmException,java.security.InvalidAlgorithmParameterException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignatureFactory#newSignatureMethod(String,
     *      javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec) public abstract
     *      javax.xml.crypto.dsig.SignatureMethod
     *      javax.xml.crypto.dsig.XMLSignatureFactory.newSignatureMethod(java.lang.String,javax.xml.crypto.dsig.spec.
     *      SignatureMethodParameterSpec) throws
     *      java.security.NoSuchAlgorithmException,java.security.InvalidAlgorithmParameterException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newSignatureMethod_String_SignatureMethodParameterSpec()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newDigestMethod(String, javax.xml.crypto.dsig.spec.DigestMethodParameterSpec)
     * public abstract javax.xml.crypto.dsig.DigestMethod
     * javax.xml.crypto.dsig.XMLSignatureFactory.newDigestMethod(java.lang.String,javax.xml.crypto.dsig.spec.DigestMethodParameterSpec)
     * throws java.security.NoSuchAlgorithmException,java.security.InvalidAlgorithmParameterException}.
     *
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newDigestMethod(String, javax.xml.crypto.dsig.spec.DigestMethodParameterSpec)
     * public abstract javax.xml.crypto.dsig.DigestMethod
     * javax.xml.crypto.dsig.XMLSignatureFactory.newDigestMethod(java.lang.String,javax.xml.crypto.dsig.spec.DigestMethodParameterSpec)
     * throws java.security.NoSuchAlgorithmException,java.security.InvalidAlgorithmParameterException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignatureFactory#newDigestMethod(String,
     *      javax.xml.crypto.dsig.spec.DigestMethodParameterSpec) public abstract javax.xml.crypto.dsig.DigestMethod
     *      javax.xml.crypto.dsig.XMLSignatureFactory.newDigestMethod(java.lang.String,javax.xml.crypto.dsig.spec.
     *      DigestMethodParameterSpec) throws
     *      java.security.NoSuchAlgorithmException,java.security.InvalidAlgorithmParameterException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newDigestMethod_String_DigestMethodParameterSpec()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignatureFactory#getProvider() public final
     * java.security.Provider javax.xml.crypto.dsig.XMLSignatureFactory.getProvider()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignatureFactory#getProvider() public final
     * java.security.Provider javax.xml.crypto.dsig.XMLSignatureFactory.getProvider()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignatureFactory#getProvider() public final java.security.Provider
     *      javax.xml.crypto.dsig.XMLSignatureFactory.getProvider() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getProvider()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignatureFactory#getURIDereferencer() public abstract
     * javax.xml.crypto.URIDereferencer javax.xml.crypto.dsig.XMLSignatureFactory.getURIDereferencer()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignatureFactory#getURIDereferencer() public abstract
     * javax.xml.crypto.URIDereferencer javax.xml.crypto.dsig.XMLSignatureFactory.getURIDereferencer()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignatureFactory#getURIDereferencer() public abstract
     *      javax.xml.crypto.URIDereferencer javax.xml.crypto.dsig.XMLSignatureFactory.getURIDereferencer() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getURIDereferencer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newCanonicalizationMethod(String, javax.xml.crypto.XMLStructure)
     * public abstract javax.xml.crypto.dsig.CanonicalizationMethod
     * javax.xml.crypto.dsig.XMLSignatureFactory.newCanonicalizationMethod(java.lang.String,javax.xml.crypto.XMLStructure)
     * throws java.security.NoSuchAlgorithmException,java.security.InvalidAlgorithmParameterException}.
     *
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newCanonicalizationMethod(String, javax.xml.crypto.XMLStructure)
     * public abstract javax.xml.crypto.dsig.CanonicalizationMethod
     * javax.xml.crypto.dsig.XMLSignatureFactory.newCanonicalizationMethod(java.lang.String,javax.xml.crypto.XMLStructure)
     * throws java.security.NoSuchAlgorithmException,java.security.InvalidAlgorithmParameterException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignatureFactory#newCanonicalizationMethod(String, javax.xml.crypto.XMLStructure)
     *      public abstract javax.xml.crypto.dsig.CanonicalizationMethod
     *      javax.xml.crypto.dsig.XMLSignatureFactory.newCanonicalizationMethod(java.lang.String,javax.xml.crypto.
     *      XMLStructure) throws java.security.NoSuchAlgorithmException,java.security.InvalidAlgorithmParameterException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newCanonicalizationMethod_String_XMLStructure()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newCanonicalizationMethod(String, javax.xml.crypto.dsig.spec.C14NMethodParameterSpec)
     * public abstract javax.xml.crypto.dsig.CanonicalizationMethod
     * javax.xml.crypto.dsig.XMLSignatureFactory.newCanonicalizationMethod(java.lang.String,javax.xml.crypto.dsig.spec.C14NMethodParameterSpec)
     * throws java.security.NoSuchAlgorithmException,java.security.InvalidAlgorithmParameterException}.
     *
     * <p>
     * Test method for
     * {@link javax.xml.crypto.dsig.XMLSignatureFactory#newCanonicalizationMethod(String, javax.xml.crypto.dsig.spec.C14NMethodParameterSpec)
     * public abstract javax.xml.crypto.dsig.CanonicalizationMethod
     * javax.xml.crypto.dsig.XMLSignatureFactory.newCanonicalizationMethod(java.lang.String,javax.xml.crypto.dsig.spec.C14NMethodParameterSpec)
     * throws java.security.NoSuchAlgorithmException,java.security.InvalidAlgorithmParameterException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignatureFactory#newCanonicalizationMethod(String,
     *      javax.xml.crypto.dsig.spec.C14NMethodParameterSpec) public abstract
     *      javax.xml.crypto.dsig.CanonicalizationMethod
     *      javax.xml.crypto.dsig.XMLSignatureFactory.newCanonicalizationMethod(java.lang.String,javax.xml.crypto.dsig.
     *      spec.C14NMethodParameterSpec) throws
     *      java.security.NoSuchAlgorithmException,java.security.InvalidAlgorithmParameterException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newCanonicalizationMethod_String_C14NMethodParameterSpec()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignatureFactory#newSignatureProperties(java.util.List, String)
     * public abstract javax.xml.crypto.dsig.SignatureProperties
     * javax.xml.crypto.dsig.XMLSignatureFactory.newSignatureProperties(java.util.List,java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignatureFactory#newSignatureProperties(java.util.List, String)
     * public abstract javax.xml.crypto.dsig.SignatureProperties
     * javax.xml.crypto.dsig.XMLSignatureFactory.newSignatureProperties(java.util.List,java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignatureFactory#newSignatureProperties(java.util.List, String) public abstract
     *      javax.xml.crypto.dsig.SignatureProperties
     *      javax.xml.crypto.dsig.XMLSignatureFactory.newSignatureProperties(java.util.List,java.lang.String) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newSignatureProperties_List_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignatureFactory#getKeyInfoFactory() public final
     * javax.xml.crypto.dsig.keyinfo.KeyInfoFactory javax.xml.crypto.dsig.XMLSignatureFactory.getKeyInfoFactory()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.XMLSignatureFactory#getKeyInfoFactory() public final
     * javax.xml.crypto.dsig.keyinfo.KeyInfoFactory javax.xml.crypto.dsig.XMLSignatureFactory.getKeyInfoFactory()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.XMLSignatureFactory#getKeyInfoFactory() public final
     *      javax.xml.crypto.dsig.keyinfo.KeyInfoFactory javax.xml.crypto.dsig.XMLSignatureFactory.getKeyInfoFactory()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getKeyInfoFactory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

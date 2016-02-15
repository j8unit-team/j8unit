package org.j8unit.repository.java.security;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.SignedObject class java.security.SignedObject}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SignedObjectClassTests}.
 * </p>
 *
 * @see java.security.SignedObject class java.security.SignedObject (the hereby targeted class-under-test class)
 * @see SignedObjectClassTests SignedObjectClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SignedObjectTests<SUT extends java.security.SignedObject>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.SignedObject#getObject() public java.lang.Object
     * java.security.SignedObject.getObject() throws java.io.IOException,java.lang.ClassNotFoundException}.
     *
     * <p>
     * Test method for {@link java.security.SignedObject#getObject() public java.lang.Object
     * java.security.SignedObject.getObject() throws java.io.IOException,java.lang.ClassNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.SignedObject#getObject() public java.lang.Object java.security.SignedObject.getObject() throws
     *      java.io.IOException,java.lang.ClassNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getObject()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.SignedObject#getAlgorithm() public java.lang.String
     * java.security.SignedObject.getAlgorithm()}.
     *
     * <p>
     * Test method for {@link java.security.SignedObject#getAlgorithm() public java.lang.String
     * java.security.SignedObject.getAlgorithm()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.SignedObject#getAlgorithm() public java.lang.String java.security.SignedObject.getAlgorithm()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAlgorithm()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.SignedObject#getSignature() public byte[]
     * java.security.SignedObject.getSignature()}.
     *
     * <p>
     * Test method for {@link java.security.SignedObject#getSignature() public byte[]
     * java.security.SignedObject.getSignature()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.SignedObject#getSignature() public byte[] java.security.SignedObject.getSignature() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSignature()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.SignedObject#verify(java.security.PublicKey, java.security.Signature) public
     * boolean java.security.SignedObject.verify(java.security.PublicKey,java.security.Signature) throws
     * java.security.InvalidKeyException,java.security.SignatureException}.
     *
     * <p>
     * Test method for {@link java.security.SignedObject#verify(java.security.PublicKey, java.security.Signature) public
     * boolean java.security.SignedObject.verify(java.security.PublicKey,java.security.Signature) throws
     * java.security.InvalidKeyException,java.security.SignatureException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.SignedObject#verify(java.security.PublicKey, java.security.Signature) public boolean
     *      java.security.SignedObject.verify(java.security.PublicKey,java.security.Signature) throws
     *      java.security.InvalidKeyException,java.security.SignatureException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_verify_PublicKey_Signature()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

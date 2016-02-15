package org.j8unit.repository.javax.crypto;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.crypto.SealedObject class javax.crypto.SealedObject}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SealedObjectClassTests}.
 * </p>
 *
 * @see javax.crypto.SealedObject class javax.crypto.SealedObject (the hereby targeted class-under-test class)
 * @see SealedObjectClassTests SealedObjectClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SealedObjectTests<SUT extends javax.crypto.SealedObject>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.crypto.SealedObject#getAlgorithm() public final java.lang.String
     * javax.crypto.SealedObject.getAlgorithm()}.
     *
     * <p>
     * Test method for {@link javax.crypto.SealedObject#getAlgorithm() public final java.lang.String
     * javax.crypto.SealedObject.getAlgorithm()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.SealedObject#getAlgorithm() public final java.lang.String
     *      javax.crypto.SealedObject.getAlgorithm() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.crypto.SealedObject#getObject(javax.crypto.Cipher) public final java.lang.Object
     * javax.crypto.SealedObject.getObject(javax.crypto.Cipher) throws
     * java.io.IOException,java.lang.ClassNotFoundException,javax.crypto.IllegalBlockSizeException,javax.crypto.BadPaddingException}
     * .
     *
     * <p>
     * Test method for {@link javax.crypto.SealedObject#getObject(javax.crypto.Cipher) public final java.lang.Object
     * javax.crypto.SealedObject.getObject(javax.crypto.Cipher) throws
     * java.io.IOException,java.lang.ClassNotFoundException,javax.crypto.IllegalBlockSizeException,javax.crypto.BadPaddingException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.SealedObject#getObject(javax.crypto.Cipher) public final java.lang.Object
     *      javax.crypto.SealedObject.getObject(javax.crypto.Cipher) throws
     *      java.io.IOException,java.lang.ClassNotFoundException,javax.crypto.IllegalBlockSizeException,javax.crypto.
     *      BadPaddingException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getObject_Cipher()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.SealedObject#getObject(java.security.Key, String) public final
     * java.lang.Object javax.crypto.SealedObject.getObject(java.security.Key,java.lang.String) throws
     * java.io.IOException,java.lang.ClassNotFoundException,java.security.NoSuchAlgorithmException,java.security.NoSuchProviderException,java.security.InvalidKeyException}
     * .
     *
     * <p>
     * Test method for {@link javax.crypto.SealedObject#getObject(java.security.Key, String) public final
     * java.lang.Object javax.crypto.SealedObject.getObject(java.security.Key,java.lang.String) throws
     * java.io.IOException,java.lang.ClassNotFoundException,java.security.NoSuchAlgorithmException,java.security.NoSuchProviderException,java.security.InvalidKeyException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.SealedObject#getObject(java.security.Key, String) public final java.lang.Object
     *      javax.crypto.SealedObject.getObject(java.security.Key,java.lang.String) throws
     *      java.io.IOException,java.lang.ClassNotFoundException,java.security.NoSuchAlgorithmException,java.security.
     *      NoSuchProviderException,java.security.InvalidKeyException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getObject_Key_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.SealedObject#getObject(java.security.Key) public final java.lang.Object
     * javax.crypto.SealedObject.getObject(java.security.Key) throws
     * java.io.IOException,java.lang.ClassNotFoundException,java.security.NoSuchAlgorithmException,java.security.InvalidKeyException}
     * .
     *
     * <p>
     * Test method for {@link javax.crypto.SealedObject#getObject(java.security.Key) public final java.lang.Object
     * javax.crypto.SealedObject.getObject(java.security.Key) throws
     * java.io.IOException,java.lang.ClassNotFoundException,java.security.NoSuchAlgorithmException,java.security.InvalidKeyException}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.SealedObject#getObject(java.security.Key) public final java.lang.Object
     *      javax.crypto.SealedObject.getObject(java.security.Key) throws
     *      java.io.IOException,java.lang.ClassNotFoundException,java.security.NoSuchAlgorithmException,java.security.
     *      InvalidKeyException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getObject_Key()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

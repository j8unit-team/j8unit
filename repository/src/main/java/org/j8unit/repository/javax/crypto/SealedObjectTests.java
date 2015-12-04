package org.j8unit.repository.javax.crypto;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.crypto.SealedObject class javax.crypto.SealedObject}, containing all instance relevant
 * test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.crypto.SealedObjectClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface SealedObjectTests<SUT extends javax.crypto.SealedObject>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.crypto.SealedObject#getAlgorithm() public final java.lang.String
     * javax.crypto.SealedObject.getAlgorithm()}.
     * </p>
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
     * </p>
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
     * Test method for {@link javax.crypto.SealedObject#getObject(java.security.Key,java.lang.String) public final
     * java.lang.Object javax.crypto.SealedObject.getObject(java.security.Key,java.lang.String) throws
     * java.io.IOException,java.lang.ClassNotFoundException,java.security.NoSuchAlgorithmException,java.security.NoSuchProviderException,java.security.InvalidKeyException}
     * .
     * </p>
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
     * </p>
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

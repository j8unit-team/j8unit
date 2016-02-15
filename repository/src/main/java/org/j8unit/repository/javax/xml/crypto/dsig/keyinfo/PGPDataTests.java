package org.j8unit.repository.javax.xml.crypto.dsig.keyinfo;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.crypto.dsig.keyinfo.PGPData interface
 * javax.xml.crypto.dsig.keyinfo.PGPData}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link PGPDataClassTests}.
 * </p>
 *
 * @see javax.xml.crypto.dsig.keyinfo.PGPData interface javax.xml.crypto.dsig.keyinfo.PGPData (the hereby targeted
 *      class-under-test class)
 * @see PGPDataClassTests PGPDataClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PGPDataTests<SUT extends javax.xml.crypto.dsig.keyinfo.PGPData>
extends org.j8unit.repository.javax.xml.crypto.XMLStructureTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.keyinfo.PGPData#getExternalElements() public abstract java.util.List
     * javax.xml.crypto.dsig.keyinfo.PGPData.getExternalElements()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.keyinfo.PGPData#getExternalElements() public abstract java.util.List
     * javax.xml.crypto.dsig.keyinfo.PGPData.getExternalElements()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.keyinfo.PGPData#getExternalElements() public abstract java.util.List
     *      javax.xml.crypto.dsig.keyinfo.PGPData.getExternalElements() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getExternalElements()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.keyinfo.PGPData#getKeyId() public abstract byte[]
     * javax.xml.crypto.dsig.keyinfo.PGPData.getKeyId()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.keyinfo.PGPData#getKeyId() public abstract byte[]
     * javax.xml.crypto.dsig.keyinfo.PGPData.getKeyId()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.keyinfo.PGPData#getKeyId() public abstract byte[]
     *      javax.xml.crypto.dsig.keyinfo.PGPData.getKeyId() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getKeyId()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.keyinfo.PGPData#getKeyPacket() public abstract byte[]
     * javax.xml.crypto.dsig.keyinfo.PGPData.getKeyPacket()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.keyinfo.PGPData#getKeyPacket() public abstract byte[]
     * javax.xml.crypto.dsig.keyinfo.PGPData.getKeyPacket()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.keyinfo.PGPData#getKeyPacket() public abstract byte[]
     *      javax.xml.crypto.dsig.keyinfo.PGPData.getKeyPacket() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getKeyPacket()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

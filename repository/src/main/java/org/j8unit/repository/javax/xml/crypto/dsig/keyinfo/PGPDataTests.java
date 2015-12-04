package org.j8unit.repository.javax.xml.crypto.dsig.keyinfo;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.crypto.dsig.keyinfo.PGPData interface javax.xml.crypto.dsig.keyinfo.PGPData},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.crypto.dsig.keyinfo.PGPDataClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface PGPDataTests<SUT extends javax.xml.crypto.dsig.keyinfo.PGPData>
extends org.j8unit.repository.javax.xml.crypto.XMLStructureTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.keyinfo.PGPData#getExternalElements() public abstract java.util.List
     * javax.xml.crypto.dsig.keyinfo.PGPData.getExternalElements()}.
     * </p>
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
     * </p>
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
     * </p>
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

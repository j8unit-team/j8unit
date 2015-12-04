package org.j8unit.repository.javax.xml.bind.annotation.adapters;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.bind.annotation.adapters.HexBinaryAdapter class
 * javax.xml.bind.annotation.adapters.HexBinaryAdapter}, containing all instance relevant test methods (i.&thinsp;e.,
 * test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.bind.annotation.adapters.HexBinaryAdapterClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface HexBinaryAdapterTests<SUT extends javax.xml.bind.annotation.adapters.HexBinaryAdapter>
extends org.j8unit.repository.javax.xml.bind.annotation.adapters.XmlAdapterTests<SUT, java.lang.String, byte[]> {

    /**
     * <p>
     * Test method for {@link javax.xml.bind.annotation.adapters.HexBinaryAdapter#marshal(byte[]) public
     * java.lang.String javax.xml.bind.annotation.adapters.HexBinaryAdapter.marshal(byte[])}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_marshal_byteArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.bind.annotation.adapters.HexBinaryAdapter#unmarshal(java.lang.String) public
     * byte[] javax.xml.bind.annotation.adapters.HexBinaryAdapter.unmarshal(java.lang.String)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unmarshal_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

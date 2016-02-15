package org.j8unit.repository.javax.xml.crypto;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.crypto.OctetStreamData class javax.xml.crypto.OctetStreamData}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link OctetStreamDataClassTests}.
 * </p>
 *
 * @see javax.xml.crypto.OctetStreamData class javax.xml.crypto.OctetStreamData (the hereby targeted class-under-test
 *      class)
 * @see OctetStreamDataClassTests OctetStreamDataClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface OctetStreamDataTests<SUT extends javax.xml.crypto.OctetStreamData>
extends DataTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.OctetStreamData#getURI() public java.lang.String
     * javax.xml.crypto.OctetStreamData.getURI()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.OctetStreamData#getURI() public java.lang.String
     * javax.xml.crypto.OctetStreamData.getURI()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.OctetStreamData#getURI() public java.lang.String javax.xml.crypto.OctetStreamData.getURI()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getURI()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.OctetStreamData#getOctetStream() public java.io.InputStream
     * javax.xml.crypto.OctetStreamData.getOctetStream()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.OctetStreamData#getOctetStream() public java.io.InputStream
     * javax.xml.crypto.OctetStreamData.getOctetStream()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.OctetStreamData#getOctetStream() public java.io.InputStream
     *      javax.xml.crypto.OctetStreamData.getOctetStream() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOctetStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.OctetStreamData#getMimeType() public java.lang.String
     * javax.xml.crypto.OctetStreamData.getMimeType()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.OctetStreamData#getMimeType() public java.lang.String
     * javax.xml.crypto.OctetStreamData.getMimeType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.OctetStreamData#getMimeType() public java.lang.String
     *      javax.xml.crypto.OctetStreamData.getMimeType() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMimeType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

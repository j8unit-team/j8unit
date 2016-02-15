package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.crypto.dsig.SignatureProperty interface
 * javax.xml.crypto.dsig.SignatureProperty}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link SignaturePropertyClassTests}.
 * </p>
 *
 * @see javax.xml.crypto.dsig.SignatureProperty interface javax.xml.crypto.dsig.SignatureProperty (the hereby targeted
 *      class-under-test class)
 * @see SignaturePropertyClassTests SignaturePropertyClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SignaturePropertyTests<SUT extends javax.xml.crypto.dsig.SignatureProperty>
extends org.j8unit.repository.javax.xml.crypto.XMLStructureTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.SignatureProperty#getContent() public abstract java.util.List
     * javax.xml.crypto.dsig.SignatureProperty.getContent()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.SignatureProperty#getContent() public abstract java.util.List
     * javax.xml.crypto.dsig.SignatureProperty.getContent()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.SignatureProperty#getContent() public abstract java.util.List
     *      javax.xml.crypto.dsig.SignatureProperty.getContent() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getContent()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.SignatureProperty#getTarget() public abstract java.lang.String
     * javax.xml.crypto.dsig.SignatureProperty.getTarget()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.SignatureProperty#getTarget() public abstract java.lang.String
     * javax.xml.crypto.dsig.SignatureProperty.getTarget()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.SignatureProperty#getTarget() public abstract java.lang.String
     *      javax.xml.crypto.dsig.SignatureProperty.getTarget() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTarget()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.SignatureProperty#getId() public abstract java.lang.String
     * javax.xml.crypto.dsig.SignatureProperty.getId()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.SignatureProperty#getId() public abstract java.lang.String
     * javax.xml.crypto.dsig.SignatureProperty.getId()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.SignatureProperty#getId() public abstract java.lang.String
     *      javax.xml.crypto.dsig.SignatureProperty.getId() (the hereby targeted method-under-test)
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

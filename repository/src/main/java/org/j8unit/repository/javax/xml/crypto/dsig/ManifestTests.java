package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.crypto.dsig.Manifest interface javax.xml.crypto.dsig.Manifest}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link ManifestClassTests}.
 * </p>
 *
 * @see javax.xml.crypto.dsig.Manifest interface javax.xml.crypto.dsig.Manifest (the hereby targeted class-under-test
 *      class)
 * @see ManifestClassTests ManifestClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ManifestTests<SUT extends javax.xml.crypto.dsig.Manifest>
extends org.j8unit.repository.javax.xml.crypto.XMLStructureTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.Manifest#getReferences() public abstract java.util.List
     * javax.xml.crypto.dsig.Manifest.getReferences()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.Manifest#getReferences() public abstract java.util.List
     * javax.xml.crypto.dsig.Manifest.getReferences()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.Manifest#getReferences() public abstract java.util.List
     *      javax.xml.crypto.dsig.Manifest.getReferences() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getReferences()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.Manifest#getId() public abstract java.lang.String
     * javax.xml.crypto.dsig.Manifest.getId()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.Manifest#getId() public abstract java.lang.String
     * javax.xml.crypto.dsig.Manifest.getId()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.Manifest#getId() public abstract java.lang.String
     *      javax.xml.crypto.dsig.Manifest.getId() (the hereby targeted method-under-test)
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

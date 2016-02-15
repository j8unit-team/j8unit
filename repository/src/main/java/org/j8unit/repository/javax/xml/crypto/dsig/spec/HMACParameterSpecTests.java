package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.crypto.dsig.spec.HMACParameterSpec class
 * javax.xml.crypto.dsig.spec.HMACParameterSpec}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link HMACParameterSpecClassTests}.
 * </p>
 *
 * @see javax.xml.crypto.dsig.spec.HMACParameterSpec class javax.xml.crypto.dsig.spec.HMACParameterSpec (the hereby
 *      targeted class-under-test class)
 * @see HMACParameterSpecClassTests HMACParameterSpecClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HMACParameterSpecTests<SUT extends javax.xml.crypto.dsig.spec.HMACParameterSpec>
extends SignatureMethodParameterSpecTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.spec.HMACParameterSpec#getOutputLength() public int
     * javax.xml.crypto.dsig.spec.HMACParameterSpec.getOutputLength()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.spec.HMACParameterSpec#getOutputLength() public int
     * javax.xml.crypto.dsig.spec.HMACParameterSpec.getOutputLength()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.spec.HMACParameterSpec#getOutputLength() public int
     *      javax.xml.crypto.dsig.spec.HMACParameterSpec.getOutputLength() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOutputLength()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

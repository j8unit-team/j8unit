package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.crypto.spec.GCMParameterSpec class
 * javax.crypto.spec.GCMParameterSpec}. The complementary j8unit test interface containing the class relevant aspects is
 * {@link GCMParameterSpecClassTests}.
 * </p>
 *
 * @see javax.crypto.spec.GCMParameterSpec class javax.crypto.spec.GCMParameterSpec (the hereby targeted
 *      class-under-test class)
 * @see GCMParameterSpecClassTests GCMParameterSpecClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface GCMParameterSpecTests<SUT extends javax.crypto.spec.GCMParameterSpec>
extends org.j8unit.repository.java.security.spec.AlgorithmParameterSpecTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.crypto.spec.GCMParameterSpec#getIV() public byte[]
     * javax.crypto.spec.GCMParameterSpec.getIV()}.
     *
     * <p>
     * Test method for {@link javax.crypto.spec.GCMParameterSpec#getIV() public byte[]
     * javax.crypto.spec.GCMParameterSpec.getIV()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.spec.GCMParameterSpec#getIV() public byte[] javax.crypto.spec.GCMParameterSpec.getIV() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getIV()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.crypto.spec.GCMParameterSpec#getTLen() public int
     * javax.crypto.spec.GCMParameterSpec.getTLen()}.
     *
     * <p>
     * Test method for {@link javax.crypto.spec.GCMParameterSpec#getTLen() public int
     * javax.crypto.spec.GCMParameterSpec.getTLen()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.spec.GCMParameterSpec#getTLen() public int javax.crypto.spec.GCMParameterSpec.getTLen() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTLen()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

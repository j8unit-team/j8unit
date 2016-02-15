package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.crypto.spec.DESKeySpec class javax.crypto.spec.DESKeySpec}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link DESKeySpecClassTests}.
 * </p>
 *
 * @see javax.crypto.spec.DESKeySpec class javax.crypto.spec.DESKeySpec (the hereby targeted class-under-test class)
 * @see DESKeySpecClassTests DESKeySpecClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DESKeySpecTests<SUT extends javax.crypto.spec.DESKeySpec>
extends org.j8unit.repository.java.security.spec.KeySpecTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.crypto.spec.DESKeySpec#getKey() public byte[] javax.crypto.spec.DESKeySpec.getKey()}
     * .
     *
     * <p>
     * Test method for {@link javax.crypto.spec.DESKeySpec#getKey() public byte[] javax.crypto.spec.DESKeySpec.getKey()}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.spec.DESKeySpec#getKey() public byte[] javax.crypto.spec.DESKeySpec.getKey() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getKey()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

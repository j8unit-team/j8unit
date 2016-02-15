package org.j8unit.repository.javax.crypto;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.crypto.MacSpi class javax.crypto.MacSpi}. The complementary j8unit
 * test interface containing the class relevant aspects is {@link MacSpiClassTests}.
 * </p>
 *
 * @see javax.crypto.MacSpi class javax.crypto.MacSpi (the hereby targeted class-under-test class)
 * @see MacSpiClassTests MacSpiClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MacSpiTests<SUT extends javax.crypto.MacSpi>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.crypto.MacSpi#clone() public java.lang.Object javax.crypto.MacSpi.clone() throws
     * java.lang.CloneNotSupportedException}.
     *
     * <p>
     * Test method for {@link javax.crypto.MacSpi#clone() public java.lang.Object javax.crypto.MacSpi.clone() throws
     * java.lang.CloneNotSupportedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.MacSpi#clone() public java.lang.Object javax.crypto.MacSpi.clone() throws
     *      java.lang.CloneNotSupportedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_clone()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

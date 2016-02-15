package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.crypto.spec.PSource class javax.crypto.spec.PSource}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link PSourceClassTests}.
 * </p>
 *
 * @see javax.crypto.spec.PSource class javax.crypto.spec.PSource (the hereby targeted class-under-test class)
 * @see PSourceClassTests PSourceClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PSourceTests<SUT extends javax.crypto.spec.PSource>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.crypto.spec.PSource#getAlgorithm() public java.lang.String
     * javax.crypto.spec.PSource.getAlgorithm()}.
     *
     * <p>
     * Test method for {@link javax.crypto.spec.PSource#getAlgorithm() public java.lang.String
     * javax.crypto.spec.PSource.getAlgorithm()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.crypto.spec.PSource#getAlgorithm() public java.lang.String javax.crypto.spec.PSource.getAlgorithm()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getAlgorithm()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.crypto.spec.PSource.PSpecified class
     * javax.crypto.spec.PSource$PSpecified}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link PSourceClassTests.PSpecifiedClassTests}.
     * </p>
     *
     * @see javax.crypto.spec.PSource.PSpecified class javax.crypto.spec.PSource$PSpecified (the hereby targeted
     *      class-under-test class)
     * @see PSourceClassTests.PSpecifiedClassTests PSourceClassTests.PSpecifiedClassTests (the complementary j8unit test
     *      interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PSpecifiedTests<SUT extends javax.crypto.spec.PSource.PSpecified>
    extends PSourceTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.crypto.spec.PSource.PSpecified#getValue() public byte[]
         * javax.crypto.spec.PSource$PSpecified.getValue()}.
         *
         * <p>
         * Test method for {@link javax.crypto.spec.PSource.PSpecified#getValue() public byte[]
         * javax.crypto.spec.PSource$PSpecified.getValue()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.crypto.spec.PSource.PSpecified#getValue() public byte[]
         *      javax.crypto.spec.PSource$PSpecified.getValue() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getValue()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}

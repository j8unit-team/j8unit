package org.j8unit.repository.javax.crypto.spec;

import javax.crypto.spec.PSource;
import javax.crypto.spec.PSource.PSpecified;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.lang.ObjectTests;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link PSource public
 * class javax.crypto.spec.PSource}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.crypto.spec.PSourceClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PSourceTests<SUT extends PSource>
extends ObjectTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.spec.PSource]

    /**
     * <p>
     * Test method for the hereby targeted method-under-test {@link javax.crypto.spec.PSource#getAlgorithm() public
     * java.lang.String javax.crypto.spec.PSource.getAlgorithm()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
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

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.spec.PSource]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.spec.PSource]

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
     * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link PSpecified
     * public static final class javax.crypto.spec.PSource$PSpecified}.
     * </p>
     *
     * <p>
     * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints.
     * For this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects
     * (see {@link org.j8unit.repository.javax.crypto.spec.PSourceClassTests.PSpecifiedClassTests}).
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */

    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PSpecifiedTests<SUT extends PSpecified>
    extends org.j8unit.repository.javax.crypto.spec.PSourceTests<SUT> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.spec.PSource$PSpecified]

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link javax.crypto.spec.PSource.PSpecified#getValue()
         * public byte[] javax.crypto.spec.PSource$PSpecified.getValue()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
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

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.spec.PSource$PSpecified]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.spec.PSource$PSpecified]

    }

}

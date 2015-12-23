package org.j8unit.repository.javax.crypto.spec;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.crypto.spec.PSource class javax.crypto.spec.PSource}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.crypto.spec.PSourceTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.crypto.spec.PSourceClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.crypto.spec.PSource
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PSourceTests<SUT extends javax.crypto.spec.PSource>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain javax.crypto.spec.PSource.PSpecified class
     * javax.crypto.spec.PSource$PSpecified}, containing all instance relevant test methods (i.&thinsp;e., test methods
     * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods
     * is {@link org.j8unit.repository.javax.crypto.spec.PSourceTests.PSpecifiedTests}.
     * </p>
     *
     * @see org.j8unit.repository.javax.crypto.spec.PSourceClassTests.PSpecifiedClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim javax.crypto.spec.PSource.PSpecified
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface PSpecifiedTests<SUT extends javax.crypto.spec.PSource.PSpecified>
    extends org.j8unit.repository.javax.crypto.spec.PSourceTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.crypto.spec.PSource.PSpecified#getValue() public byte[]
         * javax.crypto.spec.PSource$PSpecified.getValue()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim javax.crypto.spec.PSource.PSpecified#getValue()
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

    /**
     * <p>
     * Test method for {@link javax.crypto.spec.PSource#getAlgorithm() public java.lang.String
     * javax.crypto.spec.PSource.getAlgorithm()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.crypto.spec.PSource#getAlgorithm()
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

}

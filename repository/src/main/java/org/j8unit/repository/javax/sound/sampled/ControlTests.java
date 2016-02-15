package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sound.sampled.Control class javax.sound.sampled.Control}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ControlClassTests}.
 * </p>
 *
 * @see javax.sound.sampled.Control class javax.sound.sampled.Control (the hereby targeted class-under-test class)
 * @see ControlClassTests ControlClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ControlTests<SUT extends javax.sound.sampled.Control>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.Control#toString() public java.lang.String
     * javax.sound.sampled.Control.toString()}.
     *
     * <p>
     * Test method for {@link javax.sound.sampled.Control#toString() public java.lang.String
     * javax.sound.sampled.Control.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.Control#toString() public java.lang.String javax.sound.sampled.Control.toString() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.Control#getType() public javax.sound.sampled.Control$Type
     * javax.sound.sampled.Control.getType()}.
     *
     * <p>
     * Test method for {@link javax.sound.sampled.Control#getType() public javax.sound.sampled.Control$Type
     * javax.sound.sampled.Control.getType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.Control#getType() public javax.sound.sampled.Control$Type
     *      javax.sound.sampled.Control.getType() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.sound.sampled.Control.Type class
     * javax.sound.sampled.Control$Type}. The complementary j8unit test interface containing the class relevant aspects
     * is {@link ControlClassTests.TypeClassTests}.
     * </p>
     *
     * @see javax.sound.sampled.Control.Type class javax.sound.sampled.Control$Type (the hereby targeted
     *      class-under-test class)
     * @see ControlClassTests.TypeClassTests ControlClassTests.TypeClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TypeTests<SUT extends javax.sound.sampled.Control.Type>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.sound.sampled.Control.Type#toString() public final java.lang.String
         * javax.sound.sampled.Control$Type.toString()}.
         *
         * <p>
         * Test method for {@link javax.sound.sampled.Control.Type#toString() public final java.lang.String
         * javax.sound.sampled.Control$Type.toString()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.sound.sampled.Control.Type#toString() public final java.lang.String
         *      javax.sound.sampled.Control$Type.toString() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_toString()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.sound.sampled.Control.Type#hashCode() public final int
         * javax.sound.sampled.Control$Type.hashCode()}.
         *
         * <p>
         * Test method for {@link javax.sound.sampled.Control.Type#hashCode() public final int
         * javax.sound.sampled.Control$Type.hashCode()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.sound.sampled.Control.Type#hashCode() public final int javax.sound.sampled.Control$Type.hashCode()
         *      (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_hashCode()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.sound.sampled.Control.Type#equals(Object) public final boolean
         * javax.sound.sampled.Control$Type.equals(java.lang.Object)}.
         *
         * <p>
         * Test method for {@link javax.sound.sampled.Control.Type#equals(Object) public final boolean
         * javax.sound.sampled.Control$Type.equals(java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.sound.sampled.Control.Type#equals(Object) public final boolean
         *      javax.sound.sampled.Control$Type.equals(java.lang.Object) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_equals_Object()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}

package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sound.sampled.Port interface javax.sound.sampled.Port}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link PortClassTests}.
 * </p>
 *
 * @see javax.sound.sampled.Port interface javax.sound.sampled.Port (the hereby targeted class-under-test class)
 * @see PortClassTests PortClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PortTests<SUT extends javax.sound.sampled.Port>
extends LineTests<SUT> {

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.sound.sampled.Port.Info class javax.sound.sampled.Port$Info}.
     * The complementary j8unit test interface containing the class relevant aspects is
     * {@link PortClassTests.InfoClassTests}.
     * </p>
     *
     * @see javax.sound.sampled.Port.Info class javax.sound.sampled.Port$Info (the hereby targeted class-under-test
     *      class)
     * @see PortClassTests.InfoClassTests PortClassTests.InfoClassTests (the complementary j8unit test interface
     *      containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface InfoTests<SUT extends javax.sound.sampled.Port.Info>
    extends LineTests.InfoTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.sound.sampled.Port.Info#isSource() public boolean
         * javax.sound.sampled.Port$Info.isSource()}.
         *
         * <p>
         * Test method for {@link javax.sound.sampled.Port.Info#isSource() public boolean
         * javax.sound.sampled.Port$Info.isSource()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.sound.sampled.Port.Info#isSource() public boolean javax.sound.sampled.Port$Info.isSource() (the
         *      hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_isSource()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.sound.sampled.Port.Info#toString() public final java.lang.String
         * javax.sound.sampled.Port$Info.toString()}.
         *
         * <p>
         * Test method for {@link javax.sound.sampled.Port.Info#toString() public final java.lang.String
         * javax.sound.sampled.Port$Info.toString()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.sound.sampled.Port.Info#toString() public final java.lang.String
         *      javax.sound.sampled.Port$Info.toString() (the hereby targeted method-under-test)
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
         * Test method for {@link javax.sound.sampled.Port.Info#matches(javax.sound.sampled.Line.Info) public boolean
         * javax.sound.sampled.Port$Info.matches(javax.sound.sampled.Line$Info)}.
         *
         * <p>
         * Test method for {@link javax.sound.sampled.Port.Info#matches(javax.sound.sampled.Line.Info) public boolean
         * javax.sound.sampled.Port$Info.matches(javax.sound.sampled.Line$Info)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.sound.sampled.Port.Info#matches(javax.sound.sampled.Line.Info) public boolean
         *      javax.sound.sampled.Port$Info.matches(javax.sound.sampled.Line$Info) (the hereby targeted
         *      method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_matches_Info()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.sound.sampled.Port.Info#getName() public java.lang.String
         * javax.sound.sampled.Port$Info.getName()}.
         *
         * <p>
         * Test method for {@link javax.sound.sampled.Port.Info#getName() public java.lang.String
         * javax.sound.sampled.Port$Info.getName()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.sound.sampled.Port.Info#getName() public java.lang.String javax.sound.sampled.Port$Info.getName()
         *      (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_getName()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link javax.sound.sampled.Port.Info#hashCode() public final int
         * javax.sound.sampled.Port$Info.hashCode()}.
         *
         * <p>
         * Test method for {@link javax.sound.sampled.Port.Info#hashCode() public final int
         * javax.sound.sampled.Port$Info.hashCode()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.sound.sampled.Port.Info#hashCode() public final int javax.sound.sampled.Port$Info.hashCode() (the
         *      hereby targeted method-under-test)
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
         * Test method for {@link javax.sound.sampled.Port.Info#equals(Object) public final boolean
         * javax.sound.sampled.Port$Info.equals(java.lang.Object)}.
         *
         * <p>
         * Test method for {@link javax.sound.sampled.Port.Info#equals(Object) public final boolean
         * javax.sound.sampled.Port$Info.equals(java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.sound.sampled.Port.Info#equals(Object) public final boolean
         *      javax.sound.sampled.Port$Info.equals(java.lang.Object) (the hereby targeted method-under-test)
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

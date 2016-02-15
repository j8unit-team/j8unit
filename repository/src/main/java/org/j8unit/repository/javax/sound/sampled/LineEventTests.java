package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sound.sampled.LineEvent class javax.sound.sampled.LineEvent}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link LineEventClassTests}.
 * </p>
 *
 * @see javax.sound.sampled.LineEvent class javax.sound.sampled.LineEvent (the hereby targeted class-under-test class)
 * @see LineEventClassTests LineEventClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LineEventTests<SUT extends javax.sound.sampled.LineEvent>
extends org.j8unit.repository.java.util.EventObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.LineEvent#getType() public final javax.sound.sampled.LineEvent$Type
     * javax.sound.sampled.LineEvent.getType()}.
     *
     * <p>
     * Test method for {@link javax.sound.sampled.LineEvent#getType() public final javax.sound.sampled.LineEvent$Type
     * javax.sound.sampled.LineEvent.getType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.LineEvent#getType() public final javax.sound.sampled.LineEvent$Type
     *      javax.sound.sampled.LineEvent.getType() (the hereby targeted method-under-test)
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
     * Test method for {@link javax.sound.sampled.LineEvent#toString() public java.lang.String
     * javax.sound.sampled.LineEvent.toString()}.
     *
     * <p>
     * Test method for {@link javax.sound.sampled.LineEvent#toString() public java.lang.String
     * javax.sound.sampled.LineEvent.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.LineEvent#toString() public java.lang.String javax.sound.sampled.LineEvent.toString()
     *      (the hereby targeted method-under-test)
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
     * Test method for {@link javax.sound.sampled.LineEvent#getLine() public final javax.sound.sampled.Line
     * javax.sound.sampled.LineEvent.getLine()}.
     *
     * <p>
     * Test method for {@link javax.sound.sampled.LineEvent#getLine() public final javax.sound.sampled.Line
     * javax.sound.sampled.LineEvent.getLine()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.LineEvent#getLine() public final javax.sound.sampled.Line
     *      javax.sound.sampled.LineEvent.getLine() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLine()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.sampled.LineEvent#getFramePosition() public final long
     * javax.sound.sampled.LineEvent.getFramePosition()}.
     *
     * <p>
     * Test method for {@link javax.sound.sampled.LineEvent#getFramePosition() public final long
     * javax.sound.sampled.LineEvent.getFramePosition()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.sampled.LineEvent#getFramePosition() public final long
     *      javax.sound.sampled.LineEvent.getFramePosition() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFramePosition()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.sound.sampled.LineEvent.Type class
     * javax.sound.sampled.LineEvent$Type}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link LineEventClassTests.TypeClassTests}.
     * </p>
     *
     * @see javax.sound.sampled.LineEvent.Type class javax.sound.sampled.LineEvent$Type (the hereby targeted
     *      class-under-test class)
     * @see LineEventClassTests.TypeClassTests LineEventClassTests.TypeClassTests (the complementary j8unit test
     *      interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface TypeTests<SUT extends javax.sound.sampled.LineEvent.Type>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.sound.sampled.LineEvent.Type#equals(Object) public final boolean
         * javax.sound.sampled.LineEvent$Type.equals(java.lang.Object)}.
         *
         * <p>
         * Test method for {@link javax.sound.sampled.LineEvent.Type#equals(Object) public final boolean
         * javax.sound.sampled.LineEvent$Type.equals(java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.sound.sampled.LineEvent.Type#equals(Object) public final boolean
         *      javax.sound.sampled.LineEvent$Type.equals(java.lang.Object) (the hereby targeted method-under-test)
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

        /**
         * <p>
         * Test method for {@link javax.sound.sampled.LineEvent.Type#hashCode() public final int
         * javax.sound.sampled.LineEvent$Type.hashCode()}.
         *
         * <p>
         * Test method for {@link javax.sound.sampled.LineEvent.Type#hashCode() public final int
         * javax.sound.sampled.LineEvent$Type.hashCode()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.sound.sampled.LineEvent.Type#hashCode() public final int
         *      javax.sound.sampled.LineEvent$Type.hashCode() (the hereby targeted method-under-test)
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
         * Test method for {@link javax.sound.sampled.LineEvent.Type#toString() public java.lang.String
         * javax.sound.sampled.LineEvent$Type.toString()}.
         *
         * <p>
         * Test method for {@link javax.sound.sampled.LineEvent.Type#toString() public java.lang.String
         * javax.sound.sampled.LineEvent$Type.toString()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.sound.sampled.LineEvent.Type#toString() public java.lang.String
         *      javax.sound.sampled.LineEvent$Type.toString() (the hereby targeted method-under-test)
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

    }

}

package org.j8unit.repository.java.nio.file;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.file.WatchEvent interface java.nio.file.WatchEvent}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link WatchEventClassTests}.
 * </p>
 *
 * @see java.nio.file.WatchEvent interface java.nio.file.WatchEvent (the hereby targeted class-under-test class)
 * @see WatchEventClassTests WatchEventClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WatchEventTests<SUT extends java.nio.file.WatchEvent<T>, T>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.file.WatchEvent#kind() public abstract
     * java.nio.file.WatchEvent.java.nio.file.WatchEvent$Kind<T> java.nio.file.WatchEvent.kind()}.
     *
     * <p>
     * Test method for {@link java.nio.file.WatchEvent#kind() public abstract java.nio.file.WatchEvent$Kind
     * java.nio.file.WatchEvent.kind()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.WatchEvent#kind() public abstract java.nio.file.WatchEvent$Kind
     *      java.nio.file.WatchEvent.kind() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_kind()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.WatchEvent#context() public abstract T java.nio.file.WatchEvent.context()}.
     *
     * <p>
     * Test method for {@link java.nio.file.WatchEvent#context() public abstract java.lang.Object
     * java.nio.file.WatchEvent.context()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.WatchEvent#context() public abstract java.lang.Object java.nio.file.WatchEvent.context() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_context()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.WatchEvent#count() public abstract int java.nio.file.WatchEvent.count()}.
     *
     * <p>
     * Test method for {@link java.nio.file.WatchEvent#count() public abstract int java.nio.file.WatchEvent.count()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.WatchEvent#count() public abstract int java.nio.file.WatchEvent.count() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_count()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.nio.file.WatchEvent.Modifier interface
     * java.nio.file.WatchEvent$Modifier}. The complementary j8unit test interface containing the class relevant aspects
     * is {@link WatchEventClassTests.ModifierClassTests}.
     * </p>
     *
     * @see java.nio.file.WatchEvent.Modifier interface java.nio.file.WatchEvent$Modifier (the hereby targeted
     *      class-under-test class)
     * @see WatchEventClassTests.ModifierClassTests WatchEventClassTests.ModifierClassTests (the complementary j8unit
     *      test interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface ModifierTests<SUT extends java.nio.file.WatchEvent.Modifier>
    extends RepositoryTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.nio.file.WatchEvent.Modifier#name() public abstract java.lang.String
         * java.nio.file.WatchEvent$Modifier.name()}.
         *
         * <p>
         * Test method for {@link java.nio.file.WatchEvent.Modifier#name() public abstract java.lang.String
         * java.nio.file.WatchEvent$Modifier.name()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.nio.file.WatchEvent.Modifier#name() public abstract java.lang.String
         *      java.nio.file.WatchEvent$Modifier.name() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_name()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain java.nio.file.WatchEvent.Kind interface java.nio.file.WatchEvent$Kind}
     * . The complementary j8unit test interface containing the class relevant aspects is
     * {@link WatchEventClassTests.KindClassTests}.
     * </p>
     *
     * @see java.nio.file.WatchEvent.Kind interface java.nio.file.WatchEvent$Kind (the hereby targeted class-under-test
     *      class)
     * @see WatchEventClassTests.KindClassTests WatchEventClassTests.KindClassTests (the complementary j8unit test
     *      interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface KindTests<SUT extends java.nio.file.WatchEvent.Kind<T>, T>
    extends RepositoryTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.nio.file.WatchEvent.Kind#type() public abstract java.lang.Class
         * <T> java.nio.file.WatchEvent$Kind.type()}.
         *
         * <p>
         * Test method for {@link java.nio.file.WatchEvent.Kind#type() public abstract java.lang.Class
         * java.nio.file.WatchEvent$Kind.type()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.nio.file.WatchEvent.Kind#type() public abstract java.lang.Class
         *      java.nio.file.WatchEvent$Kind.type() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_type()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.nio.file.WatchEvent.Kind#name() public abstract java.lang.String
         * java.nio.file.WatchEvent$Kind.name()}.
         *
         * <p>
         * Test method for {@link java.nio.file.WatchEvent.Kind#name() public abstract java.lang.String
         * java.nio.file.WatchEvent$Kind.name()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see java.nio.file.WatchEvent.Kind#name() public abstract java.lang.String
         *      java.nio.file.WatchEvent$Kind.name() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_name()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}

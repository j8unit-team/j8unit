package org.j8unit.repository.java.nio.file;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.nio.file.WatchEvent interface java.nio.file.WatchEvent},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.nio.file.WatchEventTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.nio.file.WatchEventClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.nio.file.WatchEvent
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WatchEventTests<SUT extends java.nio.file.WatchEvent<T>, T>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.nio.file.WatchEvent.Kind interface
     * java.nio.file.WatchEvent$Kind}, containing all instance relevant test methods (i.&thinsp;e., test methods of non-
     * {@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
     * {@link org.j8unit.repository.java.nio.file.WatchEventTests.KindTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.nio.file.WatchEventClassTests.KindClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.nio.file.WatchEvent.Kind
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface KindTests<SUT extends java.nio.file.WatchEvent.Kind<T>, T>
    extends RepositoryTests<SUT> {

        /**
         * <p>
         * Test method for {@link java.nio.file.WatchEvent.Kind#name() public abstract java.lang.String
         * java.nio.file.WatchEvent$Kind.name()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.nio.file.WatchEvent.Kind#name()
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

        /**
         * <p>
         * Test method for {@link java.nio.file.WatchEvent.Kind#type() public abstract java.lang.Class
         * java.nio.file.WatchEvent$Kind.type()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.nio.file.WatchEvent.Kind#type()
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

    }

    /**
     * <p>
     * Reusable J8Unit test interface for {@linkplain java.nio.file.WatchEvent.Modifier interface
     * java.nio.file.WatchEvent$Modifier}, containing all instance relevant test methods (i.&thinsp;e., test methods of
     * non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
     * {@link org.j8unit.repository.java.nio.file.WatchEventTests.ModifierTests}.
     * </p>
     *
     * @see org.j8unit.repository.java.nio.file.WatchEventClassTests.ModifierClassTests
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     *
     * @j8unit.aim java.nio.file.WatchEvent.Modifier
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
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @j8unit.aim java.nio.file.WatchEvent.Modifier#name()
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
     * Test method for {@link java.nio.file.WatchEvent#context() public abstract java.lang.Object
     * java.nio.file.WatchEvent.context()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.nio.file.WatchEvent#context()
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
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.nio.file.WatchEvent#count()
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
     * Test method for {@link java.nio.file.WatchEvent#kind() public abstract java.nio.file.WatchEvent$Kind
     * java.nio.file.WatchEvent.kind()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim java.nio.file.WatchEvent#kind()
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

}

package org.j8unit.repository.java.nio.file;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.nio.file.WatchEvent interface java.nio.file.WatchEvent},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.file.WatchEventClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface WatchEventTests<SUT extends java.nio.file.WatchEvent<T>, T>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link java.nio.file.WatchEvent#kind() public abstract java.nio.file.WatchEvent$Kind java.nio.file.WatchEvent.kind()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_kind() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.WatchEvent#context() public abstract java.lang.Object java.nio.file.WatchEvent.context()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_context() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.WatchEvent#count() public abstract int java.nio.file.WatchEvent.count()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_count() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test class for {@link java.nio.file.WatchEvent$Kind interface java.nio.file.WatchEvent$Kind},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.nio.file.WatchEventClassTests.KindClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface KindTests<SUT extends java.nio.file.WatchEvent.Kind<T>, T>
    extends J8UnitTest<SUT>
    {

        /**
         * <p>
         * Test method for {@link java.nio.file.WatchEvent.Kind#type() public abstract java.lang.Class java.nio.file.WatchEvent$Kind.type()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_type() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

        /**
         * <p>
         * Test method for {@link java.nio.file.WatchEvent.Kind#name() public abstract java.lang.String java.nio.file.WatchEvent$Kind.name()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_name() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

    /**
     * <p>
     * Test class for {@link java.nio.file.WatchEvent$Modifier interface java.nio.file.WatchEvent$Modifier},
     * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
     * </p>
     *
     * @param SUT the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.java.nio.file.WatchEventClassTests.ModifierClassTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface ModifierTests<SUT extends java.nio.file.WatchEvent.Modifier>
    extends J8UnitTest<SUT>
    {

        /**
         * <p>
         * Test method for {@link java.nio.file.WatchEvent.Modifier#name() public abstract java.lang.String java.nio.file.WatchEvent$Modifier.name()}.
         * </p>
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public default void test_name() throws Exception {
            // query fresh subject-under-test
            SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}

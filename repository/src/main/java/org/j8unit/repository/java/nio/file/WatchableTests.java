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
 * non-{@code static} methods) of {@linkplain java.nio.file.Watchable interface java.nio.file.Watchable}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link WatchableClassTests}.
 * </p>
 *
 * @see java.nio.file.Watchable interface java.nio.file.Watchable (the hereby targeted class-under-test class)
 * @see WatchableClassTests WatchableClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WatchableTests<SUT extends java.nio.file.Watchable>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.Watchable#register(java.nio.file.WatchService, java.nio.file.WatchEvent.Kind[], java.nio.file.WatchEvent.Modifier...)
     * public abstract java.nio.file.WatchKey
     * java.nio.file.Watchable.register(java.nio.file.WatchService,java.nio.file.WatchEvent.java.nio.file.WatchEvent$Kind
     * <?>[],java.nio.file.WatchEvent$Modifier...) throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link java.nio.file.Watchable#register(java.nio.file.WatchService, java.nio.file.WatchEvent.Kind[], java.nio.file.WatchEvent.Modifier...)
     * public abstract java.nio.file.WatchKey
     * java.nio.file.Watchable.register(java.nio.file.WatchService,java.nio.file.WatchEvent$Kind[],java.nio.file.WatchEvent$Modifier...)
     * throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.Watchable#register(java.nio.file.WatchService, java.nio.file.WatchEvent.Kind[],
     *      java.nio.file.WatchEvent.Modifier...) public abstract java.nio.file.WatchKey
     *      java.nio.file.Watchable.register(java.nio.file.WatchService,java.nio.file.WatchEvent$Kind[],java.nio.file.
     *      WatchEvent$Modifier[]) throws java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_register_WatchService_KindArray_ModifierArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.Watchable#register(java.nio.file.WatchService, java.nio.file.WatchEvent.Kind...) public
     * abstract java.nio.file.WatchKey
     * java.nio.file.Watchable.register(java.nio.file.WatchService,java.nio.file.WatchEvent.java.nio.file.WatchEvent$Kind
     * <?>...) throws java.io.IOException}.
     *
     * <p>
     * Test method for
     * {@link java.nio.file.Watchable#register(java.nio.file.WatchService, java.nio.file.WatchEvent.Kind...) public
     * abstract java.nio.file.WatchKey
     * java.nio.file.Watchable.register(java.nio.file.WatchService,java.nio.file.WatchEvent$Kind...) throws
     * java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.Watchable#register(java.nio.file.WatchService, java.nio.file.WatchEvent.Kind...) public
     *      abstract java.nio.file.WatchKey
     *      java.nio.file.Watchable.register(java.nio.file.WatchService,java.nio.file.WatchEvent$Kind[]) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_register_WatchService_KindArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

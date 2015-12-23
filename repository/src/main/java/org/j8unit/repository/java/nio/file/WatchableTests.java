package org.j8unit.repository.java.nio.file;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.nio.file.Watchable interface java.nio.file.Watchable}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.nio.file.WatchableTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.nio.file.WatchableClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.nio.file.Watchable
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface WatchableTests<SUT extends java.nio.file.Watchable>
extends RepositoryTests<SUT> {

    /**
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
     * @j8unit.aim java.nio.file.Watchable#register(java.nio.file.WatchService, java.nio.file.WatchEvent.Kind...)
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

    /**
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
     * @j8unit.aim java.nio.file.Watchable#register(java.nio.file.WatchService, java.nio.file.WatchEvent.Kind[],
     *             java.nio.file.WatchEvent.Modifier...)
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

}

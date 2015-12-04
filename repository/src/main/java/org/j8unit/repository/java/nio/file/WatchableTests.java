package org.j8unit.repository.java.nio.file;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.nio.file.Watchable interface java.nio.file.Watchable}, containing all instance relevant
 * test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.file.WatchableClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface WatchableTests<SUT extends java.nio.file.Watchable>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for
     * {@link java.nio.file.Watchable#register(java.nio.file.WatchService,java.nio.file.WatchEvent.Kind...) public
     * abstract java.nio.file.WatchKey
     * java.nio.file.Watchable.register(java.nio.file.WatchService,java.nio.file.WatchEvent$Kind...) throws
     * java.io.IOException}.
     * </p>
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
     * {@link java.nio.file.Watchable#register(java.nio.file.WatchService,java.nio.file.WatchEvent.Kind[],java.nio.file.WatchEvent.Modifier...)
     * public abstract java.nio.file.WatchKey
     * java.nio.file.Watchable.register(java.nio.file.WatchService,java.nio.file.WatchEvent$Kind[],java.nio.file.WatchEvent$Modifier...)
     * throws java.io.IOException}.
     * </p>
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

package org.j8unit.repository.java.nio;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.MappedByteBuffer class java.nio.MappedByteBuffer}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link MappedByteBufferClassTests}.
 * </p>
 *
 * @see java.nio.MappedByteBuffer class java.nio.MappedByteBuffer (the hereby targeted class-under-test class)
 * @see MappedByteBufferClassTests MappedByteBufferClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MappedByteBufferTests<SUT extends java.nio.MappedByteBuffer>
extends ByteBufferTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.MappedByteBuffer#isLoaded() public final boolean
     * java.nio.MappedByteBuffer.isLoaded()}.
     *
     * <p>
     * Test method for {@link java.nio.MappedByteBuffer#isLoaded() public final boolean
     * java.nio.MappedByteBuffer.isLoaded()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.MappedByteBuffer#isLoaded() public final boolean java.nio.MappedByteBuffer.isLoaded() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isLoaded()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.MappedByteBuffer#force() public final java.nio.MappedByteBuffer
     * java.nio.MappedByteBuffer.force()}.
     *
     * <p>
     * Test method for {@link java.nio.MappedByteBuffer#force() public final java.nio.MappedByteBuffer
     * java.nio.MappedByteBuffer.force()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.MappedByteBuffer#force() public final java.nio.MappedByteBuffer java.nio.MappedByteBuffer.force()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_force()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.MappedByteBuffer#load() public final java.nio.MappedByteBuffer
     * java.nio.MappedByteBuffer.load()}.
     *
     * <p>
     * Test method for {@link java.nio.MappedByteBuffer#load() public final java.nio.MappedByteBuffer
     * java.nio.MappedByteBuffer.load()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.MappedByteBuffer#load() public final java.nio.MappedByteBuffer java.nio.MappedByteBuffer.load()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_load()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

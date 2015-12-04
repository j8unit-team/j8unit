package org.j8unit.repository.java.nio;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.nio.MappedByteBuffer class java.nio.MappedByteBuffer},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.MappedByteBufferClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface MappedByteBufferTests<SUT extends java.nio.MappedByteBuffer>
extends org.j8unit.repository.java.nio.ByteBufferTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.nio.MappedByteBuffer#isLoaded() public final boolean java.nio.MappedByteBuffer.isLoaded()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isLoaded() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.MappedByteBuffer#force() public final java.nio.MappedByteBuffer java.nio.MappedByteBuffer.force()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_force() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.MappedByteBuffer#load() public final java.nio.MappedByteBuffer java.nio.MappedByteBuffer.load()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_load() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

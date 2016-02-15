package org.j8unit.repository.java.io;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.io.FileDescriptor class java.io.FileDescriptor}. The complementary
 * j8unit test interface containing the class relevant aspects is {@link FileDescriptorClassTests}.
 * </p>
 *
 * @see java.io.FileDescriptor class java.io.FileDescriptor (the hereby targeted class-under-test class)
 * @see FileDescriptorClassTests FileDescriptorClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FileDescriptorTests<SUT extends java.io.FileDescriptor>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.io.FileDescriptor#valid() public boolean java.io.FileDescriptor.valid()}.
     *
     * <p>
     * Test method for {@link java.io.FileDescriptor#valid() public boolean java.io.FileDescriptor.valid()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.FileDescriptor#valid() public boolean java.io.FileDescriptor.valid() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_valid()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.FileDescriptor#sync() public native void java.io.FileDescriptor.sync() throws
     * java.io.SyncFailedException}.
     *
     * <p>
     * Test method for {@link java.io.FileDescriptor#sync() public native void java.io.FileDescriptor.sync() throws
     * java.io.SyncFailedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.FileDescriptor#sync() public native void java.io.FileDescriptor.sync() throws
     *      java.io.SyncFailedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_sync()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

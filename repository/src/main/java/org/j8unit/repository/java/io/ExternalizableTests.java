package org.j8unit.repository.java.io;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.io.Externalizable interface java.io.Externalizable}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ExternalizableClassTests}.
 * </p>
 *
 * @see java.io.Externalizable interface java.io.Externalizable (the hereby targeted class-under-test class)
 * @see ExternalizableClassTests ExternalizableClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ExternalizableTests<SUT extends java.io.Externalizable>
extends SerializableTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.io.Externalizable#writeExternal(java.io.ObjectOutput) public abstract void
     * java.io.Externalizable.writeExternal(java.io.ObjectOutput) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link java.io.Externalizable#writeExternal(java.io.ObjectOutput) public abstract void
     * java.io.Externalizable.writeExternal(java.io.ObjectOutput) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.Externalizable#writeExternal(java.io.ObjectOutput) public abstract void
     *      java.io.Externalizable.writeExternal(java.io.ObjectOutput) throws java.io.IOException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_writeExternal_ObjectOutput()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.Externalizable#readExternal(java.io.ObjectInput) public abstract void
     * java.io.Externalizable.readExternal(java.io.ObjectInput) throws
     * java.io.IOException,java.lang.ClassNotFoundException}.
     *
     * <p>
     * Test method for {@link java.io.Externalizable#readExternal(java.io.ObjectInput) public abstract void
     * java.io.Externalizable.readExternal(java.io.ObjectInput) throws
     * java.io.IOException,java.lang.ClassNotFoundException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.io.Externalizable#readExternal(java.io.ObjectInput) public abstract void
     *      java.io.Externalizable.readExternal(java.io.ObjectInput) throws
     *      java.io.IOException,java.lang.ClassNotFoundException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_readExternal_ObjectInput()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

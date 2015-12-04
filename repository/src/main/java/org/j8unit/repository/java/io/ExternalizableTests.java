package org.j8unit.repository.java.io;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link java.io.Externalizable interface java.io.Externalizable},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.io.ExternalizableClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface ExternalizableTests<SUT extends java.io.Externalizable>
extends org.j8unit.repository.java.io.SerializableTests<SUT>
{

    /**
     * <p>
     * Test method for {@link java.io.Externalizable#writeExternal(java.io.ObjectOutput) public abstract void java.io.Externalizable.writeExternal(java.io.ObjectOutput) throws java.io.IOException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_writeExternal_ObjectOutput() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.io.Externalizable#readExternal(java.io.ObjectInput) public abstract void java.io.Externalizable.readExternal(java.io.ObjectInput) throws java.io.IOException,java.lang.ClassNotFoundException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_readExternal_ObjectInput() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

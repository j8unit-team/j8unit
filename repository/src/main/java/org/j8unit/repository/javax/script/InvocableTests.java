package org.j8unit.repository.javax.script;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.script.Invocable interface javax.script.Invocable},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.script.InvocableClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface InvocableTests<SUT extends javax.script.Invocable>
extends J8UnitTest<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.script.Invocable#getInterface(java.lang.Object,java.lang.Class) public abstract java.lang.Object javax.script.Invocable.getInterface(java.lang.Object,java.lang.Class)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInterface_Object_Class() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.script.Invocable#getInterface(java.lang.Class) public abstract java.lang.Object javax.script.Invocable.getInterface(java.lang.Class)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInterface_Class() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.script.Invocable#invokeMethod(java.lang.Object,java.lang.String,java.lang.Object...) public abstract java.lang.Object javax.script.Invocable.invokeMethod(java.lang.Object,java.lang.String,java.lang.Object...) throws javax.script.ScriptException,java.lang.NoSuchMethodException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_invokeMethod_Object_String_ObjectArray() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.script.Invocable#invokeFunction(java.lang.String,java.lang.Object...) public abstract java.lang.Object javax.script.Invocable.invokeFunction(java.lang.String,java.lang.Object...) throws javax.script.ScriptException,java.lang.NoSuchMethodException}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_invokeFunction_String_ObjectArray() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

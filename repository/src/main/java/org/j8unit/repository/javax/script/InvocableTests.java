package org.j8unit.repository.javax.script;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.script.Invocable interface javax.script.Invocable}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.script.InvocableTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.script.InvocableClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.script.Invocable
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvocableTests<SUT extends javax.script.Invocable>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.script.Invocable#getInterface(java.lang.Class) public abstract java.lang.Object
     * javax.script.Invocable.getInterface(java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.script.Invocable#getInterface(java.lang.Class)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInterface_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.script.Invocable#getInterface(java.lang.Object, java.lang.Class) public abstract
     * java.lang.Object javax.script.Invocable.getInterface(java.lang.Object,java.lang.Class)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.script.Invocable#getInterface(java.lang.Object, java.lang.Class)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getInterface_Object_Class()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.script.Invocable#invokeFunction(java.lang.String, java.lang.Object...) public
     * abstract java.lang.Object javax.script.Invocable.invokeFunction(java.lang.String,java.lang.Object...) throws
     * javax.script.ScriptException,java.lang.NoSuchMethodException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.script.Invocable#invokeFunction(java.lang.String, java.lang.Object...)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_invokeFunction_String_ObjectArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.script.Invocable#invokeMethod(java.lang.Object, java.lang.String, java.lang.Object...) public
     * abstract java.lang.Object
     * javax.script.Invocable.invokeMethod(java.lang.Object,java.lang.String,java.lang.Object...) throws
     * javax.script.ScriptException,java.lang.NoSuchMethodException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @j8unit.aim javax.script.Invocable#invokeMethod(java.lang.Object, java.lang.String, java.lang.Object...)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_invokeMethod_Object_String_ObjectArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

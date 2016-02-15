package org.j8unit.repository.javax.script;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.script.AbstractScriptEngine class javax.script.AbstractScriptEngine}
 * . The complementary j8unit test interface containing the class relevant aspects is
 * {@link AbstractScriptEngineClassTests}.
 * </p>
 *
 * @see javax.script.AbstractScriptEngine class javax.script.AbstractScriptEngine (the hereby targeted class-under-test
 *      class)
 * @see AbstractScriptEngineClassTests AbstractScriptEngineClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface AbstractScriptEngineTests<SUT extends javax.script.AbstractScriptEngine>
extends ScriptEngineTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.script.AbstractScriptEngine#get(String) public java.lang.Object
     * javax.script.AbstractScriptEngine.get(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.script.AbstractScriptEngine#get(String) public java.lang.Object
     * javax.script.AbstractScriptEngine.get(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.AbstractScriptEngine#get(String) public java.lang.Object
     *      javax.script.AbstractScriptEngine.get(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_get_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.script.AbstractScriptEngine#getBindings(int) public javax.script.Bindings
     * javax.script.AbstractScriptEngine.getBindings(int)}.
     *
     * <p>
     * Test method for {@link javax.script.AbstractScriptEngine#getBindings(int) public javax.script.Bindings
     * javax.script.AbstractScriptEngine.getBindings(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.AbstractScriptEngine#getBindings(int) public javax.script.Bindings
     *      javax.script.AbstractScriptEngine.getBindings(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getBindings_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.script.AbstractScriptEngine#eval(String, javax.script.Bindings) public
     * java.lang.Object javax.script.AbstractScriptEngine.eval(java.lang.String,javax.script.Bindings) throws
     * javax.script.ScriptException}.
     *
     * <p>
     * Test method for {@link javax.script.AbstractScriptEngine#eval(String, javax.script.Bindings) public
     * java.lang.Object javax.script.AbstractScriptEngine.eval(java.lang.String,javax.script.Bindings) throws
     * javax.script.ScriptException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.AbstractScriptEngine#eval(String, javax.script.Bindings) public java.lang.Object
     *      javax.script.AbstractScriptEngine.eval(java.lang.String,javax.script.Bindings) throws
     *      javax.script.ScriptException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_eval_String_Bindings()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.script.AbstractScriptEngine#eval(java.io.Reader) public java.lang.Object
     * javax.script.AbstractScriptEngine.eval(java.io.Reader) throws javax.script.ScriptException}.
     *
     * <p>
     * Test method for {@link javax.script.AbstractScriptEngine#eval(java.io.Reader) public java.lang.Object
     * javax.script.AbstractScriptEngine.eval(java.io.Reader) throws javax.script.ScriptException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.AbstractScriptEngine#eval(java.io.Reader) public java.lang.Object
     *      javax.script.AbstractScriptEngine.eval(java.io.Reader) throws javax.script.ScriptException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_eval_Reader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.script.AbstractScriptEngine#eval(java.io.Reader, javax.script.Bindings) public
     * java.lang.Object javax.script.AbstractScriptEngine.eval(java.io.Reader,javax.script.Bindings) throws
     * javax.script.ScriptException}.
     *
     * <p>
     * Test method for {@link javax.script.AbstractScriptEngine#eval(java.io.Reader, javax.script.Bindings) public
     * java.lang.Object javax.script.AbstractScriptEngine.eval(java.io.Reader,javax.script.Bindings) throws
     * javax.script.ScriptException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.AbstractScriptEngine#eval(java.io.Reader, javax.script.Bindings) public java.lang.Object
     *      javax.script.AbstractScriptEngine.eval(java.io.Reader,javax.script.Bindings) throws
     *      javax.script.ScriptException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_eval_Reader_Bindings()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.script.AbstractScriptEngine#eval(String) public java.lang.Object
     * javax.script.AbstractScriptEngine.eval(java.lang.String) throws javax.script.ScriptException}.
     *
     * <p>
     * Test method for {@link javax.script.AbstractScriptEngine#eval(String) public java.lang.Object
     * javax.script.AbstractScriptEngine.eval(java.lang.String) throws javax.script.ScriptException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.AbstractScriptEngine#eval(String) public java.lang.Object
     *      javax.script.AbstractScriptEngine.eval(java.lang.String) throws javax.script.ScriptException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_eval_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.script.AbstractScriptEngine#put(String, Object) public void
     * javax.script.AbstractScriptEngine.put(java.lang.String,java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.script.AbstractScriptEngine#put(String, Object) public void
     * javax.script.AbstractScriptEngine.put(java.lang.String,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.AbstractScriptEngine#put(String, Object) public void
     *      javax.script.AbstractScriptEngine.put(java.lang.String,java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_put_String_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.script.AbstractScriptEngine#getContext() public javax.script.ScriptContext
     * javax.script.AbstractScriptEngine.getContext()}.
     *
     * <p>
     * Test method for {@link javax.script.AbstractScriptEngine#getContext() public javax.script.ScriptContext
     * javax.script.AbstractScriptEngine.getContext()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.AbstractScriptEngine#getContext() public javax.script.ScriptContext
     *      javax.script.AbstractScriptEngine.getContext() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.script.AbstractScriptEngine#setBindings(javax.script.Bindings, int) public void
     * javax.script.AbstractScriptEngine.setBindings(javax.script.Bindings,int)}.
     *
     * <p>
     * Test method for {@link javax.script.AbstractScriptEngine#setBindings(javax.script.Bindings, int) public void
     * javax.script.AbstractScriptEngine.setBindings(javax.script.Bindings,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.AbstractScriptEngine#setBindings(javax.script.Bindings, int) public void
     *      javax.script.AbstractScriptEngine.setBindings(javax.script.Bindings,int) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setBindings_Bindings_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.script.AbstractScriptEngine#setContext(javax.script.ScriptContext) public void
     * javax.script.AbstractScriptEngine.setContext(javax.script.ScriptContext)}.
     *
     * <p>
     * Test method for {@link javax.script.AbstractScriptEngine#setContext(javax.script.ScriptContext) public void
     * javax.script.AbstractScriptEngine.setContext(javax.script.ScriptContext)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.AbstractScriptEngine#setContext(javax.script.ScriptContext) public void
     *      javax.script.AbstractScriptEngine.setContext(javax.script.ScriptContext) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_setContext_ScriptContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

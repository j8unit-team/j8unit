package org.j8unit.repository.javax.script;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.script.ScriptEngine interface javax.script.ScriptEngine}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ScriptEngineClassTests}.
 * </p>
 *
 * @see javax.script.ScriptEngine interface javax.script.ScriptEngine (the hereby targeted class-under-test class)
 * @see ScriptEngineClassTests ScriptEngineClassTests (the complementary j8unit test interface containing the class
 *      relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ScriptEngineTests<SUT extends javax.script.ScriptEngine>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.script.ScriptEngine#setContext(javax.script.ScriptContext) public abstract void
     * javax.script.ScriptEngine.setContext(javax.script.ScriptContext)}.
     *
     * <p>
     * Test method for {@link javax.script.ScriptEngine#setContext(javax.script.ScriptContext) public abstract void
     * javax.script.ScriptEngine.setContext(javax.script.ScriptContext)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.ScriptEngine#setContext(javax.script.ScriptContext) public abstract void
     *      javax.script.ScriptEngine.setContext(javax.script.ScriptContext) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setContext_ScriptContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.script.ScriptEngine#getContext() public abstract javax.script.ScriptContext
     * javax.script.ScriptEngine.getContext()}.
     *
     * <p>
     * Test method for {@link javax.script.ScriptEngine#getContext() public abstract javax.script.ScriptContext
     * javax.script.ScriptEngine.getContext()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.ScriptEngine#getContext() public abstract javax.script.ScriptContext
     *      javax.script.ScriptEngine.getContext() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link javax.script.ScriptEngine#eval(java.io.Reader, javax.script.ScriptContext) public abstract
     * java.lang.Object javax.script.ScriptEngine.eval(java.io.Reader,javax.script.ScriptContext) throws
     * javax.script.ScriptException}.
     *
     * <p>
     * Test method for {@link javax.script.ScriptEngine#eval(java.io.Reader, javax.script.ScriptContext) public abstract
     * java.lang.Object javax.script.ScriptEngine.eval(java.io.Reader,javax.script.ScriptContext) throws
     * javax.script.ScriptException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.ScriptEngine#eval(java.io.Reader, javax.script.ScriptContext) public abstract java.lang.Object
     *      javax.script.ScriptEngine.eval(java.io.Reader,javax.script.ScriptContext) throws
     *      javax.script.ScriptException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_eval_Reader_ScriptContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.script.ScriptEngine#eval(String, javax.script.ScriptContext) public abstract
     * java.lang.Object javax.script.ScriptEngine.eval(java.lang.String,javax.script.ScriptContext) throws
     * javax.script.ScriptException}.
     *
     * <p>
     * Test method for {@link javax.script.ScriptEngine#eval(String, javax.script.ScriptContext) public abstract
     * java.lang.Object javax.script.ScriptEngine.eval(java.lang.String,javax.script.ScriptContext) throws
     * javax.script.ScriptException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.ScriptEngine#eval(String, javax.script.ScriptContext) public abstract java.lang.Object
     *      javax.script.ScriptEngine.eval(java.lang.String,javax.script.ScriptContext) throws
     *      javax.script.ScriptException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_eval_String_ScriptContext()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.script.ScriptEngine#eval(String, javax.script.Bindings) public abstract
     * java.lang.Object javax.script.ScriptEngine.eval(java.lang.String,javax.script.Bindings) throws
     * javax.script.ScriptException}.
     *
     * <p>
     * Test method for {@link javax.script.ScriptEngine#eval(String, javax.script.Bindings) public abstract
     * java.lang.Object javax.script.ScriptEngine.eval(java.lang.String,javax.script.Bindings) throws
     * javax.script.ScriptException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.ScriptEngine#eval(String, javax.script.Bindings) public abstract java.lang.Object
     *      javax.script.ScriptEngine.eval(java.lang.String,javax.script.Bindings) throws javax.script.ScriptException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link javax.script.ScriptEngine#eval(java.io.Reader) public abstract java.lang.Object
     * javax.script.ScriptEngine.eval(java.io.Reader) throws javax.script.ScriptException}.
     *
     * <p>
     * Test method for {@link javax.script.ScriptEngine#eval(java.io.Reader) public abstract java.lang.Object
     * javax.script.ScriptEngine.eval(java.io.Reader) throws javax.script.ScriptException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.ScriptEngine#eval(java.io.Reader) public abstract java.lang.Object
     *      javax.script.ScriptEngine.eval(java.io.Reader) throws javax.script.ScriptException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link javax.script.ScriptEngine#eval(java.io.Reader, javax.script.Bindings) public abstract
     * java.lang.Object javax.script.ScriptEngine.eval(java.io.Reader,javax.script.Bindings) throws
     * javax.script.ScriptException}.
     *
     * <p>
     * Test method for {@link javax.script.ScriptEngine#eval(java.io.Reader, javax.script.Bindings) public abstract
     * java.lang.Object javax.script.ScriptEngine.eval(java.io.Reader,javax.script.Bindings) throws
     * javax.script.ScriptException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.ScriptEngine#eval(java.io.Reader, javax.script.Bindings) public abstract java.lang.Object
     *      javax.script.ScriptEngine.eval(java.io.Reader,javax.script.Bindings) throws javax.script.ScriptException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link javax.script.ScriptEngine#eval(String) public abstract java.lang.Object
     * javax.script.ScriptEngine.eval(java.lang.String) throws javax.script.ScriptException}.
     *
     * <p>
     * Test method for {@link javax.script.ScriptEngine#eval(String) public abstract java.lang.Object
     * javax.script.ScriptEngine.eval(java.lang.String) throws javax.script.ScriptException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.ScriptEngine#eval(String) public abstract java.lang.Object
     *      javax.script.ScriptEngine.eval(java.lang.String) throws javax.script.ScriptException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link javax.script.ScriptEngine#get(String) public abstract java.lang.Object
     * javax.script.ScriptEngine.get(java.lang.String)}.
     *
     * <p>
     * Test method for {@link javax.script.ScriptEngine#get(String) public abstract java.lang.Object
     * javax.script.ScriptEngine.get(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.ScriptEngine#get(String) public abstract java.lang.Object
     *      javax.script.ScriptEngine.get(java.lang.String) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link javax.script.ScriptEngine#setBindings(javax.script.Bindings, int) public abstract void
     * javax.script.ScriptEngine.setBindings(javax.script.Bindings,int)}.
     *
     * <p>
     * Test method for {@link javax.script.ScriptEngine#setBindings(javax.script.Bindings, int) public abstract void
     * javax.script.ScriptEngine.setBindings(javax.script.Bindings,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.ScriptEngine#setBindings(javax.script.Bindings, int) public abstract void
     *      javax.script.ScriptEngine.setBindings(javax.script.Bindings,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link javax.script.ScriptEngine#getFactory() public abstract javax.script.ScriptEngineFactory
     * javax.script.ScriptEngine.getFactory()}.
     *
     * <p>
     * Test method for {@link javax.script.ScriptEngine#getFactory() public abstract javax.script.ScriptEngineFactory
     * javax.script.ScriptEngine.getFactory()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.ScriptEngine#getFactory() public abstract javax.script.ScriptEngineFactory
     *      javax.script.ScriptEngine.getFactory() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getFactory()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.script.ScriptEngine#createBindings() public abstract javax.script.Bindings
     * javax.script.ScriptEngine.createBindings()}.
     *
     * <p>
     * Test method for {@link javax.script.ScriptEngine#createBindings() public abstract javax.script.Bindings
     * javax.script.ScriptEngine.createBindings()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.ScriptEngine#createBindings() public abstract javax.script.Bindings
     *      javax.script.ScriptEngine.createBindings() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_createBindings()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.script.ScriptEngine#put(String, Object) public abstract void
     * javax.script.ScriptEngine.put(java.lang.String,java.lang.Object)}.
     *
     * <p>
     * Test method for {@link javax.script.ScriptEngine#put(String, Object) public abstract void
     * javax.script.ScriptEngine.put(java.lang.String,java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.ScriptEngine#put(String, Object) public abstract void
     *      javax.script.ScriptEngine.put(java.lang.String,java.lang.Object) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
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
     * Test method for {@link javax.script.ScriptEngine#getBindings(int) public abstract javax.script.Bindings
     * javax.script.ScriptEngine.getBindings(int)}.
     *
     * <p>
     * Test method for {@link javax.script.ScriptEngine#getBindings(int) public abstract javax.script.Bindings
     * javax.script.ScriptEngine.getBindings(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.ScriptEngine#getBindings(int) public abstract javax.script.Bindings
     *      javax.script.ScriptEngine.getBindings(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBindings_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

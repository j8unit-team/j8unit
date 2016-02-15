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
 * non-{@code static} methods) of {@linkplain javax.script.Compilable interface javax.script.Compilable}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link CompilableClassTests}.
 * </p>
 *
 * @see javax.script.Compilable interface javax.script.Compilable (the hereby targeted class-under-test class)
 * @see CompilableClassTests CompilableClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CompilableTests<SUT extends javax.script.Compilable>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.script.Compilable#compile(String) public abstract javax.script.CompiledScript
     * javax.script.Compilable.compile(java.lang.String) throws javax.script.ScriptException}.
     *
     * <p>
     * Test method for {@link javax.script.Compilable#compile(String) public abstract javax.script.CompiledScript
     * javax.script.Compilable.compile(java.lang.String) throws javax.script.ScriptException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.Compilable#compile(String) public abstract javax.script.CompiledScript
     *      javax.script.Compilable.compile(java.lang.String) throws javax.script.ScriptException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_compile_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.script.Compilable#compile(java.io.Reader) public abstract
     * javax.script.CompiledScript javax.script.Compilable.compile(java.io.Reader) throws javax.script.ScriptException}.
     *
     * <p>
     * Test method for {@link javax.script.Compilable#compile(java.io.Reader) public abstract
     * javax.script.CompiledScript javax.script.Compilable.compile(java.io.Reader) throws javax.script.ScriptException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.script.Compilable#compile(java.io.Reader) public abstract javax.script.CompiledScript
     *      javax.script.Compilable.compile(java.io.Reader) throws javax.script.ScriptException (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_compile_Reader()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

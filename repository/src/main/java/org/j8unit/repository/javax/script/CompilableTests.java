package org.j8unit.repository.javax.script;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.script.Compilable interface javax.script.Compilable}, containing all instance relevant
 * test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.script.CompilableClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CompilableTests<SUT extends javax.script.Compilable>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.script.Compilable#compile(java.io.Reader) public abstract
     * javax.script.CompiledScript javax.script.Compilable.compile(java.io.Reader) throws javax.script.ScriptException}.
     * </p>
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

    /**
     * <p>
     * Test method for {@link javax.script.Compilable#compile(java.lang.String) public abstract
     * javax.script.CompiledScript javax.script.Compilable.compile(java.lang.String) throws
     * javax.script.ScriptException}.
     * </p>
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

}
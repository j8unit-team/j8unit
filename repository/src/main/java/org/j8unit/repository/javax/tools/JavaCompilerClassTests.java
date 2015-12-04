package org.j8unit.repository.javax.tools;

import static org.junit.Assert.assertTrue;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.tools.JavaCompiler interface javax.tools.JavaCompiler}, containing all class relevant
 * test methods (at least the test methods of accessible constructors and of accessible {@code static} methods). The
 * counterpart test class containing the instance relevant test methods is
 * {@link org.j8unit.repository.javax.tools.JavaCompilerTests}.
 * </p>
 *
 * <p>
 * In addition, there may be assertions concerning the class itself. For example,
 * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
 * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
 * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a> Thus,
 * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding, inheritable test
 * method: {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
 * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
 * constraints and further class specific requirements.
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.tools.JavaCompilerTests
 */
@Category(J8UnitRepository.class)
public abstract interface JavaCompilerClassTests<SUT extends Class<? extends javax.tools.JavaCompiler>>
extends org.j8unit.repository.javax.tools.ToolClassTests<SUT>, org.j8unit.repository.javax.tools.OptionCheckerClassTests<SUT> {

    /**
     * <p>
     * Test class for {@link javax.tools.JavaCompiler$CompilationTask interface
     * javax.tools.JavaCompiler$CompilationTask}, containing all class relevant test methods (at least the test methods
     * of accessible constructors and of accessible {@code static} methods). The counterpart test class containing the
     * instance relevant test methods is
     * {@link org.j8unit.repository.javax.tools.JavaCompilerTests.CompilationTaskTests}.
     * </p>
     *
     * <p>
     * In addition, there may be assertions concerning the class itself. For example,
     * <a href="https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1">
     * <q>by virtue of the AnnotationTypeElementDeclaration production, a method declaration in an annotation type
     * declaration cannot have formal parameters, type parameters, or a throws clause.</q> (JLS, Sec.&thinsp;9.6.1</a>
     * Thus, {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests} provides a corresponding,
     * inheritable test method:
     * {@link org.j8unit.repository.java.lang.annotation.AnnotationClassTests#hasNoCustomParametrizedMethod()}.
     * Similarly, this class is not only intended to assert some static method's behaviour but also to verify runtime
     * constraints and further class specific requirements.
     * </p>
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     * @see org.j8unit.repository.javax.tools.JavaCompilerTests.CompilationTaskTests
     */
    @Category(J8UnitRepository.class)
    public static abstract interface CompilationTaskClassTests<SUT extends Class<? extends javax.tools.JavaCompiler.CompilationTask>>
    extends org.j8unit.repository.java.util.concurrent.CallableClassTests<SUT, java.lang.Boolean> {

        @Override
        @Test
        public default void testBaseTypeIsAssignableFromCurrentType()
        throws Exception {
            // create new instance
            final Class<? extends javax.tools.JavaCompiler.CompilationTask> sut = createNewSUT();
            // assert assignability
            assertTrue(javax.tools.JavaCompiler.CompilationTask.class.isAssignableFrom(sut));
        }

    }

    @Override
    @Test
    public default void testBaseTypeIsAssignableFromCurrentType()
    throws Exception {
        // create new instance
        final Class<? extends javax.tools.JavaCompiler> sut = createNewSUT();
        // assert assignability
        assertTrue(javax.tools.JavaCompiler.class.isAssignableFrom(sut));
    }

}

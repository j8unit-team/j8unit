package org.j8unit.repository.javax.tools;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link JavaCompiler} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.tools.JavaCompilerTests}).
 */
@RunWith(J8Unit4.class)
public class JavaCompilerTest
implements JavaCompilerTests<JavaCompiler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.JavaCompiler]

    @Override
    public JavaCompiler createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.tools.JavaCompiler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.tools.JavaCompiler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.tools.JavaCompiler]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link CompilationTask} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.tools.JavaCompilerTests.CompilationTaskTests}).
     */
    @RunWith(J8Unit4.class)
    public static class CompilationTaskTest
    implements CompilationTaskTests<CompilationTask> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.JavaCompiler$CompilationTask]

        @Override
        public CompilationTask createNewSUT() {
            throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.tools.JavaCompiler.CompilationTask], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.tools.JavaCompiler$CompilationTask]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.tools.JavaCompiler$CompilationTask]

    }

}

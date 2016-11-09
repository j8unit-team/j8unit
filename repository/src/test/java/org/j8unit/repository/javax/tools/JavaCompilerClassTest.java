package org.j8unit.repository.javax.tools;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link JavaCompiler} (by simply reusing the
 * J8Unit test interface {@link JavaCompilerClassTests}).
 */

@RunWith(J8Unit4.class)
public class JavaCompilerClassTest
implements JavaCompilerClassTests<JavaCompiler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.JavaCompiler]

    @Override
    public Class<JavaCompiler> createNewSUT() {
        return JavaCompiler.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.tools.JavaCompiler]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.JavaCompiler]

    /**
     * Specific JUnit test class to proof the type relevant aspects of type {@link CompilationTask} (by simply reusing
     * the J8Unit test interface {@link CompilationTaskClassTests}).
     */

    @RunWith(J8Unit4.class)
    public static class CompilationTaskClassTest
    implements CompilationTaskClassTests<CompilationTask> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.JavaCompiler$CompilationTask]

        @Override
        public Class<CompilationTask> createNewSUT() {
            return CompilationTask.class;
        }

        // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.tools.JavaCompiler$CompilationTask]

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.JavaCompiler$CompilationTask]

    }

}

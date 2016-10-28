package org.j8unit.repository.javax.tools;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JavaCompilerClassTest
implements org.j8unit.repository.javax.tools.JavaCompilerClassTests<JavaCompiler> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.JavaCompiler]

    @Override
    public Class<JavaCompiler> createNewSUT() {
        return JavaCompiler.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.JavaCompiler]

    @RunWith(J8Unit4.class)
    public static class CompilationTaskClassTest
    implements org.j8unit.repository.javax.tools.JavaCompilerClassTests.CompilationTaskClassTests<CompilationTask> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.JavaCompiler$CompilationTask]

        @Override
        public Class<CompilationTask> createNewSUT() {
            return CompilationTask.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.JavaCompiler$CompilationTask]

    }

}

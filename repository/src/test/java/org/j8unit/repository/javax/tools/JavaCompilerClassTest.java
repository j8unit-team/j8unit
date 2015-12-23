package org.j8unit.repository.javax.tools;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JavaCompilerClassTest
implements org.j8unit.repository.javax.tools.JavaCompilerClassTests<javax.tools.JavaCompiler> {

    @Override
    public Class<javax.tools.JavaCompiler> createNewSUT() {
        return javax.tools.JavaCompiler.class;
    }

    @RunWith(J8Unit4.class)
    public static class CompilationTaskClassTest
    implements org.j8unit.repository.javax.tools.JavaCompilerClassTests.CompilationTaskClassTests<javax.tools.JavaCompiler.CompilationTask> {

        @Override
        public Class<javax.tools.JavaCompiler.CompilationTask> createNewSUT() {
            return javax.tools.JavaCompiler.CompilationTask.class;
        }

    }

}

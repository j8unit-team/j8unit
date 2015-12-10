package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProcessBuilderClassTest
implements org.j8unit.repository.java.lang.ProcessBuilderClassTests<java.lang.ProcessBuilder> {

    @RunWith(J8Unit4.class)
    public static class RedirectClassTest
    implements org.j8unit.repository.java.lang.ProcessBuilderClassTests.RedirectClassTests<java.lang.ProcessBuilder.Redirect> {

        @RunWith(J8Unit4.class)
        public static class TypeClassTest
        implements org.j8unit.repository.java.lang.ProcessBuilderClassTests.RedirectClassTests.TypeClassTests<java.lang.ProcessBuilder.Redirect.Type> {

            @Override
            public Class<java.lang.ProcessBuilder.Redirect.Type> createNewSUT() {
                return java.lang.ProcessBuilder.Redirect.Type.class;
            }

        }

        @Override
        public Class<java.lang.ProcessBuilder.Redirect> createNewSUT() {
            return java.lang.ProcessBuilder.Redirect.class;
        }

    }

    @Override
    public Class<java.lang.ProcessBuilder> createNewSUT() {
        return java.lang.ProcessBuilder.class;
    }

}

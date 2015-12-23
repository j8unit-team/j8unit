package org.j8unit.repository.javax.tools;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JavaFileObjectClassTest
implements org.j8unit.repository.javax.tools.JavaFileObjectClassTests<javax.tools.JavaFileObject> {

    @Override
    public Class<javax.tools.JavaFileObject> createNewSUT() {
        return javax.tools.JavaFileObject.class;
    }

    @RunWith(J8Unit4.class)
    public static class KindClassTest
    implements org.j8unit.repository.javax.tools.JavaFileObjectClassTests.KindClassTests<javax.tools.JavaFileObject.Kind> {

        @Override
        public Class<javax.tools.JavaFileObject.Kind> createNewSUT() {
            return javax.tools.JavaFileObject.Kind.class;
        }

    }

}

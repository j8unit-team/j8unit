package org.j8unit.repository.javax.tools;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SimpleJavaFileObjectClassTest
implements org.j8unit.repository.javax.tools.SimpleJavaFileObjectClassTests<javax.tools.SimpleJavaFileObject> {

    @Override
    public Class<javax.tools.SimpleJavaFileObject> createNewSUT() {
        return javax.tools.SimpleJavaFileObject.class;
    }

}

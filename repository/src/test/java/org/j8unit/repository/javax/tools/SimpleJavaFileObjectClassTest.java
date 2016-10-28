package org.j8unit.repository.javax.tools;

import javax.tools.SimpleJavaFileObject;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SimpleJavaFileObjectClassTest
implements org.j8unit.repository.javax.tools.SimpleJavaFileObjectClassTests<SimpleJavaFileObject> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.SimpleJavaFileObject]

    @Override
    public Class<SimpleJavaFileObject> createNewSUT() {
        return SimpleJavaFileObject.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.SimpleJavaFileObject]

}

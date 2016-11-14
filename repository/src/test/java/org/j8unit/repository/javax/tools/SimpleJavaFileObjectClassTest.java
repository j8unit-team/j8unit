package org.j8unit.repository.javax.tools;

import javax.tools.SimpleJavaFileObject;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SimpleJavaFileObject} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.tools.SimpleJavaFileObjectClassTests}).
 */

@RunWith(J8Unit4.class)
public class SimpleJavaFileObjectClassTest
implements SimpleJavaFileObjectClassTests<SimpleJavaFileObject> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.SimpleJavaFileObject]

    @Override
    public Class<SimpleJavaFileObject> createNewSUT() {
        return SimpleJavaFileObject.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.tools.SimpleJavaFileObject]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.SimpleJavaFileObject]

}

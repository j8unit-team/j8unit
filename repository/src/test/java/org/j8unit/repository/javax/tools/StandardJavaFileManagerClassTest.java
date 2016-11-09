package org.j8unit.repository.javax.tools;

import javax.tools.StandardJavaFileManager;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StandardJavaFileManager} (by simply
 * reusing the J8Unit test interface {@link StandardJavaFileManagerClassTests}).
 */

@RunWith(J8Unit4.class)
public class StandardJavaFileManagerClassTest
implements StandardJavaFileManagerClassTests<StandardJavaFileManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.StandardJavaFileManager]

    @Override
    public Class<StandardJavaFileManager> createNewSUT() {
        return StandardJavaFileManager.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.tools.StandardJavaFileManager]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.StandardJavaFileManager]

}

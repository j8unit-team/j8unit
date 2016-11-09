package org.j8unit.repository.javax.tools;

import javax.tools.ForwardingJavaFileManager;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ForwardingJavaFileManager} (by simply
 * reusing the J8Unit test interface {@link ForwardingJavaFileManagerClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ForwardingJavaFileManagerClassTest
implements ForwardingJavaFileManagerClassTests<ForwardingJavaFileManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.ForwardingJavaFileManager]

    @Override
    public Class<ForwardingJavaFileManager> createNewSUT() {
        return ForwardingJavaFileManager.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.tools.ForwardingJavaFileManager]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.ForwardingJavaFileManager]

}

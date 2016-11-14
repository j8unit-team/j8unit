package org.j8unit.repository.javax.tools;

import javax.tools.ForwardingJavaFileObject;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ForwardingJavaFileObject} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.tools.ForwardingJavaFileObjectClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ForwardingJavaFileObjectClassTest
implements ForwardingJavaFileObjectClassTests<ForwardingJavaFileObject> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.ForwardingJavaFileObject]

    @Override
    public Class<ForwardingJavaFileObject> createNewSUT() {
        return ForwardingJavaFileObject.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.tools.ForwardingJavaFileObject]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.ForwardingJavaFileObject]

}

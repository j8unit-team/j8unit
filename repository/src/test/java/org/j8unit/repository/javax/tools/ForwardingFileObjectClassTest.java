package org.j8unit.repository.javax.tools;

import javax.tools.ForwardingFileObject;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ForwardingFileObject} (by simply reusing
 * the J8Unit test interface {@link ForwardingFileObjectClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ForwardingFileObjectClassTest
implements ForwardingFileObjectClassTests<ForwardingFileObject> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.ForwardingFileObject]

    @Override
    public Class<ForwardingFileObject> createNewSUT() {
        return ForwardingFileObject.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.tools.ForwardingFileObject]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.ForwardingFileObject]

}

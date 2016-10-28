package org.j8unit.repository.javax.tools;

import javax.tools.ForwardingJavaFileManager;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ForwardingJavaFileManagerClassTest
implements org.j8unit.repository.javax.tools.ForwardingJavaFileManagerClassTests<ForwardingJavaFileManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.ForwardingJavaFileManager]

    @Override
    public Class<ForwardingJavaFileManager> createNewSUT() {
        return ForwardingJavaFileManager.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.ForwardingJavaFileManager]

}

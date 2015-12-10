package org.j8unit.repository.javax.tools;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ForwardingJavaFileManagerClassTest
implements org.j8unit.repository.javax.tools.ForwardingJavaFileManagerClassTests<javax.tools.ForwardingJavaFileManager> {

    @Override
    public Class<javax.tools.ForwardingJavaFileManager> createNewSUT() {
        return javax.tools.ForwardingJavaFileManager.class;
    }

}

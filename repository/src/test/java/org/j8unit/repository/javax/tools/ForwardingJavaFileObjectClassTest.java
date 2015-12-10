package org.j8unit.repository.javax.tools;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ForwardingJavaFileObjectClassTest
implements org.j8unit.repository.javax.tools.ForwardingJavaFileObjectClassTests<javax.tools.ForwardingJavaFileObject> {

    @Override
    public Class<javax.tools.ForwardingJavaFileObject> createNewSUT() {
        return javax.tools.ForwardingJavaFileObject.class;
    }

}

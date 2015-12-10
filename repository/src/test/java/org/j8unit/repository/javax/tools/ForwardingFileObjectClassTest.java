package org.j8unit.repository.javax.tools;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ForwardingFileObjectClassTest
implements org.j8unit.repository.javax.tools.ForwardingFileObjectClassTests<javax.tools.ForwardingFileObject> {

    @Override
    public Class<javax.tools.ForwardingFileObject> createNewSUT() {
        return javax.tools.ForwardingFileObject.class;
    }

}

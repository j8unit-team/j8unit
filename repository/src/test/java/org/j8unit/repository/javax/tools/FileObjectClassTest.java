package org.j8unit.repository.javax.tools;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileObjectClassTest
implements org.j8unit.repository.javax.tools.FileObjectClassTests<javax.tools.FileObject> {

    @Override
    public Class<javax.tools.FileObject> createNewSUT() {
        return javax.tools.FileObject.class;
    }

}

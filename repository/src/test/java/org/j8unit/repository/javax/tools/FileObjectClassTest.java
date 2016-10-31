package org.j8unit.repository.javax.tools;

import javax.tools.FileObject;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileObjectClassTest
implements org.j8unit.repository.javax.tools.FileObjectClassTests<FileObject> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.tools.FileObject]

    @Override
    public Class<FileObject> createNewSUT() {
        return FileObject.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.tools.FileObject]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.tools.FileObject]

}

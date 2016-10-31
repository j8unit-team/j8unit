package org.j8unit.repository.javax.tools;

import javax.tools.FileObject;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileObjectTest
implements org.j8unit.repository.javax.tools.FileObjectTests<FileObject> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.tools.FileObject]

    @Override
    public FileObject createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.tools.FileObject], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.tools.FileObject]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.tools.FileObject]

}

package org.j8unit.repository.java.io;

import java.io.FileFilter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileFilterClassTest
implements org.j8unit.repository.java.io.FileFilterClassTests<FileFilter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.FileFilter]

    @Override
    public Class<FileFilter> createNewSUT() {
        return FileFilter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.io.FileFilter]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.FileFilter]

}

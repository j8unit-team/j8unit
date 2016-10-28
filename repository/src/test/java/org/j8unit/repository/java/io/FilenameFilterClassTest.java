package org.j8unit.repository.java.io;

import java.io.FilenameFilter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FilenameFilterClassTest
implements org.j8unit.repository.java.io.FilenameFilterClassTests<FilenameFilter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.io.FilenameFilter]

    @Override
    public Class<FilenameFilter> createNewSUT() {
        return FilenameFilter.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.io.FilenameFilter]

}

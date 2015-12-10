package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FilenameFilterClassTest
implements org.j8unit.repository.java.io.FilenameFilterClassTests<java.io.FilenameFilter> {

    @Override
    public Class<java.io.FilenameFilter> createNewSUT() {
        return java.io.FilenameFilter.class;
    }

}

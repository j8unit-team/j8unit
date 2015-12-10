package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileFilterClassTest
implements org.j8unit.repository.java.io.FileFilterClassTests<java.io.FileFilter> {

    @Override
    public Class<java.io.FileFilter> createNewSUT() {
        return java.io.FileFilter.class;
    }

}

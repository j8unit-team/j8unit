package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PathsClassTest
implements org.j8unit.repository.java.nio.file.PathsClassTests<java.nio.file.Paths> {

    @Override
    public Class<java.nio.file.Paths> createNewSUT() {
        return java.nio.file.Paths.class;
    }

}

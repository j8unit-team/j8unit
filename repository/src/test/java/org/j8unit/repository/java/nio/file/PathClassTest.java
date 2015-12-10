package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PathClassTest
implements org.j8unit.repository.java.nio.file.PathClassTests<java.nio.file.Path> {

    @Override
    public Class<java.nio.file.Path> createNewSUT() {
        return java.nio.file.Path.class;
    }

}

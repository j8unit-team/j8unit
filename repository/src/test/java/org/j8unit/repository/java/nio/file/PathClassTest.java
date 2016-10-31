package org.j8unit.repository.java.nio.file;

import java.nio.file.Path;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PathClassTest
implements org.j8unit.repository.java.nio.file.PathClassTests<Path> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.nio.file.Path]

    @Override
    public Class<Path> createNewSUT() {
        return Path.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.nio.file.Path]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.nio.file.Path]

}

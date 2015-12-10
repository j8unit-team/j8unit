package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AccessModeClassTest
implements org.j8unit.repository.java.nio.file.AccessModeClassTests<java.nio.file.AccessMode> {

    @Override
    public Class<java.nio.file.AccessMode> createNewSUT() {
        return java.nio.file.AccessMode.class;
    }

}

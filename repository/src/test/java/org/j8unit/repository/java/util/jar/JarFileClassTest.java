package org.j8unit.repository.java.util.jar;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JarFileClassTest
implements org.j8unit.repository.java.util.jar.JarFileClassTests<java.util.jar.JarFile> {

    @Override
    public Class<java.util.jar.JarFile> createNewSUT() {
        return java.util.jar.JarFile.class;
    }

}

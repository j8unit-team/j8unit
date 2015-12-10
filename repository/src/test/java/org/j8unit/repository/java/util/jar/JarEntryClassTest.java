package org.j8unit.repository.java.util.jar;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JarEntryClassTest
implements org.j8unit.repository.java.util.jar.JarEntryClassTests<java.util.jar.JarEntry> {

    @Override
    public Class<java.util.jar.JarEntry> createNewSUT() {
        return java.util.jar.JarEntry.class;
    }

}

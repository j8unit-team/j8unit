package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class URLClassLoaderClassTest
implements org.j8unit.repository.java.net.URLClassLoaderClassTests<java.net.URLClassLoader> {

    @Override
    public Class<java.net.URLClassLoader> createNewSUT() {
        return java.net.URLClassLoader.class;
    }

}

package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class URLClassTest
implements org.j8unit.repository.java.net.URLClassTests<java.net.URL> {

    @Override
    public Class<java.net.URL> createNewSUT() {
        return java.net.URL.class;
    }

}

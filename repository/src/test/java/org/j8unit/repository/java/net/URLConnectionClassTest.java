package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class URLConnectionClassTest
implements org.j8unit.repository.java.net.URLConnectionClassTests<java.net.URLConnection> {

    @Override
    public Class<java.net.URLConnection> createNewSUT() {
        return java.net.URLConnection.class;
    }

}

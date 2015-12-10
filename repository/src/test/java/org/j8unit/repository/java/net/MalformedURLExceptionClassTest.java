package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MalformedURLExceptionClassTest
implements org.j8unit.repository.java.net.MalformedURLExceptionClassTests<java.net.MalformedURLException> {

    @Override
    public Class<java.net.MalformedURLException> createNewSUT() {
        return java.net.MalformedURLException.class;
    }

}

package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class URIClassTest
implements org.j8unit.repository.java.net.URIClassTests<java.net.URI> {

    @Override
    public Class<java.net.URI> createNewSUT() {
        return java.net.URI.class;
    }

}

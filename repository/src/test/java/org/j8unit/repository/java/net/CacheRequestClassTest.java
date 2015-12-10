package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CacheRequestClassTest
implements org.j8unit.repository.java.net.CacheRequestClassTests<java.net.CacheRequest> {

    @Override
    public Class<java.net.CacheRequest> createNewSUT() {
        return java.net.CacheRequest.class;
    }

}

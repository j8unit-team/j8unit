package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ResponseCacheClassTest
implements org.j8unit.repository.java.net.ResponseCacheClassTests<java.net.ResponseCache> {

    @Override
    public Class<java.net.ResponseCache> createNewSUT() {
        return java.net.ResponseCache.class;
    }

}

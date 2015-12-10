package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CacheResponseClassTest
implements org.j8unit.repository.java.net.CacheResponseClassTests<java.net.CacheResponse> {

    @Override
    public Class<java.net.CacheResponse> createNewSUT() {
        return java.net.CacheResponse.class;
    }

}

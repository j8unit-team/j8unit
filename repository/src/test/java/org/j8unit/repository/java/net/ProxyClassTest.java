package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProxyClassTest
implements org.j8unit.repository.java.net.ProxyClassTests<java.net.Proxy> {

    @RunWith(J8Unit4.class)
    public static class TypeClassTest
    implements org.j8unit.repository.java.net.ProxyClassTests.TypeClassTests<java.net.Proxy.Type> {

        @Override
        public Class<java.net.Proxy.Type> createNewSUT() {
            return java.net.Proxy.Type.class;
        }

    }

    @Override
    public Class<java.net.Proxy> createNewSUT() {
        return java.net.Proxy.class;
    }

}

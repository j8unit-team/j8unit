package org.j8unit.repository.java.lang.reflect;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProxyClassTest
implements org.j8unit.repository.java.lang.reflect.ProxyClassTests<java.lang.reflect.Proxy> {

    @Override
    public Class<java.lang.reflect.Proxy> createNewSUT() {
        return java.lang.reflect.Proxy.class;
    }

}

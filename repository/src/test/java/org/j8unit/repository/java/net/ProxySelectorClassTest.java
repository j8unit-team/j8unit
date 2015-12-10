package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProxySelectorClassTest
implements org.j8unit.repository.java.net.ProxySelectorClassTests<java.net.ProxySelector> {

    @Override
    public Class<java.net.ProxySelector> createNewSUT() {
        return java.net.ProxySelector.class;
    }

}

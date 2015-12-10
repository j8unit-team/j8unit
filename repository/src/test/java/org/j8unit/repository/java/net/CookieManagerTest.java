package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CookieManagerTest
implements org.j8unit.repository.java.net.CookieManagerTests<java.net.CookieManager> {

    @Override
    public java.net.CookieManager createNewSUT() {
        return new java.net.CookieManager();
    }

}

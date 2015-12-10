package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CookieManagerClassTest
implements org.j8unit.repository.java.net.CookieManagerClassTests<java.net.CookieManager> {

    @Override
    public Class<java.net.CookieManager> createNewSUT() {
        return java.net.CookieManager.class;
    }

}

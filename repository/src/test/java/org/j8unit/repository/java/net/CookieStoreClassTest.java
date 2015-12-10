package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CookieStoreClassTest
implements org.j8unit.repository.java.net.CookieStoreClassTests<java.net.CookieStore> {

    @Override
    public Class<java.net.CookieStore> createNewSUT() {
        return java.net.CookieStore.class;
    }

}

package org.j8unit.repository.java.net;

import java.net.CookieStore;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CookieStoreClassTest
implements org.j8unit.repository.java.net.CookieStoreClassTests<CookieStore> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.CookieStore]

    @Override
    public Class<CookieStore> createNewSUT() {
        return CookieStore.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.CookieStore]

}

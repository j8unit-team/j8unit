package org.j8unit.repository.java.net;

import java.net.CookiePolicy;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CookiePolicyClassTest
implements org.j8unit.repository.java.net.CookiePolicyClassTests<CookiePolicy> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.net.CookiePolicy]

    @Override
    public Class<CookiePolicy> createNewSUT() {
        return CookiePolicy.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.net.CookiePolicy]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.net.CookiePolicy]

}

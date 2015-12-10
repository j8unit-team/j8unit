package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class URLEncoderClassTest
implements org.j8unit.repository.java.net.URLEncoderClassTests<java.net.URLEncoder> {

    @Override
    public Class<java.net.URLEncoder> createNewSUT() {
        return java.net.URLEncoder.class;
    }

}

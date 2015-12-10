package org.j8unit.repository.java.net;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class URLDecoderTest
implements org.j8unit.repository.java.net.URLDecoderTests<java.net.URLDecoder> {

    @Override
    public java.net.URLDecoder createNewSUT() {
        return new java.net.URLDecoder();
    }

}

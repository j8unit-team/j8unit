package org.j8unit.repository.java.nio.charset;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CharsetClassTest
implements org.j8unit.repository.java.nio.charset.CharsetClassTests<java.nio.charset.Charset> {

    @Override
    public Class<java.nio.charset.Charset> createNewSUT() {
        return java.nio.charset.Charset.class;
    }

}

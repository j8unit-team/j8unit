package org.j8unit.repository.java.nio.charset;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StandardCharsetsClassTest
implements org.j8unit.repository.java.nio.charset.StandardCharsetsClassTests<java.nio.charset.StandardCharsets> {

    @Override
    public Class<java.nio.charset.StandardCharsets> createNewSUT() {
        return java.nio.charset.StandardCharsets.class;
    }

}

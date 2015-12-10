package org.j8unit.repository.java.io;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InputStreamClassTest
implements org.j8unit.repository.java.io.InputStreamClassTests<java.io.InputStream> {

    @Override
    public Class<java.io.InputStream> createNewSUT() {
        return java.io.InputStream.class;
    }

}

package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NotLinkExceptionClassTest
implements org.j8unit.repository.java.nio.file.NotLinkExceptionClassTests<java.nio.file.NotLinkException> {

    @Override
    public Class<java.nio.file.NotLinkException> createNewSUT() {
        return java.nio.file.NotLinkException.class;
    }

}

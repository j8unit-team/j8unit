package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class SecureDirectoryStreamClassTest
implements org.j8unit.repository.java.nio.file.SecureDirectoryStreamClassTests<java.nio.file.SecureDirectoryStream> {

    @Override
    public Class<java.nio.file.SecureDirectoryStream> createNewSUT() {
        return java.nio.file.SecureDirectoryStream.class;
    }

}

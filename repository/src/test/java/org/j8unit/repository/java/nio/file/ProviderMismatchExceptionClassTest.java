package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProviderMismatchExceptionClassTest
implements org.j8unit.repository.java.nio.file.ProviderMismatchExceptionClassTests<java.nio.file.ProviderMismatchException> {

    @Override
    public Class<java.nio.file.ProviderMismatchException> createNewSUT() {
        return java.nio.file.ProviderMismatchException.class;
    }

}

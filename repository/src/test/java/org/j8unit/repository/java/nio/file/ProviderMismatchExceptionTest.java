package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProviderMismatchExceptionTest
implements org.j8unit.repository.java.nio.file.ProviderMismatchExceptionTests<java.nio.file.ProviderMismatchException> {

    @Override
    public java.nio.file.ProviderMismatchException createNewSUT() {
        return new java.nio.file.ProviderMismatchException();
    }

}

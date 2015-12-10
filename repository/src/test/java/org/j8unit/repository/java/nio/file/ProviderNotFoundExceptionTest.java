package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProviderNotFoundExceptionTest
implements org.j8unit.repository.java.nio.file.ProviderNotFoundExceptionTests<java.nio.file.ProviderNotFoundException> {

    @Override
    public java.nio.file.ProviderNotFoundException createNewSUT() {
        return new java.nio.file.ProviderNotFoundException();
    }

}

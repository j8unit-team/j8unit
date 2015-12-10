package org.j8unit.repository.java.nio.file;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ProviderNotFoundExceptionClassTest
implements org.j8unit.repository.java.nio.file.ProviderNotFoundExceptionClassTests<java.nio.file.ProviderNotFoundException> {

    @Override
    public Class<java.nio.file.ProviderNotFoundException> createNewSUT() {
        return java.nio.file.ProviderNotFoundException.class;
    }

}

package org.j8unit.repository.java.nio.channels;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnsupportedAddressTypeExceptionTest
implements org.j8unit.repository.java.nio.channels.UnsupportedAddressTypeExceptionTests<java.nio.channels.UnsupportedAddressTypeException> {

    @Override
    public java.nio.channels.UnsupportedAddressTypeException createNewSUT() {
        return new java.nio.channels.UnsupportedAddressTypeException();
    }

}

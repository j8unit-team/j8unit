package org.j8unit.repository.javax.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnsupportedDataTypeExceptionTest
implements org.j8unit.repository.javax.activation.UnsupportedDataTypeExceptionTests<javax.activation.UnsupportedDataTypeException> {

    @Override
    public javax.activation.UnsupportedDataTypeException createNewSUT() {
        return new javax.activation.UnsupportedDataTypeException();
    }

}

package org.j8unit.repository.javax.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnsupportedDataTypeExceptionClassTest
implements org.j8unit.repository.javax.activation.UnsupportedDataTypeExceptionClassTests<javax.activation.UnsupportedDataTypeException> {

    @Override
    public Class<javax.activation.UnsupportedDataTypeException> createNewSUT() {
        return javax.activation.UnsupportedDataTypeException.class;
    }

}
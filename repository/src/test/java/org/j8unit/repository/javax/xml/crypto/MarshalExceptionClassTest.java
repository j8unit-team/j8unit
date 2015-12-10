package org.j8unit.repository.javax.xml.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MarshalExceptionClassTest
implements org.j8unit.repository.javax.xml.crypto.MarshalExceptionClassTests<javax.xml.crypto.MarshalException> {

    @Override
    public Class<javax.xml.crypto.MarshalException> createNewSUT() {
        return javax.xml.crypto.MarshalException.class;
    }

}

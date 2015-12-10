package org.j8unit.repository.javax.xml.bind;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MarshalExceptionClassTest
implements org.j8unit.repository.javax.xml.bind.MarshalExceptionClassTests<javax.xml.bind.MarshalException> {

    @Override
    public Class<javax.xml.bind.MarshalException> createNewSUT() {
        return javax.xml.bind.MarshalException.class;
    }

}

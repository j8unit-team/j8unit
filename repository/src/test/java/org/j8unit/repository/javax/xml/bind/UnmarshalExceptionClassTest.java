package org.j8unit.repository.javax.xml.bind;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnmarshalExceptionClassTest
implements org.j8unit.repository.javax.xml.bind.UnmarshalExceptionClassTests<javax.xml.bind.UnmarshalException> {

    @Override
    public Class<javax.xml.bind.UnmarshalException> createNewSUT() {
        return javax.xml.bind.UnmarshalException.class;
    }

}
package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompletionStatusHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.CompletionStatusHelperClassTests<org.omg.CORBA.CompletionStatusHelper> {

    @Override
    public Class<org.omg.CORBA.CompletionStatusHelper> createNewSUT() {
        return org.omg.CORBA.CompletionStatusHelper.class;
    }

}

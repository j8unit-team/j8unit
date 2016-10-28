package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.ARG_OUT;

@RunWith(J8Unit4.class)
public class ARG_OUTClassTest
implements org.j8unit.repository.org.omg.CORBA.ARG_OUTClassTests<ARG_OUT> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.ARG_OUT]

    @Override
    public Class<ARG_OUT> createNewSUT() {
        return ARG_OUT.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.ARG_OUT]

}

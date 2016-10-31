package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.IOP.ExceptionDetailMessage;

@RunWith(J8Unit4.class)
public class ExceptionDetailMessageClassTest
implements org.j8unit.repository.org.omg.IOP.ExceptionDetailMessageClassTests<ExceptionDetailMessage> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.IOP.ExceptionDetailMessage]

    @Override
    public Class<ExceptionDetailMessage> createNewSUT() {
        return ExceptionDetailMessage.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.IOP.ExceptionDetailMessage]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.IOP.ExceptionDetailMessage]

}

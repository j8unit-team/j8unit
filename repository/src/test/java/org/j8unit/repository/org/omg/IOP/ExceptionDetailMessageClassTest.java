package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ExceptionDetailMessageClassTest
implements org.j8unit.repository.org.omg.IOP.ExceptionDetailMessageClassTests<org.omg.IOP.ExceptionDetailMessage> {

    @Override
    public Class<org.omg.IOP.ExceptionDetailMessage> createNewSUT() {
        return org.omg.IOP.ExceptionDetailMessage.class;
    }

}

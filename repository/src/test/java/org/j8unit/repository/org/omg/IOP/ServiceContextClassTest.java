package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceContextClassTest
implements org.j8unit.repository.org.omg.IOP.ServiceContextClassTests<org.omg.IOP.ServiceContext> {

    @Override
    public Class<org.omg.IOP.ServiceContext> createNewSUT() {
        return org.omg.IOP.ServiceContext.class;
    }

}

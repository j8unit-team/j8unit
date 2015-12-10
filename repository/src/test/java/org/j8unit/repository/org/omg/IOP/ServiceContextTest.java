package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceContextTest
implements org.j8unit.repository.org.omg.IOP.ServiceContextTests<org.omg.IOP.ServiceContext> {

    @Override
    public org.omg.IOP.ServiceContext createNewSUT() {
        return new org.omg.IOP.ServiceContext();
    }

}

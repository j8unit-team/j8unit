package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceContextHolderTest
implements org.j8unit.repository.org.omg.IOP.ServiceContextHolderTests<org.omg.IOP.ServiceContextHolder> {

    @Override
    public org.omg.IOP.ServiceContextHolder createNewSUT() {
        return new org.omg.IOP.ServiceContextHolder();
    }

}

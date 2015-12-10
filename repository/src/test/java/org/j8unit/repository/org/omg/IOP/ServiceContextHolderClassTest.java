package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceContextHolderClassTest
implements org.j8unit.repository.org.omg.IOP.ServiceContextHolderClassTests<org.omg.IOP.ServiceContextHolder> {

    @Override
    public Class<org.omg.IOP.ServiceContextHolder> createNewSUT() {
        return org.omg.IOP.ServiceContextHolder.class;
    }

}

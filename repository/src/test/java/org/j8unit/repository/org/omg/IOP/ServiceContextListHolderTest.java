package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceContextListHolderTest
implements org.j8unit.repository.org.omg.IOP.ServiceContextListHolderTests<org.omg.IOP.ServiceContextListHolder> {

    @Override
    public org.omg.IOP.ServiceContextListHolder createNewSUT() {
        return new org.omg.IOP.ServiceContextListHolder();
    }

}

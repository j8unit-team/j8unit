package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceContextListHolderClassTest
implements org.j8unit.repository.org.omg.IOP.ServiceContextListHolderClassTests<org.omg.IOP.ServiceContextListHolder> {

    @Override
    public Class<org.omg.IOP.ServiceContextListHolder> createNewSUT() {
        return org.omg.IOP.ServiceContextListHolder.class;
    }

}

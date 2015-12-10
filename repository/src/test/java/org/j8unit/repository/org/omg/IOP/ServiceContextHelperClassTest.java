package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceContextHelperClassTest
implements org.j8unit.repository.org.omg.IOP.ServiceContextHelperClassTests<org.omg.IOP.ServiceContextHelper> {

    @Override
    public Class<org.omg.IOP.ServiceContextHelper> createNewSUT() {
        return org.omg.IOP.ServiceContextHelper.class;
    }

}

package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceContextListHelperClassTest
implements org.j8unit.repository.org.omg.IOP.ServiceContextListHelperClassTests<org.omg.IOP.ServiceContextListHelper> {

    @Override
    public Class<org.omg.IOP.ServiceContextListHelper> createNewSUT() {
        return org.omg.IOP.ServiceContextListHelper.class;
    }

}

package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidSlotClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.InvalidSlotClassTests<org.omg.PortableInterceptor.InvalidSlot> {

    @Override
    public Class<org.omg.PortableInterceptor.InvalidSlot> createNewSUT() {
        return org.omg.PortableInterceptor.InvalidSlot.class;
    }

}

package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidSlotTest
implements org.j8unit.repository.org.omg.PortableInterceptor.InvalidSlotTests<org.omg.PortableInterceptor.InvalidSlot> {

    @Override
    public org.omg.PortableInterceptor.InvalidSlot createNewSUT() {
        return new org.omg.PortableInterceptor.InvalidSlot();
    }

}

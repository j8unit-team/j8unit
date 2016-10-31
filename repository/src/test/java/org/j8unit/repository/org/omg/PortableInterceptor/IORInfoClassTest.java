package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.IORInfo;

@RunWith(J8Unit4.class)
public class IORInfoClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.IORInfoClassTests<IORInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.PortableInterceptor.IORInfo]

    @Override
    public Class<IORInfo> createNewSUT() {
        return IORInfo.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.PortableInterceptor.IORInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.PortableInterceptor.IORInfo]

}

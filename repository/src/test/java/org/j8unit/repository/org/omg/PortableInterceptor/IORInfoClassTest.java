package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IORInfoClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.IORInfoClassTests<org.omg.PortableInterceptor.IORInfo> {

    @Override
    public Class<org.omg.PortableInterceptor.IORInfo> createNewSUT() {
        return org.omg.PortableInterceptor.IORInfo.class;
    }

}
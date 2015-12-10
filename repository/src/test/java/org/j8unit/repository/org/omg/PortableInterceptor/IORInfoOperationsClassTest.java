package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IORInfoOperationsClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.IORInfoOperationsClassTests<org.omg.PortableInterceptor.IORInfoOperations> {

    @Override
    public Class<org.omg.PortableInterceptor.IORInfoOperations> createNewSUT() {
        return org.omg.PortableInterceptor.IORInfoOperations.class;
    }

}

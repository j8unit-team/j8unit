package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CurrentOperationsClassTest
implements org.j8unit.repository.org.omg.PortableInterceptor.CurrentOperationsClassTests<org.omg.PortableInterceptor.CurrentOperations> {

    @Override
    public Class<org.omg.PortableInterceptor.CurrentOperations> createNewSUT() {
        return org.omg.PortableInterceptor.CurrentOperations.class;
    }

}

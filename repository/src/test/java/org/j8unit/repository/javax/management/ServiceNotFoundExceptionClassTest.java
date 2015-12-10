package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceNotFoundExceptionClassTest
implements org.j8unit.repository.javax.management.ServiceNotFoundExceptionClassTests<javax.management.ServiceNotFoundException> {

    @Override
    public Class<javax.management.ServiceNotFoundException> createNewSUT() {
        return javax.management.ServiceNotFoundException.class;
    }

}

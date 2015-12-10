package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceNotFoundExceptionTest
implements org.j8unit.repository.javax.management.ServiceNotFoundExceptionTests<javax.management.ServiceNotFoundException> {

    @Override
    public javax.management.ServiceNotFoundException createNewSUT() {
        return new javax.management.ServiceNotFoundException();
    }

}

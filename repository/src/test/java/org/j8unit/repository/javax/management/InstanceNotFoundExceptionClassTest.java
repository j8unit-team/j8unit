package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InstanceNotFoundExceptionClassTest
implements org.j8unit.repository.javax.management.InstanceNotFoundExceptionClassTests<javax.management.InstanceNotFoundException> {

    @Override
    public Class<javax.management.InstanceNotFoundException> createNewSUT() {
        return javax.management.InstanceNotFoundException.class;
    }

}

package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ListenerNotFoundExceptionTest
implements org.j8unit.repository.javax.management.ListenerNotFoundExceptionTests<javax.management.ListenerNotFoundException> {

    @Override
    public javax.management.ListenerNotFoundException createNewSUT() {
        return new javax.management.ListenerNotFoundException();
    }

}

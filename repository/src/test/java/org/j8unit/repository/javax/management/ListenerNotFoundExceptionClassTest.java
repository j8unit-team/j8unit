package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ListenerNotFoundExceptionClassTest
implements org.j8unit.repository.javax.management.ListenerNotFoundExceptionClassTests<javax.management.ListenerNotFoundException> {

    @Override
    public Class<javax.management.ListenerNotFoundException> createNewSUT() {
        return javax.management.ListenerNotFoundException.class;
    }

}

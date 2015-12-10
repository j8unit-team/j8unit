package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EventListenerClassTest
implements org.j8unit.repository.java.util.EventListenerClassTests<java.util.EventListener> {

    @Override
    public Class<java.util.EventListener> createNewSUT() {
        return java.util.EventListener.class;
    }

}

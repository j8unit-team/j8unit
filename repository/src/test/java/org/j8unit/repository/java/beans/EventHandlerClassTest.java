package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EventHandlerClassTest
implements org.j8unit.repository.java.beans.EventHandlerClassTests<java.beans.EventHandler> {

    @Override
    public Class<java.beans.EventHandler> createNewSUT() {
        return java.beans.EventHandler.class;
    }

}

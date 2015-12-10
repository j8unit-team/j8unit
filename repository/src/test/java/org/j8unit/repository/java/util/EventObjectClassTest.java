package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EventObjectClassTest
implements org.j8unit.repository.java.util.EventObjectClassTests<java.util.EventObject> {

    @Override
    public Class<java.util.EventObject> createNewSUT() {
        return java.util.EventObject.class;
    }

}

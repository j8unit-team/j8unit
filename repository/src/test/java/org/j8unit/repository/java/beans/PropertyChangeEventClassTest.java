package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PropertyChangeEventClassTest
implements org.j8unit.repository.java.beans.PropertyChangeEventClassTests<java.beans.PropertyChangeEvent> {

    @Override
    public Class<java.beans.PropertyChangeEvent> createNewSUT() {
        return java.beans.PropertyChangeEvent.class;
    }

}

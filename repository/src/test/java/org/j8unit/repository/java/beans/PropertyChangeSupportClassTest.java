package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PropertyChangeSupportClassTest
implements org.j8unit.repository.java.beans.PropertyChangeSupportClassTests<java.beans.PropertyChangeSupport> {

    @Override
    public Class<java.beans.PropertyChangeSupport> createNewSUT() {
        return java.beans.PropertyChangeSupport.class;
    }

}

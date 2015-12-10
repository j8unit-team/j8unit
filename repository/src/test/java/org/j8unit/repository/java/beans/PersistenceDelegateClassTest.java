package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PersistenceDelegateClassTest
implements org.j8unit.repository.java.beans.PersistenceDelegateClassTests<java.beans.PersistenceDelegate> {

    @Override
    public Class<java.beans.PersistenceDelegate> createNewSUT() {
        return java.beans.PersistenceDelegate.class;
    }

}

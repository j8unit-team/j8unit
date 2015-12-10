package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultPersistenceDelegateClassTest
implements org.j8unit.repository.java.beans.DefaultPersistenceDelegateClassTests<java.beans.DefaultPersistenceDelegate> {

    @Override
    public Class<java.beans.DefaultPersistenceDelegate> createNewSUT() {
        return java.beans.DefaultPersistenceDelegate.class;
    }

}

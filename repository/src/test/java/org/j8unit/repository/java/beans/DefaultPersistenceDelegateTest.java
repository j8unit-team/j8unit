package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultPersistenceDelegateTest
implements org.j8unit.repository.java.beans.DefaultPersistenceDelegateTests<java.beans.DefaultPersistenceDelegate> {

    @Override
    public java.beans.DefaultPersistenceDelegate createNewSUT() {
        return new java.beans.DefaultPersistenceDelegate();
    }

}

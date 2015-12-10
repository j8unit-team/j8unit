package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SimpleBeanInfoTest
implements org.j8unit.repository.java.beans.SimpleBeanInfoTests<java.beans.SimpleBeanInfo> {

    @Override
    public java.beans.SimpleBeanInfo createNewSUT() {
        return new java.beans.SimpleBeanInfo();
    }

}

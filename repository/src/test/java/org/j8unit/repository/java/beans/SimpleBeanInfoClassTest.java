package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SimpleBeanInfoClassTest
implements org.j8unit.repository.java.beans.SimpleBeanInfoClassTests<java.beans.SimpleBeanInfo> {

    @Override
    public Class<java.beans.SimpleBeanInfo> createNewSUT() {
        return java.beans.SimpleBeanInfo.class;
    }

}

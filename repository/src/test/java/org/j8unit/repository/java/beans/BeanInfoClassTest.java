package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeanInfoClassTest
implements org.j8unit.repository.java.beans.BeanInfoClassTests<java.beans.BeanInfo> {

    @Override
    public Class<java.beans.BeanInfo> createNewSUT() {
        return java.beans.BeanInfo.class;
    }

}

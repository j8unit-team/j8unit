package org.j8unit.repository.java.beans;

import java.beans.BeanInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeanInfoClassTest
implements org.j8unit.repository.java.beans.BeanInfoClassTests<BeanInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.BeanInfo]

    @Override
    public Class<BeanInfo> createNewSUT() {
        return BeanInfo.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.BeanInfo]

}

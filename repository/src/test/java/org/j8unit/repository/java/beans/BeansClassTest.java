package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeansClassTest
implements org.j8unit.repository.java.beans.BeansClassTests<java.beans.Beans> {

    @Override
    public Class<java.beans.Beans> createNewSUT() {
        return java.beans.Beans.class;
    }

}

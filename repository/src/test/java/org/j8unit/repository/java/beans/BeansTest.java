package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BeansTest
implements org.j8unit.repository.java.beans.BeansTests<java.beans.Beans> {

    @Override
    public java.beans.Beans createNewSUT() {
        return new java.beans.Beans();
    }

}

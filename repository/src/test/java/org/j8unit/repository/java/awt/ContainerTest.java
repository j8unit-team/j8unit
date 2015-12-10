package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ContainerTest
implements org.j8unit.repository.java.awt.ContainerTests<java.awt.Container> {

    @Override
    public java.awt.Container createNewSUT() {
        return new java.awt.Container();
    }

}

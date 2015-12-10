package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ContainerClassTest
implements org.j8unit.repository.java.awt.ContainerClassTests<java.awt.Container> {

    @Override
    public Class<java.awt.Container> createNewSUT() {
        return java.awt.Container.class;
    }

}

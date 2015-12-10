package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompositeClassTest
implements org.j8unit.repository.java.awt.CompositeClassTests<java.awt.Composite> {

    @Override
    public Class<java.awt.Composite> createNewSUT() {
        return java.awt.Composite.class;
    }

}

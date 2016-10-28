package org.j8unit.repository.java.awt;

import java.awt.Composite;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompositeClassTest
implements org.j8unit.repository.java.awt.CompositeClassTests<Composite> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.Composite]

    @Override
    public Class<Composite> createNewSUT() {
        return Composite.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.Composite]

}

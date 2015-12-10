package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LabelClassTest
implements org.j8unit.repository.java.awt.LabelClassTests<java.awt.Label> {

    @Override
    public Class<java.awt.Label> createNewSUT() {
        return java.awt.Label.class;
    }

}

package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ChoiceClassTest
implements org.j8unit.repository.java.awt.ChoiceClassTests<java.awt.Choice> {

    @Override
    public Class<java.awt.Choice> createNewSUT() {
        return java.awt.Choice.class;
    }

}

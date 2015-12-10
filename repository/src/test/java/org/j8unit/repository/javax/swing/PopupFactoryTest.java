package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PopupFactoryTest
implements org.j8unit.repository.javax.swing.PopupFactoryTests<javax.swing.PopupFactory> {

    @Override
    public javax.swing.PopupFactory createNewSUT() {
        return new javax.swing.PopupFactory();
    }

}

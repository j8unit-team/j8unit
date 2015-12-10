package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PopupFactoryClassTest
implements org.j8unit.repository.javax.swing.PopupFactoryClassTests<javax.swing.PopupFactory> {

    @Override
    public Class<javax.swing.PopupFactory> createNewSUT() {
        return javax.swing.PopupFactory.class;
    }

}

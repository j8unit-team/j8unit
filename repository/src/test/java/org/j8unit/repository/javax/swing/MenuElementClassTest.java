package org.j8unit.repository.javax.swing;

import javax.swing.MenuElement;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MenuElementClassTest
implements org.j8unit.repository.javax.swing.MenuElementClassTests<MenuElement> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.MenuElement]

    @Override
    public Class<MenuElement> createNewSUT() {
        return MenuElement.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.MenuElement]

}

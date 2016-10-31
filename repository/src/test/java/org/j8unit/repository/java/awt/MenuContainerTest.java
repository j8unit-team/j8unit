package org.j8unit.repository.java.awt;

import java.awt.MenuContainer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MenuContainerTest
implements org.j8unit.repository.java.awt.MenuContainerTests<MenuContainer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.MenuContainer]

    @Override
    public MenuContainer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.MenuContainer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.MenuContainer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.MenuContainer]

}

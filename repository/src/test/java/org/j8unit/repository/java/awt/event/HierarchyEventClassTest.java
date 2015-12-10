package org.j8unit.repository.java.awt.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HierarchyEventClassTest
implements org.j8unit.repository.java.awt.event.HierarchyEventClassTests<java.awt.event.HierarchyEvent> {

    @Override
    public Class<java.awt.event.HierarchyEvent> createNewSUT() {
        return java.awt.event.HierarchyEvent.class;
    }

}

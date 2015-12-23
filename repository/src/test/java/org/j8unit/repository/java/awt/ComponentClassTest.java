package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ComponentClassTest
implements org.j8unit.repository.java.awt.ComponentClassTests<java.awt.Component> {

    @Override
    public Class<java.awt.Component> createNewSUT() {
        return java.awt.Component.class;
    }

    @RunWith(J8Unit4.class)
    public static class BaselineResizeBehaviorClassTest
    implements org.j8unit.repository.java.awt.ComponentClassTests.BaselineResizeBehaviorClassTests<java.awt.Component.BaselineResizeBehavior> {

        @Override
        public Class<java.awt.Component.BaselineResizeBehavior> createNewSUT() {
            return java.awt.Component.BaselineResizeBehavior.class;
        }

    }

}

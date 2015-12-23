package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ResourceBundleClassTest
implements org.j8unit.repository.java.util.ResourceBundleClassTests<java.util.ResourceBundle> {

    @Override
    public Class<java.util.ResourceBundle> createNewSUT() {
        return java.util.ResourceBundle.class;
    }

    @RunWith(J8Unit4.class)
    public static class ControlClassTest
    implements org.j8unit.repository.java.util.ResourceBundleClassTests.ControlClassTests<java.util.ResourceBundle.Control> {

        @Override
        public Class<java.util.ResourceBundle.Control> createNewSUT() {
            return java.util.ResourceBundle.Control.class;
        }

    }

}

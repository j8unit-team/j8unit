package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VisibilityClassTest
implements org.j8unit.repository.java.beans.VisibilityClassTests<java.beans.Visibility> {

    @Override
    public Class<java.beans.Visibility> createNewSUT() {
        return java.beans.Visibility.class;
    }

}

package org.j8unit.repository.java.beans;

import java.beans.Visibility;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class VisibilityClassTest
implements org.j8unit.repository.java.beans.VisibilityClassTests<Visibility> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.Visibility]

    @Override
    public Class<Visibility> createNewSUT() {
        return Visibility.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.beans.Visibility]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.Visibility]

}

package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IntrospectorClassTest
implements org.j8unit.repository.java.beans.IntrospectorClassTests<java.beans.Introspector> {

    @Override
    public Class<java.beans.Introspector> createNewSUT() {
        return java.beans.Introspector.class;
    }

}

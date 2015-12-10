package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConstructorPropertiesClassTest
implements org.j8unit.repository.java.beans.ConstructorPropertiesClassTests<java.beans.ConstructorProperties> {

    @Override
    public Class<java.beans.ConstructorProperties> createNewSUT() {
        return java.beans.ConstructorProperties.class;
    }

}

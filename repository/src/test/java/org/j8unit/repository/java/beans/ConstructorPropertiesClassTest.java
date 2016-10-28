package org.j8unit.repository.java.beans;

import java.beans.ConstructorProperties;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConstructorPropertiesClassTest
implements org.j8unit.repository.java.beans.ConstructorPropertiesClassTests<ConstructorProperties> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.beans.ConstructorProperties]

    @Override
    public Class<ConstructorProperties> createNewSUT() {
        return ConstructorProperties.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.beans.ConstructorProperties]

}

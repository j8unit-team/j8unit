package org.j8unit.repository.java.lang.reflect;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ModifierClassTest
implements org.j8unit.repository.java.lang.reflect.ModifierClassTests<java.lang.reflect.Modifier> {

    @Override
    public Class<java.lang.reflect.Modifier> createNewSUT() {
        return java.lang.reflect.Modifier.class;
    }

}

package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.Field;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FieldClassTest
implements org.j8unit.repository.java.lang.reflect.FieldClassTests<Field> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.Field]

    @Override
    public Class<Field> createNewSUT() {
        return Field.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.reflect.Field]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.Field]

}

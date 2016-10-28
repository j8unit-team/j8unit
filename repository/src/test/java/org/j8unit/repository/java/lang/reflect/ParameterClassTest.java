package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.Parameter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ParameterClassTest
implements org.j8unit.repository.java.lang.reflect.ParameterClassTests<Parameter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.Parameter]

    @Override
    public Class<Parameter> createNewSUT() {
        return Parameter.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.Parameter]

}

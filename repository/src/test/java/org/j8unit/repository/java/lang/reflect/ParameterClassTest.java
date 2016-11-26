package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.Parameter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Parameter} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.lang.reflect.ParameterClassTests}).
 */
@RunWith(J8Unit4.class)
public class ParameterClassTest
implements ParameterClassTests<Parameter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.reflect.Parameter]

    @Override
    public Class<Parameter> createNewSUT() {
        return Parameter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.reflect.Parameter]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.reflect.Parameter]

}

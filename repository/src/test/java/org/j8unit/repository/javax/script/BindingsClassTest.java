package org.j8unit.repository.javax.script;

import javax.script.Bindings;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Bindings} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.script.BindingsClassTests}).
 */
@RunWith(J8Unit4.class)
public class BindingsClassTest
implements BindingsClassTests<Bindings> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.script.Bindings]

    @Override
    public Class<Bindings> createNewSUT() {
        return Bindings.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.script.Bindings]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.script.Bindings]

}

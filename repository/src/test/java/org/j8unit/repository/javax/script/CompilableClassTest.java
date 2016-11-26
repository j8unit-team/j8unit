package org.j8unit.repository.javax.script;

import javax.script.Compilable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Compilable} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.script.CompilableClassTests}).
 */
@RunWith(J8Unit4.class)
public class CompilableClassTest
implements CompilableClassTests<Compilable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.script.Compilable]

    @Override
    public Class<Compilable> createNewSUT() {
        return Compilable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.script.Compilable]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.script.Compilable]

}

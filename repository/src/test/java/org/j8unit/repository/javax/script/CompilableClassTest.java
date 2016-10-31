package org.j8unit.repository.javax.script;

import javax.script.Compilable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompilableClassTest
implements org.j8unit.repository.javax.script.CompilableClassTests<Compilable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.script.Compilable]

    @Override
    public Class<Compilable> createNewSUT() {
        return Compilable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.script.Compilable]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.script.Compilable]

}

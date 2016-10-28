package org.j8unit.repository.javax.script;

import javax.script.Bindings;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BindingsClassTest
implements org.j8unit.repository.javax.script.BindingsClassTests<Bindings> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.script.Bindings]

    @Override
    public Class<Bindings> createNewSUT() {
        return Bindings.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.script.Bindings]

}

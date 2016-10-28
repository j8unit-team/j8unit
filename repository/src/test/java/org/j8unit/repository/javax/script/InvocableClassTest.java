package org.j8unit.repository.javax.script;

import javax.script.Invocable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvocableClassTest
implements org.j8unit.repository.javax.script.InvocableClassTests<Invocable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.script.Invocable]

    @Override
    public Class<Invocable> createNewSUT() {
        return Invocable.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.script.Invocable]

}

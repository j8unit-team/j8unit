package org.j8unit.repository.javax.script;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SimpleBindingsTest
implements org.j8unit.repository.javax.script.SimpleBindingsTests<javax.script.SimpleBindings> {

    @Override
    public javax.script.SimpleBindings createNewSUT() {
        return new javax.script.SimpleBindings();
    }

}

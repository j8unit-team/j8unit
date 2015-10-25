package org.j8unit.showcase.jm;

public class OldStyleTest2
extends ExtendableTests {

    @Override
    protected Foobar createNewSUT() {
        return new Foobar();
    }

}

package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BasicIconFactoryTest
implements org.j8unit.repository.javax.swing.plaf.basic.BasicIconFactoryTests<javax.swing.plaf.basic.BasicIconFactory> {

    @Override
    public javax.swing.plaf.basic.BasicIconFactory createNewSUT() {
        return new javax.swing.plaf.basic.BasicIconFactory();
    }

}

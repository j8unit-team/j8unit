package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AppendableClassTest
implements org.j8unit.repository.java.lang.AppendableClassTests<Appendable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.lang.Appendable]

    @Override
    public Class<Appendable> createNewSUT() {
        return Appendable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.lang.Appendable]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.lang.Appendable]

}

package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AppendableClassTest
implements org.j8unit.repository.java.lang.AppendableClassTests<java.lang.Appendable> {

    @Override
    public Class<java.lang.Appendable> createNewSUT() {
        return java.lang.Appendable.class;
    }

}

package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MultipleComponentProfileHelperClassTest
implements org.j8unit.repository.org.omg.IOP.MultipleComponentProfileHelperClassTests<org.omg.IOP.MultipleComponentProfileHelper> {

    @Override
    public Class<org.omg.IOP.MultipleComponentProfileHelper> createNewSUT() {
        return org.omg.IOP.MultipleComponentProfileHelper.class;
    }

}

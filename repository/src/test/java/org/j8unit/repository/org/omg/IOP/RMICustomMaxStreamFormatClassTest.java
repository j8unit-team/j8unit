package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RMICustomMaxStreamFormatClassTest
implements org.j8unit.repository.org.omg.IOP.RMICustomMaxStreamFormatClassTests<org.omg.IOP.RMICustomMaxStreamFormat> {

    @Override
    public Class<org.omg.IOP.RMICustomMaxStreamFormat> createNewSUT() {
        return org.omg.IOP.RMICustomMaxStreamFormat.class;
    }

}

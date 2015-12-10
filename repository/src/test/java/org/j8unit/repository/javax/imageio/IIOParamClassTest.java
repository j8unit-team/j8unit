package org.j8unit.repository.javax.imageio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IIOParamClassTest
implements org.j8unit.repository.javax.imageio.IIOParamClassTests<javax.imageio.IIOParam> {

    @Override
    public Class<javax.imageio.IIOParam> createNewSUT() {
        return javax.imageio.IIOParam.class;
    }

}

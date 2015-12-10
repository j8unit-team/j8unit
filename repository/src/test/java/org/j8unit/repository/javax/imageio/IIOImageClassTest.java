package org.j8unit.repository.javax.imageio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IIOImageClassTest
implements org.j8unit.repository.javax.imageio.IIOImageClassTests<javax.imageio.IIOImage> {

    @Override
    public Class<javax.imageio.IIOImage> createNewSUT() {
        return javax.imageio.IIOImage.class;
    }

}

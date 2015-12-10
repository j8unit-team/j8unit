package org.j8unit.repository.javax.imageio;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IIOImageTest
implements org.j8unit.repository.javax.imageio.IIOImageTests<javax.imageio.IIOImage> {

    @Override
    public javax.imageio.IIOImage createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.imageio.IIOImage] available.");
    }

}

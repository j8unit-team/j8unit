package org.j8unit.repository.java.awt.image;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SampleModelClassTest
implements org.j8unit.repository.java.awt.image.SampleModelClassTests<java.awt.image.SampleModel> {

    @Override
    public Class<java.awt.image.SampleModel> createNewSUT() {
        return java.awt.image.SampleModel.class;
    }

}

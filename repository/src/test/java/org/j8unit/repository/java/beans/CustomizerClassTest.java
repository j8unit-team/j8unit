package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CustomizerClassTest
implements org.j8unit.repository.java.beans.CustomizerClassTests<java.beans.Customizer> {

    @Override
    public Class<java.beans.Customizer> createNewSUT() {
        return java.beans.Customizer.class;
    }

}

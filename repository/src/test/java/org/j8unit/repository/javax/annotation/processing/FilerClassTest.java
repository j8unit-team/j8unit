package org.j8unit.repository.javax.annotation.processing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FilerClassTest
implements org.j8unit.repository.javax.annotation.processing.FilerClassTests<javax.annotation.processing.Filer> {

    @Override
    public Class<javax.annotation.processing.Filer> createNewSUT() {
        return javax.annotation.processing.Filer.class;
    }

}

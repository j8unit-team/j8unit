package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.Filer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FilerClassTest
implements org.j8unit.repository.javax.annotation.processing.FilerClassTests<Filer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.annotation.processing.Filer]

    @Override
    public Class<Filer> createNewSUT() {
        return Filer.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.annotation.processing.Filer]

}

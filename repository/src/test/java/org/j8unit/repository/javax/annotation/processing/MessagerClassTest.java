package org.j8unit.repository.javax.annotation.processing;

import javax.annotation.processing.Messager;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MessagerClassTest
implements org.j8unit.repository.javax.annotation.processing.MessagerClassTests<Messager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.annotation.processing.Messager]

    @Override
    public Class<Messager> createNewSUT() {
        return Messager.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.annotation.processing.Messager]

}

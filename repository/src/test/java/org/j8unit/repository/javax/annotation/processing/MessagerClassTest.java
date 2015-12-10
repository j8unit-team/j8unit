package org.j8unit.repository.javax.annotation.processing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MessagerClassTest
implements org.j8unit.repository.javax.annotation.processing.MessagerClassTests<javax.annotation.processing.Messager> {

    @Override
    public Class<javax.annotation.processing.Messager> createNewSUT() {
        return javax.annotation.processing.Messager.class;
    }

}

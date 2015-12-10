package org.j8unit.repository.javax.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MimeTypeTest
implements org.j8unit.repository.javax.activation.MimeTypeTests<javax.activation.MimeType> {

    @Override
    public javax.activation.MimeType createNewSUT() {
        return new javax.activation.MimeType();
    }

}

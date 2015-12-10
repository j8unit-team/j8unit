package org.j8unit.repository.javax.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MimeTypeParseExceptionTest
implements org.j8unit.repository.javax.activation.MimeTypeParseExceptionTests<javax.activation.MimeTypeParseException> {

    @Override
    public javax.activation.MimeTypeParseException createNewSUT() {
        return new javax.activation.MimeTypeParseException();
    }

}

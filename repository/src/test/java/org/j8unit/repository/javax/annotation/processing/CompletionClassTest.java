package org.j8unit.repository.javax.annotation.processing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompletionClassTest
implements org.j8unit.repository.javax.annotation.processing.CompletionClassTests<javax.annotation.processing.Completion> {

    @Override
    public Class<javax.annotation.processing.Completion> createNewSUT() {
        return javax.annotation.processing.Completion.class;
    }

}

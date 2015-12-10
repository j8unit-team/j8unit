package org.j8unit.repository.javax.annotation.processing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CompletionsClassTest
implements org.j8unit.repository.javax.annotation.processing.CompletionsClassTests<javax.annotation.processing.Completions> {

    @Override
    public Class<javax.annotation.processing.Completions> createNewSUT() {
        return javax.annotation.processing.Completions.class;
    }

}

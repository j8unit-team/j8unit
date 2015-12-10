package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class CompletionStageClassTest
implements org.j8unit.repository.java.util.concurrent.CompletionStageClassTests<java.util.concurrent.CompletionStage> {

    @Override
    public Class<java.util.concurrent.CompletionStage> createNewSUT() {
        return java.util.concurrent.CompletionStage.class;
    }

}

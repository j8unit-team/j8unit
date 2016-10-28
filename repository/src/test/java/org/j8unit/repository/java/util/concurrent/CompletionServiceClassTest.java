package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.CompletionService;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class CompletionServiceClassTest
implements org.j8unit.repository.java.util.concurrent.CompletionServiceClassTests<CompletionService> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.CompletionService]

    @Override
    public Class<CompletionService> createNewSUT() {
        return CompletionService.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.CompletionService]

}

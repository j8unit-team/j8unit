package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.IOP.TransactionService;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TransactionService} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.IOP.TransactionServiceClassTests}).
 */

@RunWith(J8Unit4.class)
public class TransactionServiceClassTest
implements TransactionServiceClassTests<TransactionService> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.IOP.TransactionService]

    @Override
    public Class<TransactionService> createNewSUT() {
        return TransactionService.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.IOP.TransactionService]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.IOP.TransactionService]

}

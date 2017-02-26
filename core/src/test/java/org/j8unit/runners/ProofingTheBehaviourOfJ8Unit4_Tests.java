package org.j8unit.runners;

import org.junit.BeforeClass;
import org.junit.runner.Runner;
import org.junit.runners.model.InitializationError;

public class ProofingTheBehaviourOfJ8Unit4_Tests
extends ProofingTheBehaviourOfJ8BlockJUnit4ClassRunner_Tests {

    @Override
    protected Runner getRunner(final Class<?> clazz)
    throws InitializationError {
        return new J8Unit4(clazz);
    }

    @Override
    protected Class<? extends Runner> getRunnerClass() {
        return J8Unit4.class;
    }

    @BeforeClass
    public static void legend() {
        System.out.println("+------------------------------------------------------+");
        System.out.println("| Behaviour of the default J8Unit Test Runner          |");
        System.out.println("| Legend:                                              |");
        System.out.println("+------------------------------------------------------+");
        System.out.println("| [c✓] Intended Construction Behaviour                 |");
        System.out.println("| [c✗] Missing Construction Behaviour                  |");
        System.out.println("| [t✓] Intended Test Method Exploration Behaviour      |");
        System.out.println("| [t✗] Missing Test Method Exploration Behaviour       |");
        System.out.println("| [t!] Additional Behaviour (in comparision to JUnit4) |");
        System.out.println("|                                                      |");
        System.out.println("| black ... can be created and execute tests           |");
        System.out.println("| red ..... cannot be created and/or execute tests     |");
        System.out.println("+------------------------------------------------------+");
    }

}

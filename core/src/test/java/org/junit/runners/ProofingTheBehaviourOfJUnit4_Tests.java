package org.junit.runners;

import org.junit.BeforeClass;
import org.junit.runner.Runner;
import org.junit.runners.model.InitializationError;

/**
 * TODO (Issue #58): Also proof behaviour of {@link BlockJUnit4ClassRunner}
 */
public class ProofingTheBehaviourOfJUnit4_Tests
extends ProofingTheBehaviourOfBlockJUnit4ClassRunner_Tests {

    @Override
    protected Runner getRunner(final Class<?> clazz)
    throws InitializationError {
        return new JUnit4(clazz);
    }

    @Override
    protected Class<? extends Runner> getRunnerClass() {
        return JUnit4.class;
    }

    @BeforeClass
    public static void legend() {
        System.out.println("+--------------------------------------------------+");
        System.out.println("| Behaviour of the default JUnit4 Test Runner      |");
        System.out.println("| Legend:                                          |");
        System.out.println("+--------------------------------------------------+");
        System.out.println("| [c✓] Intended Construction Behaviour             |");
        System.out.println("| [c✗] Missing Construction Behaviour              |");
        System.out.println("| [t✓] Intended Test Method Exploration Behaviour  |");
        System.out.println("| [t✗] Missing Test Method Exploration Behaviour   |");
        System.out.println("|                                                  |");
        System.out.println("| black ... can be created and execute tests       |");
        System.out.println("| red ..... cannot be created and/or execute tests |");
        System.out.println("+--------------------------------------------------+");
    }

}

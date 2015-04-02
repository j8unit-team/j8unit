package de.informaticum.java8.junit.showcase4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ de.informaticum.java8.junit.showcase1a.FoobarTest.class, de.informaticum.java8.junit.showcase1b.FoobarTest.class, de.informaticum.java8.junit.showcase1c.FoobarTest.class,
               de.informaticum.java8.junit.showcase2a.FoobarTest.class, de.informaticum.java8.junit.showcase2b.FoobarTest.class, de.informaticum.java8.junit.showcase2c.FoobarTest.class,
               de.informaticum.java8.junit.showcase3a.FoobarTest.class, de.informaticum.java8.junit.showcase3b.FoobarTest.class, de.informaticum.java8.junit.showcase3c.FoobarTest.class })
public class AllFoobarTests {

}

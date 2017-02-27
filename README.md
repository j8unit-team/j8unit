# [](#J8Unit)J8Unit And The J8Unit Repository

J8Unit combines the power of JUnit4 and Java 8. As a result, it comes along with:

* some **fancy assert** methods that can take _[CharSequence](https://docs.oracle.com/javase/8/docs/api/java/lang/CharSequence.html)_
  or _[Supplier<? extends CharSequence>](https://docs.oracle.com/javase/8/docs/api/java/util/function/Supplier.html)_ as its
  _[AssertionError](https://docs.oracle.com/javase/8/docs/api/java/lang/AssertionError.html)_ message,
* a **Java-8-enabled TestClass model** that (in addition to the JUnit4 model) detects test methods which are specified as _default_ _interface_ methods,
* few **additional test runners** that (in addition to the JUnit4 runners) execute test methods which are specified as _default_ _interface_ methods,
* a **repository of reusable tests** (called the J8Unit Repository) that contains an instantly growing number of reusable tests.

The next sections give a briefly summary of these features. Each feature's extended description is given on a separate page.  

## [](#J8UnitTestClassModel)Java-8-Based TestClass Model

In addition to the [JUnit4 TestClass model](http://junit.org/junit4/javadoc/4.12/org/junit/runners/model/TestClass.html), J8Unit is able to detect 
test methods which are specified as _default_ _interface_ methods:

```java
package org.junit8.examples;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public interface ReusableTests {

  @Test
  public void foo() {
    /* arrange */
    // [...]
    /* act */
    // [...]
    /* assert */
    assertTrue(...);
  }

}
```

The [J8Unit TestClass model](https://github.com/j8unit-team/j8unit/blob/master/core/src/main/java/org/j8unit/runners/model/J8TestClass.java) simply scans for all
_[@Test](http://junit.org/junit4/javadoc/4.12/org/junit/Test.html)_ annotated _default_ methods of each (either directly or indirectly) implemented interface of
given test class.

In result, this 

In result, any [test runner](#J8UnitTestRunners) that uses the J8Unit TestClass model is able to execute these tests too.

## [](#J8UnitTestRunners)The J8Unit Test Runners

### [](#J8Unit4)J8BlockJUnit4ClassRunner & J8Unit4

### [](#J8Parameterized)J8Parameterized

### [](#APIConformance)APIConformance


... thus, they allow allow reusage of test methods independently of your test class hierarchy.

## [](#J8UnitRepository)The J8Unit Repository

Because of the [Java-8-enabled TestClass model](#J8UnitTestClassModel), J8Unit provides a very smart way to reuse tests 

Currently, we work hard on a j8unit test interface repository.
Once it is finished, we want to provide reusable test for any accessible method of any class, enum, interface, or annotation of JDK 8.

Until now, any SDK 8 type has an according dummy j8unit test interface.
The first repository release is coming soon and will provide few basic test methods.

After the first repository release, we want to invite others to help us increasing the test coverage by providing implementations of the dummy test methods.

*If you are interested in helping, come back in January 2016. We will provide any required information to get your code into j8unit repository.*

## [](#J8UnitAsserts)Additional Assert Methods (a.k.a. On-Demand Failure Messages)

If you ever wanted to use [CharSequence](docs.oracle.com/javase/8/docs/api/java/lang/CharSequence.html) messages when 
After all is said and done you fell asleep as you are too tired to work further.
And then you get up th enext morning

# [](#J8UnitRoadMap)Roadmap

See the [open issues](https://github.com/j8unit-team/j8unit/issues) for a list of proposed features (and known issues).

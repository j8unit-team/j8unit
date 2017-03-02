# [](#j8unit-and-the-j8unit-repository)J8Unit And The J8Unit Repository

J8Unit combines the power of JUnit4 and Java 8.
Shortly spoken, it comes along with:

* some **fancy assert** methods
  that can take _[CharSequence](https://docs.oracle.com/javase/8/docs/api/java/lang/CharSequence.html)_ or
  _[Supplier<? extends CharSequence>](https://docs.oracle.com/javase/8/docs/api/java/util/function/Supplier.html)_ as
  its _[AssertionError](https://docs.oracle.com/javase/8/docs/api/java/lang/AssertionError.html)_ message,
* a **extended TestClass model**
  that (in addition to the JUnit4 model) detects test methods which are specified as _default_ _interface_ methods,
* a Java-8-based **reusable Tests API**
  that (a) allows API developer to publish their API with accompanying tests
  and (b) allows programmer to verify its custom implementations against these behaviour expectations,
* few **additional test runners**
  that (in addition to the JUnit4 runners) execute test methods which are specified as _default_ _interface_ methods,
* a **repository of reusable tests** (called the J8Unit Repository)
  that contains an instantly growing number of reusable tests that relate to all Java types of Java 8. 

You can read a brief 2-minute description right here in the below sections.

Spiced with few more information, you can read a condensed 10-minute description in [J8Unit in a nutshell](J8UnitInANutshell.md).
Depending on whether you are using an existing API or you are programming a new API, you should focus on the according chapter.

If you are interested in details, [...TODO+LINKS+ETC...](J8TestClass).

Last, but not least -- if your are interested in contributing to J8Unit, ...TODO...

## [](#java-8-based-testclass-model)Java-8-Based TestClass Model

One of the new features of Java 8 is the _default_ implementation of _interface_ methods.
Obviously, such methods can be tests too; However, JUnit4 does not detect these methods.
Fortunately, the [JUnit4 TestClass model](http://junit.org/junit4/javadoc/latest/org/junit/runners/model/TestClass.html)
only needs a slightly modification to do so.

The [J8Unit TestClass model](https://github.com/j8unit-team/j8unit/blob/master/core/src/main/java/org/j8unit/runners/model/J8TestClass.java)
provides this indispensable extension just by additionally scanning for all _[@Test](http://junit.org/junit4/javadoc/latest/org/junit/Test.html)_
annotated _default_ methods -- unless overridden by a more specific method within the given test class or any of its
super classes.

In result, J8Unit allows you to group tests within certain interfaces.
**Even more, tests can be easily reused independently of a specific test class hierarchy.**

## [](#the-reusable-tests-api)The Reusable Tests API

Admittedly, reusing tests does not make sense if the behaviour is absolutely the same each time it is invoked.
Doing so would be nothing else than a multiple execution of the same test.

Hence, [J8Unit tests](https://github.com/j8unit-team/j8unit/blob/master/core/src/main/java/org/j8unit/J8UnitTest.java) usually base on a specific
type-under-test and, within each test execution, use an instance of it.

**If you are using an existing API** (by extending some API classes or implementing sone API interfaces), you should only provide instances of your
type-under-test and **reuse the accompanying J8Unit-based tests** of that API.
**If you are programming a new API**, you should also **provide such reusable J8Unit-based tests** in order to allow others to verify the conformance
of their implementations against your behaviour expectations.

## [](#the-j8unit-repository)The J8Unit Repository

Obviously, every custom Java class must conform to the related Java API.
Every implementation of a Java interface must conform to the interface's requirements, usually "specified" as JavaDoc.
In general, every overridden method must [conform to the requirements of the super type](https://en.wikipedia.org/wiki/Liskov_substitution_principle).

In addition, even the classes must conform to various expectations.

For example, all sub-types of [Throwable](https://docs.oracle.com/javase/8/docs/api/java/lang/Throwable.html) should provide a zero-argument
and a [String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)-argument constructor.
Obviously, this is a class-specific behaviour.
In general, all constraints referring to the provision of specific constructors (and its individual requirements) should be covered by according test methods.
(Note, this is not limited to constructors only; Just think of factory methods and further.)

For another example, [by virtue of the _AnnotationTypeElementDeclaration_ production, a method declaration in an annotation type declaration cannot have formal
parameters, type parameters, or a _throws_ clause (JLS, Sec.&thinsp;9.6.1](https://docs.oracle.com/javase/specs/jls/se8/html/jls-9.html#jls-9.6.1).
Obviously, this is a type-specific behaviour too; And it must be tested!
  
Since Java does not provide a J8Unit-based collection of reusable tests, the _J8Unit Repository_ has been created.
Currently, it contains more than 8.100 reusable J8Unit tests classes.
In order to make use of these tests, just add the J8Unit Repository to your test scope:

```xml
<dependency>
  <groupId>org.j8unit</groupId>
  <artifactId>repository</artifactId>
  <version>1.0.0</version>
  <scope>test</scope>
</dependency>
```

## [](#the-j8unit-test-runners)The J8Unit Test Runners

Unfortunately, JUnit4 does not provide injection of the test class model to be used; Thus, when running J8Unit tests you have to specify an according test runner
that is aware of the extended [J8Unit TestClass model](https://github.com/j8unit-team/j8unit/blob/master/core/src/main/java/org/j8unit/runners/model/J8TestClass.java).

J8Unit provides such runners for each common use case:

* for single test classes (**J8BlockJUnit4ClassRunner**, **J8Unit4**),
* for parameterised tests (**J8Parameterized**),
* for Spring projects (**J8SpringJUnit4ClassRunner**, **J8SpringJUnit4**),
* for an _automatic invocation of all suitable J8Unit tests_ that are provided by the J8Unit Repository and similar repositories (**APIConformance**).

In order to make use of these test runners, just add J8Unit Core to your test scope:

```xml
<dependency>
  <groupId>org.j8unit</groupId>
  <artifactId>core</artifactId>
  <version>4.12.1<version>
  <scope>test</scope>
</dependency>
```

To emphasise the last point again: **APIConformance** automatically invokes all suitable J8Unit tests.
We strongly recommend to consider the usage of this test runner.
Really! Give it a try ...
You will love the superduper combination with the J8Unit Repository.

## [](#additional-assert-methods)Additional Assert Methods

The current JUnit4 [Assert statements](http://junit.org/junit4/javadoc/latest/org/junit/Assert.html) are strongly coupled to
[String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)-based messages.

However, you might want to provide [CharSequence](https://docs.oracle.com/javase/8/docs/api/java/lang/CharSequence.html)-based
or [Supplier<? extends CharSequence>](https://docs.oracle.com/javase/8/docs/api/java/util/function/Supplier.html)-based messages
(a.k.a. on-demand messages).

The J8Unit [Assert](https://github.com/j8unit-team/j8unit/blob/master/core/src/main/java/org/j8unit/Assert.java) provides these additional assert methods.
Similar to the J8Unit runners, just add J8Unit Core to your test scope and you can use it:

```xml
<dependency>
  <groupId>org.j8unit</groupId>
  <artifactId>core</artifactId>
  <version>4.12.1<version>
  <scope>test</scope>
</dependency>
```

# [](#roadmap)Roadmap

See the [open issues](https://github.com/j8unit-team/j8unit/issues) for a list of proposed features (and known issues).

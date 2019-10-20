# Organism Java Improved Sequences Augmented

### Java. Enhanced.

![Duke](src/main/resources/media/images/duke.png)

This is the presentation about new additions in Java.  
Versions included are: Java 9, Java 10 and Java 11 LTS.  
Java 12 and Java 13 are omitted.  
Slides can be found in `resources/presentation` directory  

__P.S.__ _I DO NOT own any pictures of Duke.  
Duke appeared on slides out of his own will._  

## __Table of Contents__  

☕︎ __[Lost in Java Updates?](https://github.com/LizChe/organism-java-improved-sequences-augmented#lost-in-java-updates)__

☕︎ __[Wha' do ye mean ain't fer free?](https://github.com/LizChe/organism-java-improved-sequences-augmented#wha-do-ye-mean-aint-fer-free)__

☕︎ __[Collecting Garbage efficiently](https://github.com/LizChe/organism-java-improved-sequences-augmented#collecting-garbage-efficiently)__

☕︎ __[`>>> python3` no more](https://github.com/LizChe/organism-java-improved-sequences-augmented#-python-3-no-more)__

☕︎ __[Snug as a bug in a mug](https://github.com/LizChe/organism-java-improved-sequences-augmented#snug-as-a-bug-in-a-mug)__

## __Lost in Java Updates?__

This chapter is an introduction to the presentation.

__Approximate speech__:
> Java 8 was a revolutionary release in 2014.  
The features we take now for granted made Java easier to use, improved productivity and performance.  
However, the IT world doesn't stand in place.  
Java 8 happened 5 years ago and in 2020 Oracle will no longer update our beloved.  
Does it end here or this story has a happy continuation?  

## __Wha' do ye mean ain't fer free?__

This chapter focuses on the main differences between Oracle JDK and Open JDK.

__Approximate speech__:
> With Java 11, Oracle changes its' license from _Binary Code License_ to _General Public License v2 with the Classpath Exception_.
It means that using Oracle JDK that is being developed by Oracle is only allowed in development and test environments.
Any other use would imply buying the license. However, there is another option - Open JDK that is being developed not only by Oracle, Open JDK, and Java Community
but collaborated as well by IBM, Apple, Redhat, and other top-notch companies.

For more in-depth analysis, please, check the following links:

* [Oracle vs Open JDK](https://www.educba.com/oracle-vs-openjdk/)
* [Using Java 11 in Production. Important things to know](https://blog.jetbrains.com/idea/2018/09/using-java-11-in-production-important-things-to-know/)

## __Collecting Garbage efficiently__

In this chapter we will dive in main difference between Parallel Full GC and Garbage First GC.

__Approximate speech__:
> In Java 8 the default GC is Parallel Full Garbage Collector with Java 9 things change in favor of so-called G1.  
We all know the story of how JVM manages memory in Java 8. There is heap structure that looks as follow:

Young Generation | Old Generation | Permanent Generation
:-----------------------: | :--------------: | :---------------------:
Eden & Survivor Space | Tenured | Permanent

> Newly created objects live in the young generation, when the young generation is full, all survived objects are eventually moved
to the old generation.

>>So, what's so special about G1? The heap structure of Garbage First GC looks as follow:

| O |   | O | E | E | O
:---: | :---: | :---: | :---: | :---: | :---:
|   | __E__ | __O__ | __O__ |   | __S__
| __E__ | __O__ | __S__ |   | __O__
|   | __O__ | __E__ | __E__ | __O__ | __O__
| __O__ | __S__ | __S__ | __O__ | __O__
| __O__ | __O__ |   | __E__ |   | __O__

> Garbage First splits heap into many small regions. It still assigns the same roles (eden, survivor, old)
but there is no limit on how many of each we have.
After the marking phase, G1 knows which regions are almost empty and collects those first. The rest of alive objects
are being copied to unassigned space and become survivors or old, depending on what they were before (eden or survivors).
In case if the whole region was full of garbage, it becomes unassigned.

For more in-depth information, please, follow these links:

* [Java Garbage Collection Basics](https://www.oracle.com/webfolder/technetwork/tutorials/obe/java/gc01/index.html)
* [Getting Started with the G1 Garbage Collector](https://www.oracle.com/technetwork/tutorials/tutorials-1876574.html)
* [Understanding the G1 Garbage Collector – Java 9](https://www.dynatrace.com/news/blog/understanding-g1-garbage-collector-java-9)

## __`>>> python 3` no more__

This chapter is about JShell that was introduced with Java 9.

__Approximate speech__:
>JShell is a Read-Eval-Print Loop tool for exploring the Java language.

Commands to review:

1. Start the tool:

`jshell`

2. create method `greetJShell(String name)`:

```shell script
String greetJShell(String name) {
   ...> return name + " greets JShell!";
   ...> }
```

3. call created method:

```shell script
greetJShell("World") // no semicolon required!
```

4. getting help:

`/help`

5. listing created methods or variables:

`/v`
`/m`

6. saving workspace to a file:

```shell script
/save -all <file>
```

7. open file:

```shell script
/open <file>
```

8. Tab completion tool:

```shell script
System.out.<Tab>
```

9. exit the tool

`/exit`

> Important things to mention:
> - Checked exceptions are being wrapped for us automatically;
> - Whenever we insert a value in parameters or returning a value in a method, JShell automatically places the result in a variable.

For a short JShell tutorial go here:

* [Java Shell User’s Guide](https://docs.oracle.com/javase/9/jshell/toc.htm)
* [A Hands-on Session with JShell](https://blog.overops.com/java-9-early-access-a-hands-on-session-with-jshell-the-java-repl)

## __Snug as a bug in a mug__

This chapter has aims to get you comfortable with Java 11 features.
All the code will be provided in `com/codecool/organismjava` directory.

__Approximate speech__:

- Compile and run a single file in one line
  - there is no need in `javac` command anymore
  - in order to try this feature out navigate to `organismjava` directory
  - type: `java CompileMe.java`

- New features of String class can be found in `StringFeatures.java` class
  - `public String strip()`
  - `public String stripLeading()`
  - `public String stripTrailing()`
  - `public boolean isBlank()`
  - `public Stream<String> lines()`
  - `public String repeat(int count)`

- Additions to interfaces can be found in `InterfaceFeatures.java` class
  - private methods in interfaces are now possible with Java 9.

- Features of immutable collections can be found in `ImmutableCollectionFeatures.java` class
  - creating an immutable collection became easier

- Try with Resources improvement can be found in `TryWithResourcesImprovements.java` class
  - with Java 9 it is possible to use resource reference in try with resources

- New Optional methods can be found in `OptionalFeatures.java` class
  - `public void ifPresentOrElse​(Consumer<? super T> action, Runnable emptyAction)`
  - `public Optional<T> or​(Supplier<? extends Optional<? extends T>> supplier)`
  - `public Stream<T> stream​()`
  - `public boolean isEmpty()`

- Stream API features can be found in `StreamFeatures.java` class
  - `default Stream<T> takeWhile​(Predicate<? super T> predicate)`
  - `default Stream<T> dropWhile​(Predicate<? super T> predicate)`

- New Type `var` can be found in `VarType.java` class
  - Java 10 introduced a new type name available for our use

- New Files methods can be found in `FilesFeatures.java` class
  - `public static Path writeString​(Path path, CharSequence csq, OpenOption... options) throws IOException`
  - `public static String readString​(Path path) throws IOException`

For more information about possible questions related to this section, check these links:

* [String: `trim()` vs `strip()`](https://stackoverflow.com/questions/51266582/difference-between-string-trim-and-strip-methods-in-java-11)
* [List: `Arrays.asList()` vs `List.of()`](https://stackoverflow.com/questions/46579074/what-is-the-difference-between-list-of-and-arrays-aslist)

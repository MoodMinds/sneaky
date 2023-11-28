# Sneaky throwing and casting utilities

**Sneaky** is a utility library providing sneaky throwing and casting functions.

## In a Nutshell

**Sneaky** addresses the requirement for separate sneaky throwing and casting utility functions, necessary due to Java's
limitations, particularly in complex scenarios. The `Cast.cast` function resolves this issue, sparing you from the need to
cast explicitly and litter your code with `@SuppressWarnings("unchecked")` annotations. Additionally, the `Sneak.sneak`
function allows sneaky throwing of checked exceptions in situations where the Compiler restricts this, but it is not
restricted by the Runtime.

## Brief overview

Two main constituents of the **Sneaky**:

* `Cast.cast`: unchecked casting utility function
* `Sneak.sneak`: sneaky throwing utility function

**Let's examine the usage of the **Unchecked** by examples**:

```java
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static org.moodminds.sneaky.Cast.cast;
import static org.moodminds.sneaky.Sneak.sneak;

public class Sample {

    <V extends Number> V sample0() {
        return cast(new Random().nextDouble()); // cast the return value
    }

    String sample1() {
        try (Stream<String> lines = Files.lines(Paths.get(""))) {
            return lines.collect(joining());
        } catch (IOException e) {
            return sneak(e); // throw sneakily caught checked exception
        }
    }
}
```

## Getting Started

Include **Sneaky** in your project by adding the dependency.

## Maven configuration

Artifacts can be found on [Maven Central](https://search.maven.org/) after publication.

```xml
<dependency>
    <groupId>org.moodminds.sneaky</groupId>
    <artifactId>sneaky</artifactId>
    <version>${version}</version>
</dependency>
```

## Building from Source

You may need to build from source to use **Sneaky** (until it is in Maven Central) with Maven and JDK 1.8 at least.

## License
This project is going to be released under version 2.0 of the [Apache License][l].

[l]: https://www.apache.org/licenses/LICENSE-2.0
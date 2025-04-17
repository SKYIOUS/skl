# SKL (SKYIOUS KOTLIN LIBRARY)

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.skyious.skl/skl.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22io.github.skyious.skl%22%20AND%20a:%22skl%22)

SKL (SKYIOUS KOTLIN LIBRARY) is a new, growing library for Kotlin. Contributions are welcome!

## Features

*(This library is under active development. Please check the source code or upcoming documentation for available features.)*

## Setup

*   Java Development Kit (JDK) version 17 or higher.
*   Gradle (the project includes a Gradle wrapper `./gradlew`, so a separate installation isn't strictly necessary).

## Building

To build the project, run the following command in the root directory:

```bash
./gradlew build --warning-mode all --stacktrace
```

## Testing

To run the tests, use:

```bash
./gradlew test --warning-mode all --stacktrace
```

## Usage (Adding as a Dependency)

The library is published on Maven Central. You can find the latest version using the Maven Central badge above or by searching [here](https://search.maven.org/search?q=g:%22io.github.skyious.skl%22%20AND%20a:%22skl%22).

Add SKL to your Gradle project (Kotlin DSL):

```kotlin
repositories {
    mavenCentral()
}

dependencies {
    // Replace YOUR_VERSION with the latest version from Maven Central
    implementation("io.github.skyious.skl:skl:YOUR_VERSION")
}
```

For Maven:

```xml
<dependency>
  <groupId>io.github.skyious.skl</groupId>
  <artifactId>skl</artifactId>
  <!-- Replace YOUR_VERSION with the latest version from Maven Central -->
  <version>YOUR_VERSION</version>
</dependency>
```

## Contributing

Contributions are encouraged! Please feel free to submit pull requests or open issues on the [GitHub repository](https://github.com/SKYIOUS/skl/).

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details. 
# unittest

A minimal JUnit 5 example using the classic odd/even check.

## Structure

```sh
unittest/
├── pom.xml
└── src/
    ├── main/java/com/example/
    │   └── OddEven.java        # Class under test
    └── test/java/com/example/
        └── OddEvenTest.java    # JUnit 5 test class
```

## How to run

```sh
cd unittest
mvn test
```

Expected output:

```text
[INFO] Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
[INFO] BUILD SUCCESS
```

# Google Think Benchmark

This project is a performance benchmark for different versions of the Google Think library, specifically focusing on the `AesGcmJce` class. 
It uses the Java Microbenchmark Harness (JMH) to measure the performance of the `encrypt` method.

## Prerequisites

- Java Development Kit (JDK) 8 or later
- sbt (Scala Build Tool)

## Getting Started

1. Clone the repository:

```bash
git clone https://github.com/bjornjorgensen/GoogleThinkBenchmark.git
cd GoogleThinkBenchmark
```


Update the Tink version (optional):
If you want to benchmark a specific version of Google Tink, update the version number in the build.sbt file:

"com.google.crypto.tink" % "tink" % "YOUR_DESIRED_VERSION"

Reload the sbt project:
```bash
sbt reload
```

Run the benchmark
```bash
sbt jmh:run
```

This command will compile and run the benchmark, and the results will be displayed in the terminal.

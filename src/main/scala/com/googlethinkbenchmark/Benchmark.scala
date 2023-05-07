package com.googlethinkbenchmark

import java.util.concurrent.TimeUnit
import org.openjdk.jmh.annotations._
import com.google.crypto.tink.subtle.AesGcmJce

@State(Scope.Benchmark)
class GoogleThinkBenchmark {
  val valuesPerIteration = 100000
  val derivedKeyEncryptingKey: Array[Byte] =
    Array(119, -25, -98, 34, -61, 102, 101, -97, 86, -27, 25, 88, 94, -55, 40, -103)
  val ephemeralX25519PublicKey: Array[Byte] =
    Array(-94, 121, -27, 40, -42, -6, 114, 17, -11, 107, 58, -69, -69, -58,
      56, -121, 28, -18, 10, 25, 41, -66, 77, 17, 19, -99, -54, 54, 97, -111, -13, 77)
  val aadState: Array[Byte] =
    Array(97, 112, 112, 73, 100, -19, 84, 88, -18, -105, 104, 105, 29, -84,
      94, -110, 84, 38, -109, -85, -55)

  @Benchmark
  @BenchmarkMode(Array(Mode.AverageTime))
  @OutputTimeUnit(TimeUnit.NANOSECONDS)
  def testAesGcmJceEncrypt(): Unit = {
    for (_ <- 0L until valuesPerIteration) {
      new AesGcmJce(derivedKeyEncryptingKey).encrypt(ephemeralX25519PublicKey, aadState)
      }
    }
}

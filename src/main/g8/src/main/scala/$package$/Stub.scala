package $package$

import cats.effect.{IO, IOApp}

object Stub extends IOApp.Simple {
    val run = IO.println("Hello, World!")
}

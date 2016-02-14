#!/bin/bash
scalac Test.scala
java -cp /usr/share/scala-2.11/lib/scala-library.jar:. -XX:+UnlockDiagnosticVMOptions -XX:+PrintAssembly Main

jmutnum
===

[![Maven Central](https://img.shields.io/maven-central/v/com.io7m.jmutnum/com.io7m.jmutnum.svg?style=flat-square)](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22com.io7m.jmutnum%22)
[![Maven Central (snapshot)](https://img.shields.io/nexus/s/com.io7m.jmutnum/com.io7m.jmutnum?server=https%3A%2F%2Fs01.oss.sonatype.org&style=flat-square)](https://s01.oss.sonatype.org/content/repositories/snapshots/com/io7m/jmutnum/)
[![Codecov](https://img.shields.io/codecov/c/github/io7m-com/jmutnum.svg?style=flat-square)](https://codecov.io/gh/io7m-com/jmutnum)
![Java Version](https://img.shields.io/badge/17-java?label=java&color=e65cc3)

![com.io7m.jmutnum](./src/site/resources/jmutnum.jpg?raw=true)

| JVM | Platform | Status |
|-----|----------|--------|
| OpenJDK (Temurin) Current | Linux | [![Build (OpenJDK (Temurin) Current, Linux)](https://img.shields.io/github/actions/workflow/status/io7m-com/jmutnum/main.linux.temurin.current.yml)](https://www.github.com/io7m-com/jmutnum/actions?query=workflow%3Amain.linux.temurin.current)|
| OpenJDK (Temurin) LTS | Linux | [![Build (OpenJDK (Temurin) LTS, Linux)](https://img.shields.io/github/actions/workflow/status/io7m-com/jmutnum/main.linux.temurin.lts.yml)](https://www.github.com/io7m-com/jmutnum/actions?query=workflow%3Amain.linux.temurin.lts)|
| OpenJDK (Temurin) Current | Windows | [![Build (OpenJDK (Temurin) Current, Windows)](https://img.shields.io/github/actions/workflow/status/io7m-com/jmutnum/main.windows.temurin.current.yml)](https://www.github.com/io7m-com/jmutnum/actions?query=workflow%3Amain.windows.temurin.current)|
| OpenJDK (Temurin) LTS | Windows | [![Build (OpenJDK (Temurin) LTS, Windows)](https://img.shields.io/github/actions/workflow/status/io7m-com/jmutnum/main.windows.temurin.lts.yml)](https://www.github.com/io7m-com/jmutnum/actions?query=workflow%3Amain.windows.temurin.lts)|

## jmutnum

The `jmutnum` package provides trivial mutable boxed integer types.

## Features

* Mutable boxed integer types.
* Written in pure Java 21.
* High coverage test suite.
* [OSGi-ready](https://www.osgi.org/)
* [JPMS-ready](https://en.wikipedia.org/wiki/Java_Platform_Module_System)
* ISC license.

## Usage

The package exposes the following mutable boxed integer types:

* `MutableCharacterType`
* `MutableDoubleType`
* `MutableFloatType`
* `MutableIntegerType`
* `MutableLongType`
* `MutableShortType`


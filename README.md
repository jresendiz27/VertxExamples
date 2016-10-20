# Vertx Examples
------
### Slides and resourcs

All the slides and resources can be found at [my personal page](http://jresendiz27.github.io/resources/Vert.x.pdf)

------

### What do I need?
* JDK 8 or higher (Vert.x 3 uses Java 8 lambdas)
* A shell (*NIX environment desired)
* SDKMAN Installed [Information here!](http://sdkman.io/)
* Gradle (not really required, wrapper installed on the project)
* An IDE or Advanced Text Editor
* A database (Mongo db will be used for the examples, but any database could be fine)

------

### How can I start?

#### Step 0: Download this repo
```bash
git clone https://github.com/jresendiz27/VertxExamples.git
```
Or simply download the zip file and extract it.
#### Step1: Gradle 
_Consider using the gradle wrapper_

Run gradle _clean tasks_ to resolve dependencies and show all the related tasks.
```bash
./gradlew clean tasks
```
Many of the examples are going to be executed using the vertx client. This can be installed using sdk
```bash
sdk install vertx
```

To run an example you just need
```bash
vertx run MyVerticle.js
```

#### Step2: Consider switch branches.

The project contains four branches:

* VertxWorkshop/1: Basic stuff, getting started. 
* VertxWorkshop/2: Playing around with the event bus.
* VertxWorkshop/3: Getting distributed.
* VertxWorkshop/4: Getting your hands dirty.

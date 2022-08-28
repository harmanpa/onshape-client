Onshape API Java Clients
========================

This is a set of Java libraries for accessing the Onshape APIs from both cloud and
desktop applications.

Copyright 2018-Present Onshape Inc.

There are currently 2 versions, targeting different versions of jax-rs.

Onshape Endpoints
-----------------

For Java versions with javax.ws namespace.

[Javadoc documentation](http://harmanpa.github.io/onshape-client/onshape-endpoints/index.html?com/onshape/api/Onshape.html)

# Usage: Maven

To use from Maven, add the following to pom.xml:

```
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```

and

```
	<dependency>
	    <groupId>com.github.harmanpa.onshape-client</groupId>
	    <artifactId>onshape-endpoints</artifactId>
	    <version>v{{version}}</version>
	</dependency>
```

# Usage: Gradle

To use from Gradle, add the following to build.gradle:

```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

and

```
	dependencies {
	        implementation 'com.github.harmanpa.onshape-client:onshape-endpoints:v{{version}}'
	}
```

Onshape Endpoints Jakarta
-------------------------

For Java versions with jakarta.ws namespace.

[Javadoc documentation](http://harmanpa.github.io/onshape-client/onshape-endpoints-jakarta/index.html?com/onshape/api/Onshape.html)

# Usage: Maven

To use from Maven, add the following to pom.xml:

```
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```

and

```
	<dependency>
	    <groupId>com.github.harmanpa.onshape-client</groupId>
	    <artifactId>onshape-endpoints-jakarta</artifactId>
	    <version>v{{version}}</version>
	</dependency>
```

# Usage: Gradle

To use from Gradle, add the following to build.gradle:

```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

and

```
	dependencies {
	        implementation 'com.github.harmanpa.onshape-client:onshape-endpoints-jakarta:v{{version}}'
	}
```


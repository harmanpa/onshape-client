Onshape API Java Client
=======================

This is a Java library for accessing the Onshape APIs from both cloud and
desktop applications.

Copyright 2018-Present Onshape Inc.

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
	    <version>v1.151.6039.f7f355b6b537</version>
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
	        implementation 'com.github.harmanpa.onshape-client:onshape-endpoints-jakarta:v1.151.6039.f7f355b6b537'
	}
```


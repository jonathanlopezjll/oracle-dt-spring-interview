# Project Explanation

This is service that provides information about houses: basically their location and an estimation of their price.
Think of it as a very basic Zillow.

Exposes that information through a REST API.

* GET /houses
* POST /houses

## Docker image

Build:

```shell
./gradlew clean build -x test
docker image build -f src/main/docker/Dockerfile -t spring-project-review:1.0.0 .
```

Run:

```shell
docker run --rm -p 8080:8080 docker.io/library/spring-project-review:1.0.0
```

# transfer-knowlege-architecture

### Install intellij

[Intellij](https://www.jetbrains.com/pt-br/idea/download)

### Download Jdk 14

```sudo apt install openjdk-14-jdk -y```

### Change java version

```sudo update-alternatives --config java```
- Then Select jdk-14

### Download maven 3

```sudo apt install maven -y```
- or Download [MavenMirrors](https://maven.apache.org/download.cgi)

### Download yarn 

[Yarn](https://classic.yarnpkg.com/en/docs/install)

### Download docker

[Docker](https://docs.docker.com/engine/install/)

### Download docker-compose

[DockerCompose](https://docs.docker.com/compose/install/)

### Download Dbeaver

[Dbeaver](https://dbeaver.io/download/)

### Run postgres database

```docker run -p 7001:5432 --name transfer-knowlege-architecture-db -e POSTGRES_USER=root -e POSTGRES_PASSWORD=root -e POSTGRES_DB=transferKnowlegeArchitecture -d postgres```
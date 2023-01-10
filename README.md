# testloadpath

## how to compile

cd api

mvn clean install && cd ..

cd custom

mvn clean install && cd ..

cd server

mvn clean install && cd ..


## how to test

mkdir test
cp custom/target/testloadpath-custom-0.0.1-SNAPSHOT.jar test/


DEFAULT

java  -jar server/target/testloadpath-server-0.0.1-SNAPSHOT.jar

WITH CUSTOM BEHAVIOR

LOADER_PATH={you path here}/testloadpath/test/ java  -jar server/target/testloadpath-server-0.0.1-SNAPSHOT.jar


open browser at http://localhost:8080/test

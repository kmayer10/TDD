# TDD

mvn archetype:generate -DgroupId=com.thinknyx.app -DartifactId=factorial -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false


mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install -Dmaven.test.failure.ignore=false sonar:sonar

# TDD

mvn archetype:generate -DgroupId=com.thinknyx.app -DartifactId=factorial -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

mvn archetype:generate -DgroupId=com.thinknyx.web -DartifactId=java-web-project-vodafone  -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false

mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install -Dmaven.test.failure.ignore=false sonar:sonar

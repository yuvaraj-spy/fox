pipeline{
	agent any
	stages{
		stage('validate')
		{
			steps{
				echo "checking for pom.xml file"
			}
		}
		stage('build'){
			steps{
				sh 'mvn clean package'
			}
		}
		stage('jar file')
		{
			steps{
				sh 'java -jar target/MavenProject-0.0.2-SNAPSHOT.jar
			}
		}
	}
}

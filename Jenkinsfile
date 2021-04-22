pipeline {
	agent{label 'main'} 
	stages{
		stage('Github'){
			steps{
				git url: 'https://github.com/Zialo/GPI2.git'
			}
		}
		stage('Simple'){ 
			steps{
				echo 'SIMPLE'
				dir('Practica 4/Simple'){
					sh 'mvn compile'
					sh 'mvn test'
					sh 'mvn validate'
					sh 'mvn verify'		
					sh 'mvn site'			
				}
			}
		} 
		stage('Android'){ 
			steps{
				echo 'ANDROID'
				dir('Practica 3/Android'){
					sh './gradlew task compileDebugAndroidTestSources'
					sh './gradlew task compileDebugSources'
					sh './gradlew task compileDebugUnitTestSources'
					sh './gradlew task compileReleaseSources'
					sh './gradlew task compileReleaseUnitTestSources'
				}
			}
		} 
		stage('Arduino'){ 
			steps{
				echo 'ARDUINO'
				dir('Practica 3/Arduino'){
					sh 'make'
				}
			}
		} 
	}
}

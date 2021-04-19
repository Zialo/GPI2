pipeline {
	agent{label 'master'} 
	stages{
		stage('Fetch repository'){
			steps{
				git url: 'https://github.com/Zialo/GPI2.git'
			}
		}
		stage('Simple'){ 
			steps{
				echo 'SIMPLE'
				dir('simple'){
					sh 'mvn compile'
					sh 'mvn test'
					sh'mvn validate'
					sh'mvn verify'				
				}
			}
		} 
		stage('Android'){ 
			steps{
				echo 'ANDROID'
				dir('Practica 3/'){
					sh './gradlew tasks compileDebugAndroidTestSources'
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
				dir('Arduino-lopez111558'){
					sh 'make'
				}
			}
		} 
		stage('Simple Webapp'){ 
			steps{
				echo 'SIMPLE-WEBAPP'
				dir('simple-webapp'){
				
				}
			}
		} 
	}
}

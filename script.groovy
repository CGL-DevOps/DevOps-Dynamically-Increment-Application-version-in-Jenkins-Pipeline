#!/usr/bin/env groovy

def incrementVersion() {
   sh 'mvn build-helper:parse-version versions:set \
   -DnewVersion=\\\${parsedVersion.majorVersion}.\\\${paserdVersion.minorVersion}.\\\${parsedVersion.newIncrementalVersion} \
   versions:commit'
   def matcher = readFile('pom.xml') =~ '<version>(.+)</version>'
   def version = matcher[0][1]
   env.IMAGE_NAME = "$version-$BUILD_NUMBER"
   echo ${IMAGE_NAME}
}

def buildJar() {
    echo "building the application..."
    sh 'mvn clean package'
} 

def buildImage() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'Docker-credentials', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t jason8746/java-maven-app:${IMAGE_NAME} .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh 'docker push jason8746/java-maven-app:${IMAGE_NAME}'
    }
} 

def commitVersionUpdate(){
    withCredentials([usernamePassword(credentialsId: 'Github-Credentials', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'git config --global user.email "jason.guanlin.cao@gmail.com"'
        sh 'git config --global user.name "jason"'
        sh 'git status'
        sh 'git branch'

        sh "git remote set-url origin https://${USER}:${PASS}github.com/CGL-DevOps/DevOps-Dynamically-Increment-Application-version-in-Jenkins-Pipeline.git"
        sh 'git add .'
        sh 'git commit -m "ci:version bump'
        sh 'git push origin HEAD:my-multi-pipeline-webhook'
    }
}

def deployApp() {
    echo 'deploying the application...'
} 

def masterBranch(){
    BRANCH_NAME == "master"
}

return this

#!/usr/bin/env groovy

def gv

pipeline {
    agent any
    tools {
        maven 'Maven'
    }
    stages {
        stage("init") {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }
        stage("increment version") {
            steps {
                script {
                    gv.incrementVersion()

                }
            }
        }
        stage("build jar") {
            steps {
                script {
                    gv.buildJar()
                }
            }
        }
        stage("build image") {
            steps {
                script {
                    gv.buildImage()
                }
            }
        }

        stage ('commit version update'){
            steps {
                script {
                    gv.commitVersionUpdate()
                }
            }
        }
        stage("deploy") {
            when {
                expression {
                    gv.masterBranch()
                }
            }
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }
}

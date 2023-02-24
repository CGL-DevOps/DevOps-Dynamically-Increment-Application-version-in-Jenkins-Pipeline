### Dynamically Increment Application version in Jenkins Pipeline

### Technologies used:

Jenkins, Docker, Github, Git, Java, Maven

### Project Description:

1- Configure CI step: Increment patch version

2- Configure CI step: Build Java application and clean old artifacts

3- Configure CI step: Build Image with dynamic Docker Image Tag

4- Configure CI step: Push Image to private DockerHub repository

5- Configure CI step: Commit version update of Jenkins back to Git repository

6- Configure Jenkins pipeline to not trigger automatically on CI build commit to avoid commit loop

### Usage instructions:

###### Step 1: Increment patch version

![image](image/Screenshot%202023-02-24%20at%2012.34.00%20am.png)

###### Step 3: Configure Trigger token in Multi-pipeline in Jenkins UI

![image](image/Screenshot%202023-02-24%20at%2012.36.06%20am.png)

###### Step 5: Connect with Jenkins in Github project repository

![image](image/Screenshot%202023-02-24%20at%2012.46.07%20am.png)

![image](image/Screenshot%202023-02-24%20at%201.05.10%20am.png)

![image](image/Screenshot%202023-02-24%20at%201.05.25%20am.png)

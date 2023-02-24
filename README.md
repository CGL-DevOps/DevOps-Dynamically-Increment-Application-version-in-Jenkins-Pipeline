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

![image](image/Screenshot%202023-02-24%20at%2012.18.14%20pm.png)

###### Step 2: Build Java application and clean old artifacts

![image](image/Screenshot%202023-02-24%20at%2012.18.39%20pm.png)
![image](image/Screenshot%202023-02-24%20at%2012.18.19%20pm.png)

![image](image/Screenshot%202023-02-24%20at%2012.18.28%20pm.png)

###### Step 3: Build Image with dynamic Docker Image Tag

![image](image/Screenshot%202023-02-24%20at%2012.49.15%20pm.png)

###### Step 4:Push Image to private DockerHub repository

![image](image/Screenshot%202023-02-24%20at%2012.49.15%20pm.png)

###### Step 5:Commit version update of Jenkins back to Git repository

![image](image/Screenshot%202023-02-24%20at%2012.34.02%20pm.png)

###### Step 6:Configure Jenkins pipeline to not trigger automatically on CI build commit to avoid commit loop

![image](image/Screenshot%202023-02-24%20at%2012.35.00%20pm.png)
![image](image/Screenshot%202023-02-24%20at%2012.36.02%20pm.png)
![image](image/Screenshot%202023-02-24%20at%2012.53.37%20pm.png)

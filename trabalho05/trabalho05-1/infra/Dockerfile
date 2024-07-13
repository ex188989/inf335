# Dockerfile
FROM jenkins/jenkins:lts

# Install Docker inside the Jenkins container
USER root
RUN apt-get update && \
    apt-get install -y docker.io

# Switch back to the jenkins user
USER jenkins
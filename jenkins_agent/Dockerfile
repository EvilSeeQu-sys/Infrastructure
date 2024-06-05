# Użycie obrazu bazowego jenkins/ssh-agent:5.12.0-jdk17
FROM jenkins/ssh-agent:5.12.0-jdk17

# Ustawienie zmiennej środowiskowej DEBIAN_FRONTEND
ENV DEBIAN_FRONTEND=noninteractive

# Root
USER root

# Aktualizacja pakietów i instalacja wymaganych narzędzi
RUN apt-get update && apt-get install -y \
    curl \
    python3 \
    python3-pip \
    unzip \
    ansible \
    git \
    && rm -rf /var/lib/apt/lists/*

# Utworzenie i modyfikacja grupy docker
RUN groupadd -g 997 docker && usermod -aG docker jenkins

# Instalacja AWS CLI
RUN curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip" && unzip awscliv2.zip && ./aws/install

# Instalacja docker engine
RUN curl -fsSL https://get.docker.com/ | sh

# Instalacja docker-compose
RUN curl -L "https://github.com/docker/compose/releases/download/1.29.2/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose && chmod +x /usr/local/bin/docker-compose

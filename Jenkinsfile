node{
    stage('SCM Checkout'){
    git 'https://github.com/akshaymahajan855/my-new-project.git'
    }
    stage('Compile-Package'){
    bat 'mvn clean verify'
    }
}

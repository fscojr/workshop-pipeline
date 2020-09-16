node('maven') {
   stages {
        stage('Build') { 
            steps {
                echo 'Test'
            }
        }
        stage('Test') { 
            steps {
                 echo 'Test1'
            }
        }
        stage('Deploy') { 
            steps {
                echo 'Test2'
            }
        }
    }
}

node('maven') {
    stage('build') {
        echo 'building app :)'
        openshiftBuild(buildConfig: 'casa', showBuildLogs: 'true')
    }
    stage('verify') {
        echo 'dummy verification....'
    }
    stage('deploy') {
        input 'Manual Approval'
        openshiftDeploy(deploymentConfig: 'casa')
    }
    stage('promoting to QA') {
       echo 'fake stage...'
       sleep 5 
    }
}

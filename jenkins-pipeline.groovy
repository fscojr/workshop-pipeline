node('master') {
    checkout scm
    stage('approval') {
        timeout(time: 30, unit: 'DAYS') {
                input message: "Start first rollout ?"
            }
    }
    stage('first rollout') {    
    openshift.withCluster( 'mycluster' ) {
    echo "Hello from ${openshift.cluster()}'s default project: ${openshift.project()}"

    // But we can easily change project contexts
    openshift.withProject( 'another-project' ) {
        echo "Hello from a non-default project: ${openshift.project()}"
    }

    // And even scope operations to other clusters within the same script
    openshift.withCluster( 'myothercluster' ) {
        echo "Hello from ${openshift.cluster()}'s default project: ${openshift.project()}"
    }
}
}
}

timeout(300) {
    node('docker') {
        stage('Checkout') {
            checkout scm
        }
        stage('Running tests') {
            sh "mvn test -X -DincludeTags=${TAGS}"
        }
        stage('Publisher allure') {
            allure([
                    includeProperties: false,
                    jdk              : '',
                    properties       : [],
                    reportBuildPolicy: 'ALWAYS',
                    results          : [[path: 'target/allure-results']]
            ])
        }
    }
}

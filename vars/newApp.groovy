def uber(String repourl){
    pipeline{
        agent any
        stages{
            stage('1-build'){
                steps{
                    sh "free -g"
                }
            }
            stage('checkout code'){
                steps{
                     branch: 'main',
                        url: "${repourl}"
                }
            }
            stage('closing'){
                steps{
                    echo "new demo"
                }
            }
        }
    }
}
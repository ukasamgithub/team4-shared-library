def uber(String repourl){
    pipeline{
        agent any
        stages{
            stage('1-build'){
                sh "free -g"
            }
        }
        stages{
            stage('checkout code'){
                steps{
                    git branch: 'main',
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

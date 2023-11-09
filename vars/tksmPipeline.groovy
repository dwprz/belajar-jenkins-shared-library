def call (Map config) {
    if (config.type == "Maven") {
        mavenPipeline()
    } else {
        pipeline{
            agent any
            stages{
                stage("Unsuported Pipeline") {
                    steps{
                      script{
                        echo("Unsuported Pipeline")
                      }
                    }
                }
            }
        }

    }
}
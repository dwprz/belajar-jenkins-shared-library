def call () {
    pipeline{
        agent any
        stages{
            stage("Maven Clean") {
                steps{
                    maven(["clean"])
                }
            }
            stage("Maven Compile") {
                steps{
                    maven(["compile"])
                }
            }
            stage("Maven Test") {
                steps{
                    maven(["test"])
                }
            }
        }       
    }
}
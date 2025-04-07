def call ( String dockerhubuser , String Project, String ProjectTag  ) {
  withCredentials([usernamePassword(credentialsId: 'dockerHub', usernameVariable: 'dockerhubuser', passwordVariable: 'dockerhubpass')]) {
      sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
  }
  sh "docker push ${dockerhubuser}/${Project}:${ProjectTag}"
}

def call ( String DockerHubUser , String ProjectName , String ProjectTag  ) {
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ProjectTag} ."
}

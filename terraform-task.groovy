node{
    stage("Pull Repo"){
        git branch: 'solution', url: 'https://github.com/ikambarov/terraform-task.git'
        
    }
}
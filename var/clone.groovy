def call(String url, String branch){
                echo "This is cloniing the Code"
                git url:"${url}",branch:"${branch}"
                echo "code cloning successfully"
}

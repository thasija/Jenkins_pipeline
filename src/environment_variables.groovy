/**
 * Created by thasija on 08/12/18.
 */



node {
    stage ("Print the Environment variable") {
        echo "${env.JOB_NAME}"
    }
}
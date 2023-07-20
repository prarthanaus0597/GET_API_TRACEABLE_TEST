// to switch to docker environment 
eval $(minikube docker-env)
// compile package the 
mvn clean install in maven 
//build docker image 
docker build -t patient_service:1.0 .
// check the docker image created 
docker images

// run k8s files 
kubectl apply -f mysql-secret.yaml
kubectl apply -f mysql-configMap.yaml 
kubectl apply -f db-deployment.yaml 
kubectl apply -f app-deployment.yaml

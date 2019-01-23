var app = angular.module('UsuarioApp',[]);
app.controller('ctrllogin', function($scope, $http)
{
    
    $scope.inicio = function(){
        $http.get("http://localhost:8080/hola/{id}")
        .then(function(respuesta){
            console.log( respuesta );
            $scope.canciones = respuesta.data;
            $scope.duracionTotal = 0;
            for( indice in $scope.canciones ){
                //$scope.duracionTotal = $scope.duracionTotal + $scope.canciones[indice].duracion ;
}
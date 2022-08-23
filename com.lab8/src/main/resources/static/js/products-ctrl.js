var app = angular.module("myapp", []);
app.controller("myctrl", function($scope, $http) {
	$scope.items = [];
	$scope.cates = [];
	$scope.form = {};
	
	$scope.initialize = function() {
		$http.get("/rest/product").then(resp => {
			$scope.items = resp.data;
		})
	}
	$scope.initialize();
	
	$scope.reset = function() {
		$scope.form = {
			id:'',
			name:''
		};
	}
	
	$scope.edit = function(item) {
		$scope.form = angular.copy(item);
	}
	
	$scope.create = function() {
		var item = angular.copy($scope.form);
		$http.post(`/rest/product`, item).then(resp =>{
			$scope.items.push(resp.data);
			$scope.reset();
			alert("Thêm mới thành công");
		}).catch(error => {
			alert("Lỗi thêm mới");
			console.log("Error", error);
		})
	}
	
	$scope.update = function() {
		var item = angular.copy($scope.form);
		$http.put(`/rest/product/${item.id}`, item).then(resp =>{
			var index = $scope.items.findIndex(p => p.id == item.id);
			$scope.items[index] = item;
			alert("Cập nhật thành công");
		}).catch(error => {
			alert("Lỗi cập nhật");
			console.log("Error", error);
		})
	}
	
	$scope.delete = function(item) {
		$http.delete(`/rest/product/${item.id}`, item).then(resp =>{
			var index = $scope.items.findIndex(p => p.id == item.id);
			$scope.items.splice(index, 1);
			$scope.reset();
			alert("Xóa sản phẩm thành công");
		}).catch(error => {
			alert("Lỗi xóa sản phẩm");
			console.log("Error", error);
		})
	}
})
/**
 * MyMap 생성자로 사용될 함수를 구현
 */
function MyMap(){
	var map = new Map();
	
	MyMap.prototype.put = function(key, value){
		map.set(key, value);
	}
	
	MyMap.prototype.size = function(){
		return map.size;
	}
	
	MyMap.prototype.get = function(key){
		return map.get(key);
	}
	
	MyMap.prototype.remove = function(key){
		map.delete(key);
	}
	
	MyMap.prototype.clear = function(){
		map.clear();
	}
}

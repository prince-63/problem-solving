int upperBound(vector<int> &arr, int x, int n){
	
	for(int i = n - 1; i >= 0; i--) {
		
		if(arr[i] <= x) return i + 1;

	}
	
}
int searchInsert(vector<int>& arr, int m)
{
	// int i;
	// for(i = 0; i < arr.size(); i++) {
		
	// 	if(arr[i] == m) {
	// 		return i;
	// 	}

	// 	if(arr[i] > m) {
	// 		return i;
	// 	}
	// }
	// return i;

	return upper_bound(arr.begin(),arr.end(),m)-arr.begin();
}
int findDuplicate(vector<int> &arr) 
{
    int n = arr.size();
    int nThsum = n * (n - 1) / 2;
    int sum = 0;
    
    for(int i = 0; i < n; i++) {
        sum = sum + arr[i];
    }

    if(sum == nThsum) {
        return -1;
    }
    return sum - nThsum;
}
#include <bits/stdc++.h> 
using namespace std;

int firstOccurrence(vector<int> &arr, int n, int k) {
    int left = 0, right = n - 1;
    int result = -1;
    
    while (left <= right) {
        int mid = left + (right - left) / 2;
        
        if (arr[mid] == k) {
            result = mid;
            right = mid - 1;  // Look in the left half for first occurrence
        } else if (arr[mid] < k) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    
    return result;
}

int lastOccurrence(vector<int> &arr, int n, int k) {
    int left = 0, right = n - 1;
    int result = -1;
    
    while (left <= right) {
        int mid = left + (right - left) / 2;
        
        if (arr[mid] == k) {
            result = mid;
            left = mid + 1;  // Look in the right half for last occurrence
        } else if (arr[mid] < k) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    
    return result;
}

pair<int, int> firstAndLastPosition(vector<int>& arr, int n, int k) {
    int first = firstOccurrence(arr, n, k);
    int last = lastOccurrence(arr, n, k);
    pair<int, int> ans(first, last);
    return ans;
}
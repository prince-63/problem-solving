#include <bits/stdc++.h>
using namespace std;

void printArray(int arr[], int n)
{
    for(int i = 0; i < n; i++)
    {
        cout << arr[i] << " ";
    }cout << endl;
} 

void insertion_sort(int arr[], int n)
{
    for(int i = 0; i < n; i++)
    {
        int j = i;
        while(j > 0)
        {
            if(arr[j] < arr[j - 1])
            {
                swap(arr[j], arr[j - 1]);
            }
            j--;
        }
    }
}

void insertion_sort_recursive(int i, int n, int arr[])
{
    // base case
    if(i > n)
    {
        return;
    }

    int j = i;
    while(j > 0 && arr[j] < arr[j - 1])
    {
        swap(arr[j], arr[j - 1]);
        j--;
    }

    insertion_sort_recursive(i + 1, n, arr);
}

void insertionSort(int arr[], int n)
{
    int i = 0;
    insertion_sort_recursive(i, n, arr);
}

int main(void)
{
    int n;
    cin >> n;
    int arr[n];

    for(int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    printArray(arr, n);
    insertionSort(arr, n);
    printArray(arr, n);
    return 0;
}
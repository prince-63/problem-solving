#include <bits/stdc++.h>
using namespace std;

void reverseArr(int i, int j, int arr[], int size)
{
    if (i > j)
    {
        for (int i = 0; i < size; i++)
        {
            cout << arr[i] << " ";
        }
        cout << endl;

        return;
    }

    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    reverseArr(i + 1, j - 1, arr, size);
}

int main(void)
{
    int arr[] = {1, 2, 3, 4, 5, 6};

    int size = sizeof(arr) / sizeof(arr[0]);

    reverseArr(0, size - 1, arr, size);
    // // printing a array
    // for (int i = 0; i < size; i++)
    // {
    //     cout << arr[i] << " ";
    // }
    // cout << endl;

    // int i = 0;
    // int j = size - 1;
    // while (i < j)
    // {
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    //     i++;
    //     j--;
    // }

    // // printing a array
    // for (int i = 0; i < size; i++)
    // {
    //     cout << arr[i] << " ";
    // }
    // cout << endl;

    return 0;
}
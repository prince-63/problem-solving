#include <bits/stdc++.h>
using namespace std;

// int countMax(int v[])
// {
//     int max = 0;
//     int i = 0;
//     int size = sizeof(v) / sizeof(v[0]);

//     while(i < size)
//     {
//         if(v[i] > max)
//         {
//             max = v[i];
//         }
//     }
//     return max;
// }

int main(void)
{
    int n = 6;
    int arr[] = {10, 10, 10, 3, 3, 3};
    int size = sizeof(arr) / sizeof(arr[0]);

    map <int, int> mpp;

    for(int i = 0; i < size; i++)
    {
        mpp[arr[i]] += 1;
    }

    for(auto i : mpp)
    {
        cout << i.first << " " << i.second << endl;
    }
    return 0;
}
#include <bits/stdc++.h>
using namespace std;

int main(void)
{
    int n;
    cin >> n;

    int arr[n];

    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    // precompute 
    int hash[n] = {0};
    for(int i = 0; i < n; i++)
    {
        hash[arr[i]] += 1;
    }

    // feching
    cout << "1 apear : " << hash[1] << endl;

    return 0;
}
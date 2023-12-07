#include <bits/stdc++.h>
using namespace std;

vector<int> generateRows(int row)
{
    vector<int> store;
    long long count = 1;

    for (int j = 0; j <= row; j++)
    {
        if (row == 0 || j == 0)
        {
            count = 1;
            store.push_back(count);
        }
        else
        {
            count = count * (row - j + 1) / j;
            store.push_back(count);
        }
    }
    return store;
}

vector<vector<int>> pascalTriangle(int N)
{
    vector<vector<int>> ans;
    for (int i = 0; i < N; i++)
    {
        ans.push_back(generateRows(i));
    }
    return ans;
}
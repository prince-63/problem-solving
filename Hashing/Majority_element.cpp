#include <bits/stdc++.h>
using namespace std;

#include <bits/stdc++.h>

int majorityElement(vector<int> v)
{
    /*this code perform better but time coplaxity is more that why this code are not perfect*/
    // sort(v.begin(), v.end());

    // int frequency[v[v.size() - 1] + 1] = {0};

    // for (int i = 0; i < v.size(); i++)
    // {
    // 	frequency[v[i]] += 1;
    // }

    // int size = sizeof(frequency) / sizeof(frequency[0]);
    // int n = v.size() / 2;

    // for(int i = 0; i < size; i++)
    // {
    // 	if(n < frequency[i])
    // 	{
    // 		return i;
    // 	}
    // }

    // return 0;

    // using map function
    sort(v.begin(), v.end());
    map<int, int> mpp;

    for (int i = 0; i < v.size(); i++)
    {
        mpp[v[i]]++;
    }

    int n = v.size() / 2;
    for (auto it = mpp.begin(); it != mpp.end(); it++)
    {
        if (n < it->second)
        {
            return it->first;
        }
    }

    return 0;
}

int main()
{
    vector<int> v;
    // v.push_back(2);
    // v.push_back(2);
    // v.push_back(1);
    // v.push_back(3);
    // v.push_back(1);
    // v.push_back(1);
    // v.push_back(3);
    // v.push_back(1);
    // v.push_back(1);
    v.push_back(71);
    v.push_back(31);
    v.push_back(71);
    v.push_back(71);
    int ans = majorityElement(v);

    cout << ans << endl;

    return 0;
}
#include <bits/stdc++.h>
vector<vector<int>> triplet(int n, vector<int> &arr)
{
    // brute force oproch
    // set<vector<int>> st;

    // for(int i = 0; i < n; i++) {
    //     for(int j = i + 1; j < n; j++) {
    //         for(int k = j + 1; k < n; k++) {
    //             if(arr[i] + arr[j] + arr[k] == 0) {
    //                 vector<int> temp = {arr[i], arr[j], arr[k]};
    //                 sort(temp.begin(), temp.end());
    //                 st.insert(temp);
    //             }
    //         }
    //     }
    // }

    // vector<vector<int>> ans(st.begin(), st.end());

    // return ans;

    // better oproch
    // set<vector<int>> st;
    // for(int i = 0; i < n; i++) {
    //     set<int> hashSet;
    //     for(int j = i + 1; j < n; j++) {
    //         int value = -(arr[i] + arr[j]);
    //         if(hashSet.find(value) != hashSet.end()) {
    //             vector<int> temp = {arr[i], arr[j], value};
    //             sort(temp.begin(), temp.end());
    //             st.insert(temp);
    //         }
    //         hashSet.insert(arr[j]);
    //     }
    // }

    // vector<vector<int>> ans(st.begin(), st.end());
    // return ans;

    // optimal solution
    vector<vector<int>> ans;
    sort(arr.begin(), arr.end());
    for (int i = 0; i < n; i++)
    {
        if (i != 0 && arr[i] == arr[i - 1])
            continue;
        int j = i + 1;
        int k = n - 1;
        while (j < k)
        {
            int sum = arr[i] + arr[j] + arr[k];
            if (sum < 0)
            {
                j++;
            }
            else if (sum > 0)
            {
                k--;
            }
            else
            {
                vector<int> temp = {arr[i], arr[j], arr[k]};
                ans.push_back(temp);
                j++;
                k--;

                while (j < k && (arr[j] == arr[j - 1]))
                    j++;
                while (j < k && (arr[k] == arr[k + 1]))
                    k--;
            }
        }
    }
    return ans;
}

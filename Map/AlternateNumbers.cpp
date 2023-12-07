vector<int> alternateNumbers(vector<int> &a)
{

    /* Brute Force */
    // vector<int> negative;
    // vector<int> positive;
    // vector <int> ans;

    // for(int i = 0; i < a.size(); i++)
    // {
    //     if(a[i] > 0)
    //     {
    //         positive.push_back(a[i]);
    //     }
    //     else
    //     {
    //         negative.push_back(a[i]);
    //     }
    // }

    // int j = 0, k = 0;
    // for(int i = 0; i < a.size(); i++)
    // {
    //     if(i % 2 == 0)
    //     {
    //         ans.push_back(positive[j++]);
    //     }
    //     else
    //     {
    //         ans.push_back(negative[k++]);
    //     }
    // }

    // return ans;

    // optimal code
    vector<int> ans(a.size(), 0);
    int j = 0, k = 1;

    for (int i = 0; i < a.size(); i++)
    {
        if (a[i] > 0)
        {
            ans[j] = a[i];
            j += 2;
        }
        else
        {
            ans[k] = a[i];
            k += 2;
        }
    }
    return ans;
}
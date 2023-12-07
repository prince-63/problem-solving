vector<int> countFrequency(int n, int x, vector<int> &nums)
{
    int mapp[max(x, n)] = {0};
    vector<int> ans;

    for (int i = 0; i < nums.size(); i++)
    {
        mapp[nums[i]] += 1;
    }

    int j = 1;
    while (j <= n)
    {
        ans.push_back(mapp[j]);
        j++;
    }

    return ans;
}
int bestTimeToBuyAndSellStock(vector<int> &prices)
{
    // O(N) best time and space complaxity
    // int mini = prices[0];
    // int maxi = 0;

    // int i = 0;
    // for(int i = 0; i < prices.size(); i++)
    // {
    //     mini = min(mini, prices[i]);
    //     int profit = prices[i] - mini;
    //     maxi = max(maxi, profit);
    // }

    // return maxi;
    int size = prices.size();

    int store[size];
    store[size - 1] = prices[size - 1];
    for (int i = prices.size() - 2; i >= 0; i--)
    {
        if (store[i + 1] < prices[i])
        {
            store[i] = prices[i];
        }
        else
        {
            store[i] = store[i + 1];
        }
    }

    int ans[size];
    for (int i = 0; i < size; i++)
    {
        ans[i] = store[i] - prices[i];
    }

    int max = 0;
    for (int i = 0; i < size; i++)
    {
        if (max < ans[i])
        {
            max = ans[i];
        }
    }

    return max;
}

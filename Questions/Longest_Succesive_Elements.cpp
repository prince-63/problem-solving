
int longestSuccessiveElements(vector<int> &a)
{
    if (a.size() == 0)
        return 0;

    sort(a.begin(), a.end());
    int longest = 1;
    int lastSmallest = INT_MIN;
    int count = 1;
    for (int i = 0; i < a.size(); i++)
    {
        if (a[i] - 1 == lastSmallest)
        {
            lastSmallest = a[i];
            count++;
        }
        else if (lastSmallest != a[i])
        {
            lastSmallest = a[i];
            count = 1;
        }
        longest = max(longest, count);
    }

    return longest;
}
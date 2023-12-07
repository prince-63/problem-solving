void selectionSort(vector<int> &arr)
{

    int mini;

    for (int i = 0; i < arr.size() - 1; i++)
    {
        mini = i;
        for (int j = i + 1; j < arr.size(); j++)
        {
            if (arr[j] < arr[mini])
            {
                mini = j;
            }
        }

        swap(arr[i], arr[mini]);
    }
}
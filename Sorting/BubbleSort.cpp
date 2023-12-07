void bubbleSort(int *arr, int n)
{
    int loopRuns = 0;
    for (int i = n - 1; i >= 0; i--)
    {
        for (int j = 0; j <= i - 1; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                swap(arr[j], arr[j + 1]);
                loopRuns = 1;
            }
        }

        if (loopRuns != 1)
        {
            break;
        }
    }
}

int partitionArray(int input[], int start, int end)
{
    int pivot = input[start];
    int i = start;
    int j = end;

    while (i < j)
    {
        while (i <= end - 1)
        {
            if (input[i] <= pivot)
            {
                i++;
            }
        }

        while (j >= start + 1)
        {
            if (input[j] > pivot)
            {
                j--;
            }
        }
        if (i < j)
        {
            swap(input[i], input[j]);
        }
    }
    swap(input[start], input[j]);
    return j;
}

void quickSort(int input[], int start, int end)
{
    if (start < end)
    {
        int IndexPivot = partitionArray(input, start, end);
        quickSort(input, start, IndexPivot - 1);
        quickSort(input, IndexPivot + 1, end);
    }
}
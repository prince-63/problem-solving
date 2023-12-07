vector<int> nextGreaterPermutation(vector<int> &A)
{
    // next_permutation(A.begin(), A.end());
    // return A;

    int index = -1;
    for (int i = A.size() - 2; i >= 0; i--)
    {
        if (A[i] < A[i + 1])
        {
            index = i;
            break;
        }
    }

    if (index == -1)
    {
        reverse(A.begin(), A.end());
        return A;
    }

    for (int i = A.size() - 1; i > index; i--)
    {
        if (A[i] > A[index])
        {
            swap(A[i], A[index]);
            break;
        }
    }

    reverse(A.begin() + index + 1, A.end());

    return A;
}
#include <bits/stdc++.h>
using namespace std;

int sumOfN(int i)
{
    // base case
    if (i == 1)
    {
        return 1;
    }

    int sum = sumOfN(i - 1) + i;
    return sum;
}

void sumOfN_th(int i, int sum)
{
    if(i < 1)
    {
        cout << "sum is : " << sum << endl;
        return;
    }

    sumOfN_th(i - 1, sum + i);
}

int main(void)
{
    int num;
    cout << "Enter Num : ";
    cin >> num;

    // cout << "Sum of n-th num : " << num << " : " << sumOfN(num) << endl;
    sumOfN_th(num, 0);
    return 0;
}
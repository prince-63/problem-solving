#include <bits/stdc++.h>
using namespace std;

int fact(int i)
{
    // base case
    if (i == 1)
    {
        return 1;
    }

    return fact(i - 1) * i;
}

void facto(int i, int f)
{
    if(i < 1)
    {
        cout << "factorial is : " << f << endl;
        return;
    }

    facto(i - 1, i * f);
}

int main(void)
{
    int num;
    cout << "Enter Num : ";
    cin >> num;

    // cout << "factorial of n-th num : " << num << " : " << fact(num) << endl;
    facto(num, 1);
    return 0;
}
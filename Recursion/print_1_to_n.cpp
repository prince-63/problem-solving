#include <bits/stdc++.h>
using namespace std;

void printNum(int i, int n)
{
    // base case
    if(i > n)
    {
        return;
    }

    cout << i << endl;
    printNum(i + 1, n);
}

int main(void)
{
    int num;
    cout << "Enter Num : ";
    cin >> num;
    printNum(1, num);
    return 0;
}
#include <bits/stdc++.h>
using namespace std;

void printName(int i)
{
    // base case
    if(i < 1)
    {
        return;
    }

    cout << "Hello World" << endl;
    printName(i - 1);
}

int main(void)
{
    int num;
    cout << "Enter Num : ";
    cin >> num;
    printName(num);
    return 0;
}
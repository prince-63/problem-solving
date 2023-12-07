#include <bits/stdc++.h>
using namespace std;

// void printNum(int i)
// {
//     // base case
//     if(i < 1)
//     {
//         return;
//     }

//     cout << i << endl;
//     printNum(i - 1);
// }

// backtracking
void printNum(int i)
{
    if(i < 1)
    {
        return;
    }

    printNum(i - 1);
    cout << i << endl;
}

int main(void)
{
    int num;
    cout << "Enter Num : ";
    cin >> num;
    printNum(num);
    return 0;
}
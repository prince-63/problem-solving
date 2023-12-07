#include <bits/stdc++.h>
using namespace std;

int fibbo(int n)
{
    if(n <= 1)
    {
        return n;
    }

    int first = fibbo(n - 1);
    int sfirst = fibbo(n - 2);
    return first + sfirst;
} 

int main(void)
{
    cout << fibbo(5) << endl;
    return 0;
}
#include <bits/stdc++.h>
using namespace std;
 
int main(void)
{
    string s;
    cin >> s;

    // pre compute
    // int hash[26] = {0};
    // for (int i = 0; i < s.size(); i++)
    // {
    //     hash[s[i] - 'a']++;
    // }

    // cout << "a is apear : " << hash[0] << endl;

    
    // pre compute
    int hash[256] = {0};
    for (int i = 0; i < s.size(); i++)
    {
        hash[s[i]]++;
    }

    cout << "a is apear : " << hash['a'] << endl;
    return 0;
}
#include <bits/stdc++.h> 

int countVowels(string str, int start, int end) {
    int cnt = 0;
    for(int i = start; i <= end; i++) 
    {
        if(str[i] == 'a' || str[i] == 'A' || str[i] == 'e' || str[i] == 'E' || str[i] == 'i' || str[i] == 'I' || str[i] == 'o' || str[i] == 'O' || str[i] == 'u' || str[i] == 'U') 
        {
            cnt++;
        }
    }
    return cnt;
}

bool splitString(string &str){
    int end = str.length() - 1;
    int start = 0;
    int mid = start + (end - start) / 2;

    int firstMid = countVowels(str, start, mid);
    int lastMid = countVowels(str, mid + 1, end);

    if(firstMid == lastMid) 
    {
        return true;
    }
    else 
    {
        return false;
    }
}
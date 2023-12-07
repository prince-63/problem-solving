#include <bits/stdc++.h> 
bool checkPalindrome(string name)
{
    string newStr;
    for(int i = 0; i < name.length(); i++) {
        
        if((name[i] >= 'a' && name[i] <= 'z') || (name[i] >= 'A' && name[i] <= 'Z') || (name[i] >= 48 && name[i] <= 57)) {
            
            if(name[i] >= 'A' && name[i] <= 'Z') {
                newStr += (name[i] - 'A' + 'a');
            }
            else {
                newStr += name[i];
            }

        }

    }
    
    int flag = 0;
    int end = newStr.length() - 1;

    for(int i = 0; i <= end; i++) {
        
        if(newStr[i] != newStr[end]) {
            flag = 1;
            break;
        }
        end--;
    }

    if(flag == 1) {
        return false;
    }
    else {
        return true;
    }

}
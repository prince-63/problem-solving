#include <bits/stdc++.h> 
#include <iostream>
#include <cstring>
using namespace std;

int countWords(string input) {
    // vector<string> words;
	// stringstream ss(input);

	// string s;
	// while (ss >> s)
	// {
	// 	words.push_back(s);
	// }

    // return words.size();
    int n = input.length();
    int count = 1;
    for(int i=0;i<n-1;i++){
        if(input[i] == ' '){
            count++;
        }
    }
    return count;
}

int main() {
    string input;
    getline(cin, input);
    int output = countWords(input);
    cout << output << endl;
    return 0;
}
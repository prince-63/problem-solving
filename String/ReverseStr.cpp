#include <bits/stdc++.h> 
string reverseString(string str)
{	
	// brute force but not a optimal
	// string s;

	// int len = str.length();

	// for(int i = len - 1; i >= 0; i--)
	// {
	// 	s.push_back(str[i]);
	// }

	// return s;

	int len = str.length();

	for(int i = 0, j = len - 1; i < j; i++, j--) 
	{
		int temp = str[i];
		str[i] = str[j];
		str[j] = temp;
	}

	return str;
}
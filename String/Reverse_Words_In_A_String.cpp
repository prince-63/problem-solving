#include <bits/stdc++.h>
using namespace std;

string reverseString(string &str)
{

	vector<string> words;
	stringstream ss(str);

	string s;
	while (ss >> s)
	{
		words.push_back(s);
	}

	//cout << "words " << words[1] << endl;

	string ans;
	for (int i = words.size() - 1; i >= 0; i--)
	{

		if (i != words.size() - 1)
		{
			ans += ' ';
		}

		ans += words[i];
	}

	return ans;
};

int main()
{
	string name = "myself prince";

	cout << reverseString(name) << endl;
}
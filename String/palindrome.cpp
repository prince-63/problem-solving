bool isPalindrome(string &s)
{
	int flag = 0;
	int len = s.length() - 1;

	for(int i = 0; i <= len / 2; i++)
	{
		if(s[i] != s[len - i]) {
			flag = 1;
			break;
		}
	}

	if(flag == 1) return false;
	return true;
}